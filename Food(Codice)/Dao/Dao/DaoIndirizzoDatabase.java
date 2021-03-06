package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoIndirizzoDatabase implements DaoIndirizzo {

	public boolean esisteIndirizzo(String nomeVia, int numeroCivico, String cap, String citta, String provincia) throws SQLException, ClassNotFoundException {
		boolean addressExist = false;
		String query = "SELECT * FROM indirizzo AS I WHERE I.nomeVIa = ? AND I.numeroCivico = ? AND I.cap = ? AND I.citta = ? AND I.provincia = ?";
		Connection connection = DBconnection.getInstance().getConn();
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setString(1, nomeVia);
		stmt.setInt(2, numeroCivico);
		stmt.setString(3, cap);
		stmt.setString(4, citta);
		stmt.setString(5, provincia);
		ResultSet rs = stmt.executeQuery();
		addressExist = rs.next();
		return addressExist;
	}
	
	public boolean inserisciNuovoIndirizzo(String nomeVia, int numeroCivico, String cap, String citta, String provincia) {
		boolean insertSucced = false;
		try {
			Connection connection = DBconnection.getInstance().getConn();
			String query = "INSERT INTO indirizzo(nomeVia, numeroCivico, cap, citta, provincia) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, nomeVia);
			stmt.setInt(2, numeroCivico);
			stmt.setString(3, cap);
			stmt.setString(4, citta);
			stmt.setString(5, provincia);
			stmt.execute();
			insertSucced = true;
		}catch(SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}
		return insertSucced;
	}
	
	public int ottieniCodiceIndirizzo(String nomeVia, int numeroCivico, String cap, String citta, String provincia) throws SQLException, ClassNotFoundException{ 
		int codiceIndirizzo = 0;
		String query = "SELECT I.codiceIndirizzo FROM indirizzo AS I WHERE I.nomeVIa = ? AND I.numeroCivico = ? AND I.cap = ? AND I.citta = ? AND I.provincia = ?";
		Connection connection = DBconnection.getInstance().getConn();
		PreparedStatement stmt = connection.prepareStatement(query);
		stmt.setString(1, nomeVia);
		stmt.setInt(2, numeroCivico);
		stmt.setString(3, cap);
		stmt.setString(4, citta);
		stmt.setString(5, provincia);
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			codiceIndirizzo = rs.getInt("codiceIndirizzo");
		}
		return codiceIndirizzo;
	}
}
