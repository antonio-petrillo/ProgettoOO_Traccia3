package Classi;

import java.util.Date;

public class Cibo extends Prodotto {
	
	private String NomeCibo;
	private String PosizioneRistorante;
	private double costo;

	

	public Cibo(String nome, double prezzo, String codiceSeriale, String descrizione, Date scadenzaProdotto,
			String nomeCibo, String posizioneRistorante, double costo) {
		super(nome, prezzo, codiceSeriale, descrizione, scadenzaProdotto);
		NomeCibo = nomeCibo;
		PosizioneRistorante = posizioneRistorante;
		this.costo = costo;
	}


	public String getNomeCibo() {
		return NomeCibo;
	}

	
	public void setNomeCibo(String nomeCibo) {
		NomeCibo = nomeCibo;
	}


	public String getPosizioneRistorante() {
		return PosizioneRistorante;
	}


	public void setPosizioneRistorante(String posizioneRistorante) {
		PosizioneRistorante = posizioneRistorante;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	

	

	
	
}
