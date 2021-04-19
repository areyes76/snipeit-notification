package cl.argacme.snipeit.web;

import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import cl.argacme.snipeit.model.Assets;
import cl.argacme.snipeit.model.Checkout;
import cl.argacme.snipeit.repository.AssetsRepository;
import cl.argacme.snipeit.service.CheckoutService;
import cl.argacme.snipeit.service.EmailService;

@RestController
@RequestMapping("/api")
public class CheckoutController extends AbstractController{
	private final Logger log = LoggerFactory.getLogger(CheckoutController.class);
	
	@Autowired
 	public CheckoutController(AssetsRepository assetsRepository,EmailService emailService,CheckoutService checkoutService) {
		this.assetsRepository = assetsRepository;
		this.emailService = emailService;
		this.checkoutService = checkoutService; 
	}

    @GetMapping("/checkout")
    Collection<Assets> asset() {
    	log.info("BUSCANDO TODOS.....");
        return assetsRepository.findAll();
    }
    
    @GetMapping("/checkout/{id}")
    ResponseEntity<?> getAssets(@PathVariable Integer id) {
    	log.info("BUSCANDO USER: " + id);
        Optional<Assets> asset = assetsRepository.findById(id);
        return asset.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping(path = "/checkout",
    		produces = MediaType.APPLICATION_JSON_VALUE,
    	    consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Checkout> createAsset(@Validated @RequestBody(required = false) Checkout checkout) throws URISyntaxException, JsonProcessingException {
        log.info("Request para crear license: {}", checkout);
        ObjectMapper mapper = new ObjectMapper();
        log.info(mapper.writeValueAsString(checkout));
        if(checkout!=null) {
        	checkout.setMachine(checkout.getMachine().replace(" " , ""));
        	if(checkoutService.isMacAddress(checkout)) {
        		HashMap<String, Object> map = checkoutService.isLicence(checkout);
        		if(map!=null)
        			this.emailService.sendMailInfo(map);
        		else
        			log.info("NO ENVIO CORREO");        			
        	}else {
        		this.emailService.sendMailMachine(checkout);
        	}
        }
        return new ResponseEntity<Checkout>(checkout,HttpStatus.OK);
    }
/*    
    @PostMapping("/checkout")
    ResponseEntity<Checkout> createAssetWin(MultiValueMap<?, ?> paramMap,@RequestParam Map<String, String> params, @RequestHeader HttpHeaders httpHeaders) throws URISyntaxException, JsonProcessingException {
        log.info("Request para crear params: {}", params);
        log.info("Request para crear HttpHeaders: {}", httpHeaders);

        return null;
    }
*/
}
