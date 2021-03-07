package Dao;

import java.util.ArrayList;

import Classi.Prodotto;

public interface DaoProdotto {

	public ArrayList<Prodotto> ottieniTuttiProdotti();
	
	public ArrayList<Prodotto> filtraProdottti(String parametroFiltro);

	public ArrayList<Prodotto> filtraProdottiPerPrezzo(double min, double max);
	
	public ArrayList<Prodotto> ricercaPerNome(String nome);	

	public ArrayList<Prodotto> filtroRider(String mezzoUtilizzato);

	public ArrayList<Prodotto> ottieniProdottiFiltrati(String filtroPrezzo, String filtroVeicolo, String tipoOCategoria);

}
