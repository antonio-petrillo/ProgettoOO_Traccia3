package Classi;

import java.util.ArrayList;

public class Ristorante {
	
	private String nome;
	private String categoria;
	private String descrizioni;
	private String numeroTelefonico;
	private ArrayList<Magazzino> magazzini;
    private ArrayList<Rider> riders;
	private Indirizzo indirizzo;

 	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getDescrizioni() {
		return descrizioni;
	}
	
	public void setDescrizioni(String descrizioni) {
		this.descrizioni = descrizioni;
	}
	
	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}
	
	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	
	public Indirizzo getIndirizzo() {
		return indirizzo;
	}
	
	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}
	
	public Ristorante(String nome, String categoria, String descrizioni, String numeroTelefonico, Indirizzo indirizzo,
			String citta) {
		this.nome = nome;
		this.categoria = categoria;
		this.descrizioni = descrizioni;
		this.numeroTelefonico = numeroTelefonico;
		this.indirizzo = indirizzo;
	}
	
	public  ArrayList<Magazzino> getMagazzino() {
		return magazzini;
	}
	
	public void setMagazzino( ArrayList<Magazzino> magazzino) {
		this.magazzini = magazzino;
	}

	public ArrayList<Rider> getRider() {
		return riders;
	}

	public void setRider(ArrayList<Rider> rider) {
		this.riders = rider;
	}

}
