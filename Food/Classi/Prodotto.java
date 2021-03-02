package Classi;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

public class Prodotto {

	private String Nome;
	private double Prezzo;
	private String CodiceSeriale;
	private String Descrizione;
	private Date ScadenzaProdotto;
	private Prodotto Contiene;
	private Image FotoProdotto = null;
	private String CodiceProdotto;

	

	private ArrayList<Magazzino> magazzino; 
	private Carrello CostituitoDaProdotti;


 	public Prodotto(String nome, double prezzo, String codiceSeriale, String descrizione, Date scadenzaProdotto) {
		this.Nome = nome;
		this.Prezzo = prezzo;
		this.CodiceSeriale = codiceSeriale;
		this.Descrizione = descrizione;
		this.ScadenzaProdotto = scadenzaProdotto;
	}

	
	public String getNome() {
		return Nome;
	}

	
	public void setNome(String nome) {
		Nome = nome;
	}

	
	public double getPrezzo() {
		return Prezzo;
	}

	
	public void setPrezzo(double prezzo) {
		Prezzo = prezzo;
	}

	
	public String getCodiceSeriale() {
		return CodiceSeriale;
	}

	
	public void setCodiceSeriale(String codiceSeriale) {
		CodiceSeriale = codiceSeriale;
	}

	
	public String getDescrizione() {
		return Descrizione;
	}

	
	public void setDescrizione(String descrizione) {
		Descrizione = descrizione;
	}

	
	public Date getScadenzaProdotto() {
		return ScadenzaProdotto;
	}

	
	public void setScadenzaProdotto(Date scadenzaProdotto) {
		ScadenzaProdotto = scadenzaProdotto;
	}


	
	public Prodotto getContiene() {
		return Contiene;
	}


	
	public void setContiene(Prodotto contiene) {
		Contiene = contiene;
	}


	
	public ArrayList<Magazzino> getMagazzino() {
		return magazzino;
	}


	
	public void setMagazzino(ArrayList<Magazzino> magazzino) {
		this.magazzino = magazzino;
	}



	public Carrello getCostituitoDaProdotti() {
		return CostituitoDaProdotti;
	}


	public void setCostituitoDaProdotti(Carrello costituitoDaProdotti) {
		CostituitoDaProdotti = costituitoDaProdotti;
	}

	public Image getFtotProdotto() {
		return FotoProdotto;
	}


	public void setFtotProdotto(Image ftotProdotto) {
		FotoProdotto = ftotProdotto;
	}


	public String getCodiceProdotto() {
		return CodiceProdotto;
	}


	public void setCodiceProdotto(String codiceProdotto) {
		CodiceProdotto = codiceProdotto;
	}


	
	
}
