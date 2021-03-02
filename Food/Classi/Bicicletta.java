package Classi;

import java.util.Date;

public class Bicicletta implements Veicolo {
	
	private Date AnnoMatricolazioneBicicletta;
	private String MarcaBiciletta;
	private String ModelloBicicletta;
	
	public Bicicletta(Date annoMatricolazioneBicicletta, String marcaBiciletta, String modelloBicicletta) {
		super();
		AnnoMatricolazioneBicicletta = annoMatricolazioneBicicletta;
		MarcaBiciletta = marcaBiciletta;
		ModelloBicicletta = modelloBicicletta;
	}

	
	public Date getAnnoMatricolazioneBicicletta() {
		return AnnoMatricolazioneBicicletta;
	}

	
	public void setAnnoMatricolazioneBicicletta(Date annoMatricolazioneBicicletta) {
		AnnoMatricolazioneBicicletta = annoMatricolazioneBicicletta;
	}

	
    public String getMarcaBiciletta() {
		return MarcaBiciletta;
	}

	
    public void setMarcaBiciletta(String marcaBiciletta) {
		MarcaBiciletta = marcaBiciletta;
	}

	
    public String getModelloBicicletta() {
		return ModelloBicicletta;
	}

	
    public void setModelloBicicletta(String modelloBicicletta) {
		ModelloBicicletta = modelloBicicletta;
	}

}
