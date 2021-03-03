package Classi;

import java.util.ArrayList;

public class Magazzino {
	
	private int quantitaProdotto;
	private String nome;
	private String lottoProdotto;
	private ArrayList<Prodotto> prodotto; 
	private ArrayList<Ristorante> ristorante;
	
	public Magazzino(int quantitaProdotto, String nome, String lottoProdotto) {
		this.quantitaProdotto = quantitaProdotto;
		this.nome = nome;
		this.lottoProdotto = lottoProdotto;
	}
	
	public int getQuantitaProdotto() {
		return quantitaProdotto;
	}
	
	public void setQuantitaProdotto(int quantitaProdotto) {
		this.quantitaProdotto = quantitaProdotto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLottoProdotto() {
		return lottoProdotto;
	}
	
	public void setLottoProdotto(String lottoProdotto) {
		this.lottoProdotto = lottoProdotto;
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