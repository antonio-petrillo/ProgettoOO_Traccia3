package Classi;

import java.util.Date;

public class Cibo extends Prodotto {
	
	private String categoria;

	public Cibo(String nome, double prezzo, int codiceSeriale, String descrizione, Date scadenzaProdotto, String pathFoto, String categoria) {
		super(nome, prezzo, codiceSeriale, descrizione, scadenzaProdotto, pathFoto);
		this.categoria = categoria;
	}

}
