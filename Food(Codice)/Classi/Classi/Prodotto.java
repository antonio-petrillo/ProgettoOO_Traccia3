package Classi;


import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

public class Prodotto {

	// TODO : collegameto con magazzino
	private String nome;
	private double prezzo;
	private String codiceSeriale;
	private String descrizione;
	private Date scadenzaProdotto;
	private Image fotoProdotto = null;

 	public Prodotto(String nome, double prezzo, String codiceSeriale, String descrizione, Date scadenzaProdotto) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.codiceSeriale = codiceSeriale;
		this.descrizione = descrizione;
		this.scadenzaProdotto = scadenzaProdotto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public String getCodiceSeriale() {
		return codiceSeriale;
	}
	
	public void setCodiceSeriale(String codiceSeriale) {
		this.codiceSeriale = codiceSeriale;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public Date getScadenzaProdotto() {
		return scadenzaProdotto;
	}
	
	public void setScadenzaProdotto(Date scadenzaProdotto) {
		this.scadenzaProdotto = scadenzaProdotto;
	}
	
	public Image getFtotProdotto() {
		return fotoProdotto;
	}

	public void setFtotProdotto(Image ftotProdotto) {
		fotoProdotto = ftotProdotto;
	}

}
