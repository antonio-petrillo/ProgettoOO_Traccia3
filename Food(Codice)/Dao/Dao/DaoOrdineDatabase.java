package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Classi.*;

public class DaoOrdineDatabase implements DaoOrdine {

	public boolean inserisciNuovoOrdine(Utente utente, Carrello carrello, Ristorante ristorante, Rider rider) {
		boolean insertSucced = false;	
		String query = "INSERT INTO ordine(email, codiceCarrello, codiceRistorante, codiceRider) VALUES( ?, ?, ?, ?)";
		try {
			Connection connection = DBconnection.getInstance().getConn();
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, utente.getEmail());
			stmt.setInt(2, carrello.getCodiceCarrello());
			stmt.setInt(3, ristorante.getCodiceRistorante());
			stmt.setInt(4, rider.getCodiceRider());
			insertSucced = stmt.execute();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return insertSucced;
	}
	
}
