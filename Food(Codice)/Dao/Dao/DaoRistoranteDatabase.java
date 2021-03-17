package Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import Classi.Bevanda;
import Classi.Cibo;
import Classi.Prodotto;
import Classi.Rider;
import Classi.Ristorante;

public class DaoRistoranteDatabase implements DaoRistorante {
	
	public ArrayList<Ristorante> ottieniRistoranti() {
		ArrayList<Ristorante> ristoranti = new ArrayList<Ristorante>();
		DaoRider daoRider = new DaoRiderDatabase();
		String query = "SELECT nome, codiceRistorante FROM ristorante ORDER BY codiceRistorante ASC";
		try {
			Connection connection = DBconnection.getInstance().getConn();
			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String nome = rs.getString("nome");
				int codiceRistorante = rs.getInt("codiceRistorante");
				ristoranti.add(new Ristorante(nome, codiceRistorante));
			}
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return ristoranti;
	}
	
	public boolean aggiornaForniture(int codiceRistorante, int codiceProdotto, int nuovaQuantita) {
		boolean updateSucced = false;
		String query = "UPDATE fornitura SET quantitaProdotto = ? WHERE codiceRistorante = ? AND codiceProdotto = ?";
		try {
			Connection connection = DBconnection.getInstance().getConn();
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, nuovaQuantita);
			stmt.setInt(2, codiceRistorante);
			stmt.setInt(3, codiceProdotto);
			updateSucced = stmt.execute();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return updateSucced;
	}
	
	private void costruisciAssociazioniRider(Ristorante ristorante) {
		ArrayList<Rider> riders = ristorante.getRiders();
		for(Rider rider : riders) {
			rider.addRistoranteAssociato(ristorante);
		}
	}

	@Override
	public Ristorante ottieniRistorante(int codiceRistorante) {
		Ristorante ristorante = null;
		return ristorante;
	}

}
