package cl.argacme.snipeit.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.argacme.snipeit.model.Assets;
import cl.argacme.snipeit.model.Checkout;
import cl.argacme.snipeit.model.LicenseSeats;
import cl.argacme.snipeit.model.Licenses;
import cl.argacme.snipeit.repository.AssetsRepository;
import cl.argacme.snipeit.repository.LicenseSeatsRepository;
import cl.argacme.snipeit.repository.LicensesRepository;

@Service
public class CheckoutService {
	private final Logger log = LoggerFactory.getLogger(CheckoutService.class);
	private AssetsRepository assetsRepository;
	private LicensesRepository licensesRepository;
	private LicenseSeatsRepository licenseSeatsRepository;
	
	@Autowired
	public CheckoutService(AssetsRepository assetsRepository,LicensesRepository licensesRepository,
			LicenseSeatsRepository licenseSeatsRepository){
		this.assetsRepository = assetsRepository;	
		this.licensesRepository = licensesRepository;
		this.licenseSeatsRepository = licenseSeatsRepository;
	}
	
	/**
	 * Metodo que verifica si la maquina existe en el inventario de la empresa
	 * @param checkout
	 * @return
	 */
	public boolean isMacAddress(Checkout checkout) {
		this.get(checkout);
		if(checkout.getMacaddress()!=null && checkout.getMacaddress().length>0) {
    		Assets assets = assetsRepository.findByName(checkout.getMachine());
    		if(assets!=null) {    			
    			for (String macaddress : checkout.getMacaddress()) {
    				Assets assetsMacAddres =assetsRepository.findBySnipeitMacAddress1(macaddress);
    				if(assetsMacAddres!=null && assetsMacAddres.getId().equals(assets.getId())) {
    					checkout.setIdMachine(assets.getId());
    					checkout.setIdUser(assets.getAssignedTo());
    					String[] s = new String[1];
    					s[0]=macaddress;
    					checkout.setMacaddress(s);
    					return true;
    				}
				}
    		}else
    			return false;
    	}
		return false;
	}

	/**
	 * 
	 * @param checkout
	 * @return
	 */
	public HashMap<String, Object> isLicence(Checkout checkout) {
		
		if(checkout.getLicenses()!=null && checkout.getLicenses().length>0) {
			HashMap<String, Object> map = new HashMap<>(); 
			List<String> listLicense = new ArrayList<String>();
			List<String> listNoLicense = new ArrayList<String>();
			for (String name : checkout.getLicenses()) {
				Licenses licenses =  licensesRepository.findByName(name);		
				log.info("name=" +name);
				if( licenses!=null ) {
					log.info(licenses.toString());
					LicenseSeats ls = licenseSeatsRepository.findByLicenseIdAndAssignedTo(licenses.getId(), checkout.getIdUser());
					if(ls==null) 
						listLicense.add(name);
					else
						log.info(ls.toString());
				}else {
					listNoLicense.add(name);
				}
			}
			map.put("checkout", checkout);
			map.put("software", listLicense);
			map.put("NoSoftware", listNoLicense);
			return map;
		}
		return null;
	}

	public void get(Checkout checkout) {
		if(checkout.getLicenses()!=null && checkout.getLicenses().length>1) {	
			ArrayList<String> lista = new ArrayList<>(Arrays.asList(checkout.getLicenses()));
			lista.remove(0);
			String[] s = new String[lista.size()];
			checkout.setLicenses(lista.toArray(s));
		}
		if(checkout.getMacaddress()!=null && checkout.getMacaddress().length>1) {	
			ArrayList<String> lista = new ArrayList<>(Arrays.asList(checkout.getMacaddress()));
			lista.remove(0);
			lista.remove("00:00:00:00:00:00");
			String[] s = new String[lista.size()];
			checkout.setMacaddress(lista.toArray(s));
		}
		
	}
	
}
