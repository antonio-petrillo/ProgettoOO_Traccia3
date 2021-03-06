package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Classi.*;

public class DaoUtenteDatabase implements DaoUtente {

	// TODO : query per ottener un utente
	
	public boolean esisteUtente(String email) throws SQLException, ClassNotFoundException{
		boolean userExist = false;
		String query = "SELECT * FROM utente AS U WHERE U.email=?";
		Connection connection = DBconnection.getInstance().getConn();
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setString(1, email);
		ResultSet rs = stmt.executeQuery();
		userExist = rs.next();
		return userExist;
	}
	
	public boolean concediAccesso(String email, String password) {
		boolean validateAccess = false;
		try {
			Connection connection = DBconnection.getInstance().getConn();
			String query = "SELECT * FROM utente AS U WHERE U.email = ? AND U.password = ?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, email);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			validateAccess = rs.next();
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return validateAccess;
	}
	
	public boolean inserisciNuovoUtente(String nome, String cognome, String email, String password, 
			String numeroTelefono, int codiceIndirizzo) {
		boolean insertSucced = false;
		try {
			Connection connection = DBconnection.getInstance().getConn();
			String query = "INSERT INTO utente(nome, cognome, email, password, numeroTelefono, codiceIndirizzo) VALUES(?, ?, ?, ?, ?, ?)"; 
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, nome);
			stmt.setString(2, cognome);
			stmt.setString(3, email);
			stmt.setString(4, password);
			stmt.setString(5, numeroTelefono);
			stmt.setInt(6, codiceIndirizzo);
			stmt.execute();
			insertSucced = true;
		}catch(SQLException e) {
			System.out.println("impossibile effetturare l'inserimento");
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			System.out.println("impossibile trovare il driver jdbc per postgres");
			e.printStackTrace();
		}
		return insertSucced;
	}
	
}
