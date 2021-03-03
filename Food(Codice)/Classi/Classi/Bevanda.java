package Classi;

import java.util.Date;

public class Bevanda extends Prodotto {
	
	private String bevandeTipo;
	
	public Bevanda(String nome, double prezzo, String codiceSeriale, String descrizione, Date scadenzaProdotto, String bevandeTipo, String bevandeDescrizione, double bevandeCosto) {
		super(nome, prezzo, codiceSeriale, descrizione, scadenzaProdotto);
		this.bevandeTipo = bevandeTipo;
	}
	
	
	public String getBevandeTipo() {
		return bevandeTipo;
	}

	
	public void setBevandeTipo(String bevandeTipo) {
		this.bevandeTipo = bevandeTipo;
	}


	
}
