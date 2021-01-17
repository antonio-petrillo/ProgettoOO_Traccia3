package Classi;

public class Foto {

	private String NomeFoto;
	private String posizione;
	private Utente utente;
	private Rider rider;
	private Prodotto prodotto;

	
	
	public String getNomeFoto() {
		return NomeFoto;
	}
	public void setNomeFoto(String nomeFoto) {
		NomeFoto = nomeFoto;
	}
	public String getPosizione() {
		return posizione;
	}
	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Rider getRider() {
		return rider;
	}
	public void setRider(Rider rider) {
		this.rider = rider;
	}
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}
	
}