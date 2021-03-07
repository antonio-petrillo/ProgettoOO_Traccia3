package Classi;

import java.util.ArrayList;
import java.util.HashMap;

public class Ristorante {
	
	private String nome;
	private String descrizione;
	private String numeroTelefonico;
    private ArrayList<Rider> riders;
	private Indirizzo indirizzo;
	private int codiceRistorante;
	public int getCodiceRistorante() {
		return codiceRistorante;
	}

	private ArrayList<Prodotto> prodottiInVendita;
	private HashMap<Prodotto, Integer> quantitaProdotto;

	public Ristorante(String nome, int codiceRistorante) {
		this.nome = nome;
		this.codiceRistorante = codiceRistorante;
		this.riders = new ArrayList<Rider>();
		this.prodottiInVendita = new ArrayList<Prodotto>();
		this.quantitaProdotto = new HashMap<Prodotto, Integer>();
	}
	
	public Ristorante(Integer codiceRistorante) {
		this.codiceRistorante = codiceRistorante;
		this.riders = new ArrayList<Rider>();
	}

	public Ristorante(String nome, int codiceRistorante, ArrayList<Rider> riders, ArrayList<Prodotto> merce, HashMap<Prodotto, Integer> quantitaProdotto) {
		this.nome = nome;
		this.codiceRistorante = codiceRistorante;
		this.riders = riders;
		this.prodottiInVendita = merce;
		this.quantitaProdotto = quantitaProdotto; 
	}

	public ArrayList<Rider> getRiders() {
		return riders;
	}

	public HashMap<Prodotto, Integer> getQuantitaProdotto() {
		return quantitaProdotto;
	}

	public String getNome() {
		return nome;
	}

	public void setRiders(ArrayList<Rider> riders) {
		this.riders = riders;
	}

}
