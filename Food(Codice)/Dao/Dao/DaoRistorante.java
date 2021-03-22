package Dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import Classi.Ristorante;

public interface DaoRistorante {

	public ArrayList<Ristorante> ottieniRistoranti() throws SQLException, ClassNotFoundException;

	public Ristorante ottieniRistorante(int codiceRistorante);

	public boolean aggiornaForniture(int codiceRistorante, int codiceProdotto, int nuovaQuantita); 

	public HashMap<Integer, ArrayList<Integer>> ottieniAssociazioni() throws SQLException, ClassNotFoundException;
	
}
