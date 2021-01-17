package Classi;


import java.util.Set;

public class Rider {
	
	private String Nome;
	private String Cognome;
	private String Biografia;
	private Foto foto;
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

	
    public Foto getFoto() {

		return foto;
	}

	
    public void setFoto(Foto foto) {
		this.foto = foto;
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


}
