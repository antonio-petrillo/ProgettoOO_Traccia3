package Dao;

import java.util.ArrayList;

import Classi.Ristorante;

public interface DaoRistorante {

	public Ristorante[] ottieniRistoranti();

	public Ristorante ottieniRistorante(int codiceRistorante);

	public boolean aggiornaForniture(int codiceRistorante, int codiceProdotto, int nuovaQuantita); 

	
}
