package Classi;

import java.util.Date;

public class Moto implements Veicolo {
	
	private Date annoMatricolazioneMoto;
	private String marcaMoto;
	private String modelloMoto;
	private int codiceSeriale;
	
	public Moto(int codiceSeriale) {
		this.codiceSeriale = codiceSeriale;
	}
	
}
