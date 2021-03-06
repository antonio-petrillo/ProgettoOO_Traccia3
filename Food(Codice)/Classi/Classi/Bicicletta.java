package Classi;

import java.util.Date;

public class Bicicletta implements Veicolo {
	
	private Date annoMatricolazioneBicicletta;
	private String marcaBiciletta;
	private String modelloBicicletta;
	private int codiceSeriale;

	public Bicicletta(int codiceSeriale) {
		this.codiceSeriale = codiceSeriale;
	}
	
}
