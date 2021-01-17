package Classi;

import java.util.ArrayList;
import java.util.Date;

public class Ordine {

	private String Nome;
	private String Prodotto[];
	private double Prezzo;
	private boolean Stato;
	private Date Data;
	private ArrayList<Utente> utente;
	private Rider rider;
	private Ordine GestitoDaRistorante;
	private Rider PossiedeOrdine;


	
	
	public Ordine(String nome, String[] prodotto, double prezzo, boolean stato, Date data, ArrayList<Utente> utenti,
			Rider rider) {
		this.Nome = nome;
		this.Prodotto = prodotto;
		this.Prezzo = prezzo;
		this.Stato = stato;
		this.Data = data;
		this.rider = rider;
	}

	public String getNome() {
		return Nome;
	}
	
    public void setNome(String nome) {
		Nome = nome;
	}
	
    public String[] getProdotto() {

		return Prodotto;
	}
	
    public void setProdotto(String[] prodotto) {
		Prodotto = prodotto;
	}
	
     public double getPrezzo() {
		return Prezzo;
	}
     
	public void setPrezzo(double prezzo) {

		Prezzo = prezzo;
	}
	
	public boolean isStato() {


		return Stato;
	}
	
	public void setStato(boolean stato) {

		Stato = stato;
	}
	
	public Date getData() {


		return Data;
	}
	
	public void setData(Date data) {

		Data = data;
	}
	
	public ArrayList<Utente> getUtenti() {


		return utente;
	}
	
	public void setUtenti(ArrayList<Utente> utenti) {

		this.utente = utenti;
	}
	
	public Rider getRider() {

		return rider;
	}
	
	public void setRider(Rider rider) {

		this.rider = rider;
	}

	public Ordine getGestitoDaRistorante() {
		return GestitoDaRistorante;
	}

	public void setGestitoDaRistorante(Ordine gestitoDaRistorante) {
		GestitoDaRistorante = gestitoDaRistorante;
	}

	public Rider getPossiedeOrdine() {
		return PossiedeOrdine;
	}

	public void setPossiedeOrdine(Rider possiedeOrdine) {
		PossiedeOrdine = possiedeOrdine;
	}

	
}
