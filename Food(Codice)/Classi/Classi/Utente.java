package Classi;

import java.util.ArrayList;

public class Utente {
	
	private String nome;
	private String cognome;
	private String email;
	private String password;
    private String numeroTelefonico;
	private Indirizzo indirizzo;
	private ArrayList<Ordine> ordini;
	
	// TODO : costruttore con indirizzo
   public  Utente(String nome, String cognome, String email, String password, String numeroTelefonico) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.numeroTelefonico = numeroTelefonico;
	}

   public  Utente(String nome, String cognome, String email, String password, String dataDiNascita,String numeroTelefonico, Indirizzo indirizzo) {
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.numeroTelefonico = numeroTelefonico;
		this.indirizzo = indirizzo;
	}

	public Utente(String Email)
	{
	this.email=Email;
	}
	
	public Utente(String Email, String Password) {
		this.email = Email;
		this.password = Password;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

}



