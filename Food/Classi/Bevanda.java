package Classi;

import java.util.Date;

public class Bevanda extends Prodotto {
	
	private String BevandeTipo;
	
	public Bevanda(String nome, double prezzo, String codiceSeriale, String descrizione, Date scadenzaProdotto, String bevandeTipo, String bevandeDescrizione, double bevandeCosto) {
		super(nome, prezzo, codiceSeriale, descrizione, scadenzaProdotto);
		BevandeTipo = bevandeTipo;
	}
	
	
	public String getBevandeTipo() {
		return BevandeTipo;
	}

	
	public void setBevandeTipo(String bevandeTipo) {
		BevandeTipo = bevandeTipo;
	}

	
	
	
	
	
}
