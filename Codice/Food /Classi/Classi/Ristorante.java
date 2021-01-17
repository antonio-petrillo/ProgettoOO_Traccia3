package Classi;

import java.util.ArrayList;

public class Ristorante {
	
	private String Nome;
	private String Categoria;
	private String Descrizioni;
	private String NumeroTelefonico;
	private String Citta;
	private Indirizzo indirizzo;
	private Magazzino magazzino;
	private ArrayList<Rider> rider;

	
	
 	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getCategoria() {
		return Categoria;
	}
	
	public void setCategoria(String categoria) {
		Categoria = categoria;
	}
	
	public String getDescrizioni() {
		return Descrizioni;
	}
	
	public void setDescrizioni(String descrizioni) {
		Descrizioni = descrizioni;
	}
	
	public String getNumeroTelefonico() {
		return NumeroTelefonico;
	}
	
	public void setNumeroTelefonico(String numeroTelefonico) {
		NumeroTelefonico = numeroTelefonico;
	}
	
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public String getCitta() {
		return Citta;
	}
	
	public void setCitta(String citta) {

		Citta = citta;
	}

	
	public Ristorante(String nome, String categoria, String descrizioni, String numeroTelefonico, Indirizzo indirizzo,
			String citta) {

		this.Nome = nome;
		this.Categoria = categoria;
		this.Descrizioni = descrizioni;
		this.NumeroTelefonico = numeroTelefonico;
		this.indirizzo = indirizzo;
		this.Citta = citta;
	}

	
	public Magazzino getMagazzino() {
		return magazzino;
	}

	
	public void setMagazzino(Magazzino magazzino) {
		this.magazzino = magazzino;
	}

	

	public ArrayList<Rider> getRider() {
		return rider;
	}

	public void setRider(ArrayList<Rider> rider) {
		this.rider = rider;
	}
	
	
}
