package Classi;

import java.util.HashMap;

public class Carrello {
	
	// TODO : metodo aggiungi prodotti, rimuovi prodotti, cambia quantita
	private Prodotto prodotti[];
	private HashMap<Prodotto, Integer> quantitaProdotto; // coppia prodotto, quantita
	
	public Carrello(Prodotto[] prodotto) {
		this.prodotti = prodotto;
	}

	public Prodotto[] getProdotto() {
		return prodotti;
	}

	public void setProdotto(Prodotto[] prodotto) {
		this.prodotti = prodotto;
	}
	
	public double getTotale() {
		double totale = 0.0;
		for (Prodotto p : prodotti) {
			totale += p.getPrezzo() * quantitaProdotto.get(p);
		}
		return totale; 
	}

}