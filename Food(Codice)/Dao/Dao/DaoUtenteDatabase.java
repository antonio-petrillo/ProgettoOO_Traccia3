package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Classi.*;

public class DaoUtenteDatabase implements DaoUtente {
	
	public boolean creaUtente(Utente utente) throws SQLException,Exception
	{
		String INSERIMENTO = "INSERT INTO utenti VALUES (?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement stmt = null;
		if(!effettua_accesso(utente.getEmail(),utente.getPassword()))   
		{
			conn = DBconnection.getInstance().getConn();
			stmt = conn.prepareStatement(INSERIMENTO);
			stmt.setString(1, utente.getNome());
			stmt.setString(2, utente.getCognome());
			stmt.setString(3, utente.getEmail());
			stmt.setString(4, utente.getNumeroTelefonico());
			stmt.setString(5, utente.getDataDiNascita());
			stmt.setString(6, utente.getPassword());
			stmt.executeUpdate();
			stmt.close();
			conn.close();
			return true;	  
		}
		return false;						 	
	}
	
	
	public boolean cambiaPWD(Utente utente,String nuovaPassword ) throws SQLException,Exception
	{
	    String CAMBIA_PWD = "UPDATE utenti SET password = ? WHERE Email = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		if(effettua_accesso(utente.getEmail(),utente.getPassword()))
		{
			conn =DBconnection.getInstance().getConn();
			stmt = conn.prepareStatement(CAMBIA_PWD);
			stmt.setString(2,utente.getEmail());
			stmt.setString(1,nuovaPassword);
			stmt.executeUpdate();
			stmt.close();
			conn.close();
			return true;
		}
		return false;
	}
	
	public boolean effettua_accesso(String Email, String password) throws SQLException,Exception
	{
	    String RICERCA_PASSWORD="SELECT * FROM utenti where Email=? and Password=?"; 
    	Connection conn = DBconnection.getInstance().getConn();
		PreparedStatement stmt = conn.prepareStatement(RICERCA_PASSWORD);
		stmt.setString(1, Email);
		stmt.setString(2,password);
		ResultSet rs=stmt.executeQuery();
		if(!rs.next())
		{
			rs.close();
			return false;
		}
		else
		{
			rs.close();
  			return true;
		}
	}
}
