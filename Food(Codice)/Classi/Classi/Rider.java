package Classi;

import java.awt.Image;
import java.util.Set;

public class Rider {
	
	private String nome;
	private String cognome;
	private String biografia;
	private Image fotoRider;
	private String percorsoFoto;
	private Set<Veicolo> veicolo;
	private Ristorante[] ristoranteAssociato = new Ristorante[3];
    
	public Rider(String nome, String cognome, String biografia) {
		this.nome = nome;
		this.cognome = cognome;
		this.biografia = biografia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getBiografia() {
		return biografia;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}

	public Image getFotoRiders() {
		return fotoRider;
	}

	public void setFotoRiders(Image fotoRider) {
		this.fotoRider = fotoRider;
	}

	public Set<Veicolo> getVeicolo() {
		return veicolo;
	}

	public void Set(Set<Veicolo> veicolo) {
		this.veicolo = veicolo;
	}

	public Ristorante[] getRistoranteAssociato() {
		return ristoranteAssociato;
	}

	public void setRistoranteAssociato(Ristorante[] ristoranteAssociato) {
		this.ristoranteAssociato = ristoranteAssociato;
	}

	public String getCodiceFoto() {
		return percorsoFoto;
	}

	public void setCodiceFoto(String codiceFoto) {
		this.percorsoFoto = codiceFoto;
	}

}
