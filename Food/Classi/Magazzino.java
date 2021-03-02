package Classi;

import java.util.ArrayList;

public class Magazzino {
	
	private int QuantitaProdotto;
	private String Nome;
	private String LottoProdotto;
	private ArrayList<Prodotto> prodotto; 
	private ArrayList<Ristorante> ristorante;


		
	
	public Magazzino(int quantitaProdotto, String nome, String lottoProdotto) {
		this.QuantitaProdotto = quantitaProdotto;
		this.Nome = nome;
		this.LottoProdotto = lottoProdotto;
	}

	
	public int getQuantitaProdotto() {
		return QuantitaProdotto;
	}

	
	public void setQuantitaProdotto(int quantitaProdotto) {
		QuantitaProdotto = quantitaProdotto;
	}

	
	public String getNome() {
		return Nome;
	}

	
	public void setNome(String nome) {
		Nome = nome;
	}

	
	public String getLottoProdotto() {
		return LottoProdotto;
	}

	
	public void setLottoProdotto(String lottoProdotto) {
		LottoProdotto = lottoProdotto;
	}


	
	public ArrayList<Ristorante> getRistorante() {
		return ristorante;
	}


	
	public void setRistorante(ArrayList<Ristorante>  ristorante) {
		this.ristorante = ristorante;
	}


	
	public ArrayList<Prodotto> getProdotto() {
		return prodotto;
	}


	
	public void setProdotto(ArrayList<Prodotto> prodotto) {
		this.prodotto = prodotto;
	}

	
}
