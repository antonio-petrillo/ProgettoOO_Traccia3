package Classi;

import java.util.ArrayList;
import java.util.HashMap;

public class Carrello {
	
	// TODO : metodo aggiungi prodotti, rimuovi prodotti, cambia quantita
	private int codiceCarrello;
	private ArrayList<Prodotto> prodotti;
	private HashMap<Prodotto, Integer> quantitaProdotto; // coppia prodotto, quantita
	
	public Carrello(int codiceCarrello) {
		this.codiceCarrello = codiceCarrello;
		this.prodotti = new ArrayList<Prodotto>();
		this.quantitaProdotto = new HashMap<Prodotto, Integer>();
	}

	// a che serve questo getter?
	public int getCodiceCarrello() {
		return codiceCarrello;
	}

	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}

	public HashMap<Prodotto, Integer> getQuantitaProdotto() {
		return quantitaProdotto;
	}

	public void aggiungiProdotto(Prodotto prodotto, int quantita) {
		if(! this.getProdotti().contains(prodotto)) {
			this.getProdotti().add(prodotto);
			this.getQuantitaProdotto().put(prodotto, quantita);
		}else {
			this.getQuantitaProdotto().replace(prodotto, this.getQuantitaProdotto().get(prodotto) + quantita);
		}
	}
	
	public void cambiaQuantita(Prodotto prodotto, int quantita) {
		this.aggiungiProdotto(prodotto, quantita);
	}
	
	public double getTotale() {
		double totale = 0.0;
		for (Prodotto p : prodotti) {
			totale += p.getPrezzo() * quantitaProdotto.get(p);
		}
		return totale; 
	}
	
}