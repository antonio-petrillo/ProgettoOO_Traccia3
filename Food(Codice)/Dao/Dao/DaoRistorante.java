package Dao;

import java.util.ArrayList;

import Classi.Ristorante;

public interface DaoRistorante {

	public ArrayList<Ristorante> ottieniRistorante();

	public boolean aggiornaForniture(int codiceRistorante, int codiceProdotto, int nuovaQuantita); 
	
}
