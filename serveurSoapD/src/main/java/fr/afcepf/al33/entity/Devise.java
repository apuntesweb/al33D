package fr.afcepf.al33.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Devise {

	@Id
	private String code; //EUR , USD , JPY , GBP, ...
	
	private String monnaie;
	
	private Double tauxChange;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMonnaie() {
		return monnaie;
	}

	public void setMonnaie(String monnaie) {
		this.monnaie = monnaie;
	}

	public Double getTauxChange() {
		return tauxChange;
	}

	public void setTauxChange(Double tauxChange) {
		this.tauxChange = tauxChange;
	} 

	
}
