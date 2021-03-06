package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import Classi.Bevanda;
import Classi.Cibo;
import Classi.Prodotto;

public class DaoProdottoDatabase implements DaoProdotto {

	public ArrayList<Prodotto> ottieniTuttiProdotti(){
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
		try {
			Connection connection = DBconnection.getInstance().getConn();
			String query = "SELECT * FROM prodotti";
			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String nome = rs.getString("nome");
				double prezzo = rs.getDouble("prezzo");
				int codiceSeriale = rs.getInt("codiceprodotto");
				String descrizione = rs.getString("descrizione");
				Date scadenza = rs.getDate("scadenza"); // java.sql.Date
				String pathFoto = rs.getString("pathFoto");
				String tipoProdotto = rs.getString("tipoprodotto");
				String categoria = rs.getString("categoria");
				java.util.Date conversione = new java.util.Date(scadenza.getTime());
				if(tipoProdotto.equals("cibo")) {
					prodotti.add(new Cibo(nome, prezzo, codiceSeriale, descrizione, conversione, pathFoto, categoria));
				}else { // tipoProdotto.equals("bevanda")
					prodotti.add(new Bevanda(nome, prezzo, codiceSeriale, descrizione, conversione, pathFoto, categoria));
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return prodotti;
	}
}
