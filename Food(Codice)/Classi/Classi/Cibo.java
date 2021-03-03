package Classi;

import java.util.Date;

public class Cibo extends Prodotto {
	
	private String nomeCibo;
	private String posizioneRistorante;
	private double costo;

	public Cibo(String nome, double prezzo, String codiceSeriale, String descrizione, Date scadenzaProdotto,
			String nomeCibo, String posizioneRistorante, double costo) {
		super(nome, prezzo, codiceSeriale, descrizione, scadenzaProdotto);
		this.nomeCibo = nomeCibo;
		this.posizioneRistorante = posizioneRistorante;
		this.costo = costo;
	}


	public String getNomeCibo() {
		return nomeCibo;
	}

	
	public void setNomeCibo(String nomeCibo) {
		this.nomeCibo = nomeCibo;
	}


	public String getPosizioneRistorante() {
		return posizioneRistorante;
	}

	public void setPosizioneRistorante(String posizioneRistorante) {
		this.posizioneRistorante = posizioneRistorante;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

}
