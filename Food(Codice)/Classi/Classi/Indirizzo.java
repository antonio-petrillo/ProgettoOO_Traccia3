package Classi;

public class Indirizzo {
	private String nomeVia;
	private String numeroCivico;
	private String CAP;
	private String citta;
	private String provincia;
	
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

	public Indirizzo(String nomeVia, String numeroCivico, String cap, String citta, String provincia) {
		this.nomeVia = nomeVia;
		this.numeroCivico = numeroCivico;
		this.citta = citta;
		this.provincia = provincia;
		this.CAP = cap;
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
