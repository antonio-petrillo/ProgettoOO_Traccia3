package Classi;

import java.util.Date;

public class Moto implements Veicolo {
	
	private Date annoMatricolazioneMoto;
	private String marcaMoto;
	private String modelloMoto;
	
	public Moto(Date annoMatricolazioneMoto, String marcaMoto, String modelloMoto) {
		this.annoMatricolazioneMoto = annoMatricolazioneMoto;
		this.marcaMoto = marcaMoto;
		this.modelloMoto = modelloMoto;
	}

	public Date getAnnoMatricolazioneMoto() {
		return annoMatricolazioneMoto;
	}

	public void setAnnoMatricolazioneMoto(Date annoMatricolazioneMoto) {
		this.annoMatricolazioneMoto = annoMatricolazioneMoto;
	}

	public String getMarcaMoto() {
		return marcaMoto;
	}

	public void setMarcaMoto(String marcaMoto) {
		this.marcaMoto = marcaMoto;
	}

	public String getModelloMoto() {
		return modelloMoto;
	}

	public void setModelloMoto(String modelloMoto) {
		this.modelloMoto = modelloMoto;
	}
	

}
