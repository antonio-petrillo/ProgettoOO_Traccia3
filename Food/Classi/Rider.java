package Classi;


import java.awt.Image;
import java.util.Set;

public class Rider {
	
	private String Nome;
	private String Cognome;
	private String Biografia;
	Image FotoRiders;
	private String CodiceFoto;
	private Set<Veicolo> veicolo;
	private Ristorante[] RistoranteAssociato = new Ristorante[3];

    
	public Rider(String nome, String cognome, String biografia) {
		super();
		Nome = nome;
		Cognome = cognome;
		Biografia = biografia;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCognome() {
		return Cognome;
	}

	public void setCognome(String cognome) {
		Cognome = cognome;
	}

	public String getBiografia() {
		return Biografia;
	}

	public void setBiografia(String biografia) {
		Biografia = biografia;
	}

	
	public Image getFotoRiders() {
		return FotoRiders;
	}


	public void setFotoRiders(Image fotoRiders) {
		FotoRiders = fotoRiders;
	}


	public Set<Veicolo> getVeicolo() {
		return veicolo;
	}

	public void Set(Set<Veicolo> veicolo) {
		this.veicolo = veicolo;
	}


	public Ristorante[] getRistoranteAssociato() {
		return RistoranteAssociato;
	}


	public void setRistoranteAssociato(Ristorante[] ristoranteAssociato) {
		RistoranteAssociato = ristoranteAssociato;
	}


	public String getCodiceFoto() {
		return CodiceFoto;
	}


	public void setCodiceFoto(String codiceFoto) {
		this.CodiceFoto = codiceFoto;
	}


}
