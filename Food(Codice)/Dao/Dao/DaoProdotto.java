package Dao;

import java.util.ArrayList;

import Classi.Prodotto;

public interface DaoProdotto {

	public ArrayList<Prodotto> ottieniTuttiProdotti();

	public ArrayList<Prodotto> ottieniTuttiProdottiPerRistorante(int codiceRistorante);
	
}
