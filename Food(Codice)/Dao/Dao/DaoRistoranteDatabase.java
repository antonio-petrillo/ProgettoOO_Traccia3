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
	
	public Ristorante[] ottieniRistoranti() {
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
		int size = ristoranti.size();
		Ristorante[] ret = new Ristorante[size];
		for(int i=0; i<size; i++) {
			ret[i] = ristoranti.get(i);
		}
		return ret;
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
		DaoRider daoRider = new DaoRiderDatabase();
		String query = "SELECT nome, codiceRistorante FROM ristorante WHERE codiceRistorante = ?";
		try {
			Connection connection = DBconnection.getInstance().getConn();
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, codiceRistorante);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				ArrayList<Rider> riders;
				String nomeRistorante = rs.getString("nome");
				riders = daoRider.ottieniRider(codiceRistorante);
				query = "SELECT P.nome, P.prezzo, P.codiceSeriale, P.categoria, P.scadenza, P.pathFoto, P.tipoProdotto, P.categoria, F.quantitaProdotto FROM fornitura AS F NATURAL JOIN prodotto AS P WHERE codiceRistorante = ?";
				stmt = connection.prepareStatement(query);
				stmt.setInt(1, codiceRistorante);
				ResultSet rsFornitura = stmt.executeQuery();
				ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
				HashMap<Prodotto, Integer> disponibilita = new HashMap<Prodotto, Integer>();
				while(rsFornitura.next()) {
					String nomeProdotto = rsFornitura.getString("nome");
					double prezzo = rsFornitura.getDouble("prezzo");
					int codiceSeriale = rsFornitura.getInt("codiceSeriale");
					String descrizione = rsFornitura.getString("categoria");
					Date scadenza = rsFornitura.getDate("scadenza"); //tipo java.sql.Date 
					java.util.Date dataConvertita = new java.util.Date(scadenza.getTime());
					String pathFoto = rsFornitura.getString("pathFoto");
					String tipoProdotto = rsFornitura.getString("tipoProdotto");
					String categoria = rsFornitura.getString("categoria");
					int quantitaProdotto = rsFornitura.getInt("quantitaProdotto");
					Prodotto nuovoProdotto;
					if(tipoProdotto.equals("cibo")) {
						nuovoProdotto = new Cibo(nomeProdotto, prezzo, codiceSeriale, descrizione, dataConvertita, pathFoto, categoria);
					}else {
						nuovoProdotto = new Bevanda(nomeProdotto, prezzo, codiceSeriale, descrizione, dataConvertita, pathFoto, categoria);
					}
					prodotti.add(nuovoProdotto);
					disponibilita.putIfAbsent(nuovoProdotto, quantitaProdotto);
					ristorante = new Ristorante(nomeRistorante, codiceRistorante, riders, prodotti, disponibilita); 
					this.costruisciAssociazioniRider(ristorante);
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return ristorante;
	}

}
