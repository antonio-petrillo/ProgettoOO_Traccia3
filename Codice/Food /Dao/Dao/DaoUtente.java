package Dao;

import java.sql.SQLException;

import Classi.Utente;

public interface DaoUtente {

	public  boolean creaUtente(Utente utente) throws SQLException, Exception;
	
	public boolean cambiaPWD(Utente utente,String nuovaPassword ) throws SQLException, Exception;
	
	public boolean effettua_accesso(String Email, String password) throws SQLException, Exception;

	public String getTipoUtente(String username) throws SQLException, Exception;
}
