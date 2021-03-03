package Classi;

public class Indirizzo {
	private String nomeVia;
	private String numeroCivico;
	private String CAP;
	private String citta;
	private String provincia;
	private Utente utente;
	private Ristorante ristorante;
	
	public String getNomeVia() {
		return nomeVia;
	}
	public void setNomeVia(String nomeVia) {
		this.nomeVia = nomeVia;
	}
	public String getNumeroCivico() {
		return numeroCivico;
	}
	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	public String getCap() {
		return CAP;
	}
	public void setCap(String cap) {
		this.CAP = cap;
	}
	public Indirizzo(String nomeVia, String numeroCivico, String cap) {
		this.nomeVia = nomeVia;
		this.numeroCivico = numeroCivico;
		this.CAP = cap;
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
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	public  String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}
