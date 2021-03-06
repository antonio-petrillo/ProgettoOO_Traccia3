package Classi;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Set;

public class Rider {
	
	private String nome;
	private String cognome;
	private String biografia;
	private Image fotoRider;
	private String pathFoto;
	private int codiceRider;
	public int getCodiceRider() {
		return codiceRider;
	}

	private ArrayList<Veicolo> parcoVeicoli = new ArrayList<Veicolo>() ;
	private Ristorante[] ristoranteAssociato = new Ristorante[3];
    private int indexRistoranteAssociato = 0;
	
	public Rider(String nome, String cognome, String biografia, String pathFoto, int codiceRider, ArrayList<Veicolo> parcoVeicoli) {
		this.nome = nome;
		this.cognome = cognome;
		this.biografia = biografia;
		this.pathFoto = pathFoto;
		this.codiceRider = codiceRider;
		this.parcoVeicoli = parcoVeicoli;
	}
	
	public void addRistoranteAssociato(Ristorante ristorante) {
		this.ristoranteAssociato[indexRistoranteAssociato++] = ristorante;
	}

}
