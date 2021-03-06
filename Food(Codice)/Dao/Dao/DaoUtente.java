package Dao;

import java.sql.SQLException;
import Classi.Utente;

public interface DaoUtente {

	public boolean esisteUtente(String email) throws SQLException, ClassNotFoundException;	
	
	public boolean concediAccesso(String email, String password); 	

	public boolean inserisciNuovoUtente(String nome, String cognome, String email, String password, String numeroTelefono, int codiceIndirizzo);	
	
}