package Classi;

public class Carrello {
	
	private Prodotto prodotto[];
	private Ordine PossiedeCarrello;
	private MetodoDiPagamento metodoDipagamento;


	
	public Carrello(Prodotto[] prodotto) {
		this.prodotto = prodotto;
	}

	public Prodotto[] getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto[] prodotto) {
		this.prodotto = prodotto;
	}

	

	public Ordine getPossiedeCarrello() {
		return PossiedeCarrello;
	}

	public void setPossiedeCarrello(Ordine possiedeCarrello) {
		PossiedeCarrello = possiedeCarrello;
	}

	public MetodoDiPagamento getMetodoDipagamento() {
		return metodoDipagamento;
	}

	public void setMetodoDipagamento(MetodoDiPagamento metodoDipagamento) {
		this.metodoDipagamento = metodoDipagamento;
	}
	
	
	
	
}
