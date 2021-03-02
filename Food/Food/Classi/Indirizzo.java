package Classi;

public class Indirizzo {
	
	private String NomeVia;
	private String NumeroCivico;
	private String Cap;
	private String Citta;
	private String Provincia;
	private Utente utente;
	private Ristorante ristorante;
	
	
	public String getNomeVia() {
		return NomeVia;
	}
	public void setNomeVia(String nomeVia) {
		NomeVia = nomeVia;
	}
	public String getNumeroCivico() {
		return NumeroCivico;
	}
	public void setNumeroCivico(String numeroCivico) {
		NumeroCivico = numeroCivico;
	}
	public String getCap() {
		return Cap;
	}
	public void setCap(String cap) {
		Cap = cap;
	}
	public Indirizzo(String nomeVia, String numeroCivico, String cap) {
		this.NomeVia = nomeVia;
		this.NumeroCivico = numeroCivico;
		this.Cap = cap;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Ristorante getRistorante() {
		return ristorante;
	}
	public void setRistorante(Ristorante ristorante) {
		this.ristorante = ristorante;
	}
	public String getCitta() {
		return Citta;
	}
	public void setCitta(String citta) {
		Citta = citta;
	}
	public  String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}

}
