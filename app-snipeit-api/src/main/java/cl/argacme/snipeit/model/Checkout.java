package cl.argacme.snipeit.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Checkout {
	private Integer idMachine; // ID de la maquina asignada en argacme.
	private Integer idUser; // ID del usuario poseedor de la maquina asignada por argacme.
	private String machine;
	private String os;
	private String[] macaddress;
	private String user;
	private String[] licenses;
	
	
	public String getMachine() {
		return machine;
	}
	public void setMachine(String machine) {
		this.machine = machine;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String[] getLicenses() {
		return licenses;
	}
	public void setLicenses(String[] licenses) {
		this.licenses = licenses;
	}
	public String[] getMacaddress() {
		return macaddress;
	}
	public void setMacaddress(String[] macaddress) {
		this.macaddress = macaddress;
	}
	public Integer getIdMachine() {
		return idMachine;
	}
	public void setIdMachine(Integer idMachine) {
		this.idMachine = idMachine;
	}
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
}
