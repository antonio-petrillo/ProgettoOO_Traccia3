package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classi.Carrello;
import Classi.Prodotto;

public class DaoCarrelloDatabase implements DaoCarrello {
	
	public Carrello creaNuovoCarrello() throws ClassNotFoundException, SQLException {
		int nuovoCodiceCarrello = 0;
		Carrello carrello;
		Connection connection = DBconnection.getInstance().getConn();
		String query = "SELECT last_value + 1 AS nextKey FROM carrello_codicecarrello_seq";
		PreparedStatement stmt = connection.prepareStatement(query);
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			nuovoCodiceCarrello = rs.getInt("nextKey");
		}
		carrello = new Carrello(nuovoCodiceCarrello);
		query = "INSERT INTO carrello(data) VALUES(current_date)";
		return null;
	}
	
	public boolean inserisciCarrello(Carrello carrello) {
		boolean insertSucced = false;
		String query = "INSERT INTO composizioneCarrello(codiceCarrello, codiceSeriale, quantita) VALUES(?, ?, ?)";
		try {
			Connection connection = DBconnection.getInstance().getConn();
			int codiceCarrello = carrello.getCodiceCarrello();
			for(Prodotto prodotto : carrello.getProdotti()) {
				int codiceSeriale = prodotto.getCodiceSeriale();
				int quantita = carrello.getQuantitaProdotto().get(prodotto);
				PreparedStatement stmt = connection.prepareStatement(query);
				stmt.setInt(1, codiceCarrello);
				stmt.setInt(2, codiceSeriale);
				stmt.setInt(3, quantita);
				insertSucced = stmt.execute();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return insertSucced;
	}

}
