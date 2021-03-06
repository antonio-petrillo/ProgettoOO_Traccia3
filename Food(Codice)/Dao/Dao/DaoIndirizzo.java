package Dao;

import java.sql.SQLException;

import Classi.Indirizzo;

public interface DaoIndirizzo {

	public boolean esisteIndirizzo(String nomeVia, int numeroCivico, String cap, String citta, String provincia) throws SQLException, ClassNotFoundException;
	
	public boolean inserisciNuovoIndirizzo(String nomeVia, int numeroCivico, String cap, String citta, String provincia);	
	
	public int ottieniCodiceIndirizzo(String nomeVia, int numeroCivico, String cap, String citta, String provincia) throws SQLException, ClassNotFoundException;	

	public Indirizzo ottieniIndirizzo(int codiceIndirizzo) throws ClassNotFoundException, SQLException;
	
}