package Classi;

import java.util.Date;

public class Cibo extends Prodotto {
	
	private String CiboTipo;
	
	public Cibo(String nome, double prezzo, String codiceSeriale, String descrizione, Date scadenzaProdotto,
			String ciboTipo, String ciboDescrizione, double ciboTipoCosto) {
		super(nome, prezzo, codiceSeriale, descrizione, scadenzaProdotto);
		CiboTipo = ciboTipo;
		
	}

	
	public String getCiboTipo() {
		return CiboTipo;
	}

	
	public void setCiboTipo(String ciboTipo) {
		CiboTipo = ciboTipo;
	}

	
	
}
