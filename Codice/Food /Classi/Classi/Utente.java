package Classi;

import java.util.ArrayList;

public class Utente {
	
	private String Nome;
	private String Cognome;
	private String Email;
	private String Password;
    private String DataDiNascita;
    private String NumeroTelefonico;
	private Indirizzo indirizzo;
	private ArrayList<Ordine> ordine;
	private Foto foto;
	
	
	
	public Utente(String nome, String cognome, String email, String password, String dataDiNascita,
			String numeroTelefonico) {
		super();
		Nome = nome;
		Cognome = cognome;
		Email = email;
		Password = password;
		DataDiNascita = dataDiNascita;
		NumeroTelefonico = numeroTelefonico;
	}

	public Utente(String Email)
	{
	this.Email=Email;
	}
	
	public Utente(String Email, String Password) {
		this.Email = Email;
		this.Password = Password;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		this.Cognome = cognome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		this.Password = password;
	}



	public String getNumeroTelefonico() {
		return NumeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.NumeroTelefonico = numeroTelefonico;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public ArrayList<Ordine> getOrdine() {
		return ordine;
	}

	public void setOrdine(ArrayList<Ordine> ordine) {
		this.ordine = ordine;
	}

	public Foto getFoto() {
		return foto;
	}

	public void setFoto(Foto foto) {
		this.foto = foto;
	}

	public String getDataDiNascita() {
		return DataDiNascita;
	}

	public void setDataDiNascita(String dataDiNascita) {
		DataDiNascita = dataDiNascita;
	}

	

	
}

