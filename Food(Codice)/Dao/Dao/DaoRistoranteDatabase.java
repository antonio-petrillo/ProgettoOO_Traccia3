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
	
	public ArrayList<Ristorante> ottieniRistorante() {
		ArrayList<Ristorante> ristoranti = new ArrayList<Ristorante>();
		DaoRider daoRider = new DaoRiderDatabase();
		String query = "SELECT nome, codiceRistorante FROM ristorante";
		try {
			Connection connection = DBconnection.getInstance().getConn();
			PreparedStatement stmt = connection.prepareStatement(query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				ArrayList<Rider> riders;
				Ristorante tmpRistorante;
				String nomeRistorante = rs.getString("nome");
				int codiceRistorante = rs.getInt("codiceRistorante");
				riders = daoRider.ottieniRider(codiceRistorante);
				query = "SELECT P.nome, P.prezzo, P.codiceSeriale, P.descrizione, P.scadenzaProdotto, P.pathFoto, P.tipoProdotto, P.categoria F.quantitaProdotto FROM fornitura AS F NATURAL JOIN prodotto AS P WHERE codiceRistorante = ?";
				stmt = connection.prepareStatement(query);
				stmt.setInt(1, codiceRistorante);
				ResultSet rsFornitura = stmt.executeQuery();
				ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
				HashMap<Prodotto, Integer> disponibilita = new HashMap<Prodotto, Integer>();
				while(rsFornitura.next()) {
					String nomeProdotto = rsFornitura.getString("nome");
					double prezzo = rsFornitura.getDouble("prezzo");
					int codiceSeriale = rsFornitura.getInt("codiceSeriale");
					String descrizione = rsFornitura.getString("descrizione");
					Date scadenza = rsFornitura.getDate("scadenzaProdotto"); //tipo java.sql.Date 
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
					tmpRistorante = new Ristorante(nomeRistorante, codiceRistorante, riders, prodotti, disponibilita); 
					ristoranti.add(tmpRistorante);
					this.costruisciAssociazioni(ristoranti);
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			ristoranti.clear();
		}
		return ristoranti;
	}
	
	private void costruisciAssociazioni(ArrayList<Ristorante> ristoranti) {
		for(Ristorante ristorante: ristoranti) {
			ArrayList<Rider> riders = ristorante.getRiders();
			for(Rider rider : riders) {
				rider.addRistoranteAssociato(ristorante);
			}
		}
	}

}
