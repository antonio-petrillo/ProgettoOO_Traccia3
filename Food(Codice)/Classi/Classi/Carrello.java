package Classi;


public class Carrello {
	
	private Prodotto prodotti[];
	
	public Carrello(Prodotto[] prodotto) {
		this.prodotti = prodotto;
	}

	public Prodotto[] getProdotto() {
		return prodotti;
	}

	public void setProdotto(Prodotto[] prodotto) {
		this.prodotti = prodotto;
	}

}