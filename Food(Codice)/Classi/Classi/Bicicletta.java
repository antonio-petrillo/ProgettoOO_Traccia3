package Classi;

import java.util.Date;

public class Bicicletta implements Veicolo {
	
	private Date annoMatricolazioneBicicletta;
	private String marcaBiciletta;
	private String modelloBicicletta;
	
	public Bicicletta(Date annoMatricolazioneBicicletta, String marcaBiciletta, String modelloBicicletta) {
		this.annoMatricolazioneBicicletta  = annoMatricolazioneBicicletta;
		this.marcaBiciletta = marcaBiciletta;
		this.modelloBicicletta = modelloBicicletta;
	}

	public Date getAnnoMatricolazioneBicicletta() {
		return annoMatricolazioneBicicletta;
	}

	public void setAnnoMatricolazioneBicicletta(Date annoMatricolazioneBicicletta) {
		this.annoMatricolazioneBicicletta = annoMatricolazioneBicicletta;
	}

    public String getMarcaBiciletta() {
		return marcaBiciletta;
	}

    public void setMarcaBiciletta(String marcaBiciletta) {
		this.marcaBiciletta = marcaBiciletta;
	}

    public String getModelloBicicletta() {
		return modelloBicicletta;
	}

    public void setModelloBicicletta(String modelloBicicletta) {
		this.modelloBicicletta = modelloBicicletta;
	}

}
