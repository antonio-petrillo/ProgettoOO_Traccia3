package Classi;

import java.util.Date;

public class Moto implements Veicolo {
	
	private Date AnnoMatricolazioneMoto;
	private String MarcaMoto;
	private String ModelloMoto;
	
	public Moto(Date annoMatricolazioneMoto, String marcaMoto, String modelloMoto) {
		super();
		AnnoMatricolazioneMoto = annoMatricolazioneMoto;
		MarcaMoto = marcaMoto;
		ModelloMoto = modelloMoto;
	}

	public Date getAnnoMatricolazioneMoto() {
		return AnnoMatricolazioneMoto;
	}

	public void setAnnoMatricolazioneMoto(Date annoMatricolazioneMoto) {
		AnnoMatricolazioneMoto = annoMatricolazioneMoto;
	}

	public String getMarcaMoto() {
		return MarcaMoto;
	}

	public void setMarcaMoto(String marcaMoto) {
		MarcaMoto = marcaMoto;
	}

	public String getModelloMoto() {
		return ModelloMoto;
	}

	public void setModelloMoto(String modelloMoto) {
		ModelloMoto = modelloMoto;
	}
	
	
	
	

}
