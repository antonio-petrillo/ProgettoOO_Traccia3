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
			String query = "SELECT * FROM prodotto";
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

	@Override
	public ArrayList<Prodotto> filtraProdottti(String filtro) {
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
		String query;
		if(filtro.equals("cibo") || filtro.equals("bevanda")) {
			query = "SELECT * FROM prodotto where tipoProdotto = ?";
		}else {
			query = "SELECT * FROM prodotto where categoria = ?";
		}
		try {
			Connection connection = DBconnection.getInstance().getConn();
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, filtro);
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
		}catch (SQLException | ClassNotFoundException e){
			e.printStackTrace();
		}
		return prodotti;
	}
	
	public ArrayList<Prodotto> filtraProdottiPerPrezzo(double min, double max){
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
		try {
			Connection connection = DBconnection.getInstance().getConn();
			String query = "SELECT * FROM prodotto WHERE prezzo > ? AND prezzo < ?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setDouble(1, min);
			stmt.setDouble(2, max);
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
	
	public ArrayList<Prodotto> ricercaPerNome(String nome){
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
		try {
			Connection connection = DBconnection.getInstance().getConn();
			String query = "SELECT * FROM prodotto WHERE nome LIKE ?";
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setString(1, "%" + nome + "%");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String nomeResult = rs.getString("nome");
				double prezzo = rs.getDouble("prezzo");
				int codiceSeriale = rs.getInt("codiceprodotto");
				String descrizione = rs.getString("descrizione");
				Date scadenza = rs.getDate("scadenza"); // java.sql.Date
				String pathFoto = rs.getString("pathFoto");
				String tipoProdotto = rs.getString("tipoprodotto");
				String categoria = rs.getString("categoria");
				java.util.Date conversione = new java.util.Date(scadenza.getTime());
				if(tipoProdotto.equals("cibo")) {
					prodotti.add(new Cibo(nomeResult, prezzo, codiceSeriale, descrizione, conversione, pathFoto, categoria));
				}else { // tipoProdotto.equals("bevanda")
					prodotti.add(new Bevanda(nomeResult, prezzo, codiceSeriale, descrizione, conversione, pathFoto, categoria));
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return prodotti;
	}

	public ArrayList<Prodotto> filtroRider(String mezzoUtilizzato){
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
		try {
			Connection connection = DBconnection.getInstance().getConn();
			String query = "SELECT * FROM prodottoVeicoloView";
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
				String tipoVeicolo = rs.getString("tipoVeicolo");
				java.util.Date conversione = new java.util.Date(scadenza.getTime());
				if(tipoVeicolo.equals(mezzoUtilizzato)) {
					if(tipoProdotto.equals("cibo")) {
						prodotti.add(new Cibo(nome, prezzo, codiceSeriale, descrizione, conversione, pathFoto, categoria));
					}else { // tipoProdotto.equals("bevanda")
						prodotti.add(new Bevanda(nome, prezzo, codiceSeriale, descrizione, conversione, pathFoto, categoria));
					}
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return prodotti;
	}
	
	public ArrayList<Prodotto> ottieniProdottiFiltrati(String filtroPrezzo, String filtroVeicolo, String tipoOCategoria){
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
		double min = -1;
		double max = Double.MAX_VALUE;
		if(!filtroPrezzo.equals("qualunque")) {
			if(filtroPrezzo.equals("0-5 €")) {
				min = 0;
				max = 5;
			}else if(filtroPrezzo.equals("5-10 €")) {
				min = 5;
				max = 10;
			}else if(filtroPrezzo.equals("10-20 €")) {
				min = 10;
				max = 20;
			}else {// 20-75
				min = 20;
				max = 75;
			}
		}
		prodotti = this.ottieniProdottiFiltratiHelper(min, max, filtroVeicolo, tipoOCategoria);
		return prodotti;
	}

	private ArrayList<Prodotto> ottieniProdottiFiltratiHelper(double min, double max, String filtroVeicolo, String tipoOCategoria){
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();
		try {
			Connection connection = DBconnection.getInstance().getConn();
			String query;
			if(tipoOCategoria.equals("cibo") || tipoOCategoria.equals("bevanda")) {
				query = "SELECT * FROM prodototoVeicoloView WHERE prezzo > ? AND prezzo < ? AND tipoProdotto = ?";
			}else {
				query = "SELECT * FROM prodototoVeicoloView WHERE prezzo > ? AND prezzo < ? AND categoria = ?";
			}
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setDouble(1, min);
			stmt.setDouble(2, max);
			stmt.setString(3, tipoOCategoria);
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
				String tipoVeicolo = rs.getString("tipoVeicolo");
				java.util.Date conversione = new java.util.Date(scadenza.getTime());
				if(!filtroVeicolo.equals("qualunque")) {
					if(tipoVeicolo.equals(filtroVeicolo)) {
						if(tipoProdotto.equals("cibo")) {
							prodotti.add(new Cibo(nome, prezzo, codiceSeriale, descrizione, conversione, pathFoto, categoria));
						}else { // tipoProdotto.equals("bevanda")
							prodotti.add(new Bevanda(nome, prezzo, codiceSeriale, descrizione, conversione, pathFoto, categoria));
						}
					}
				}else {
					if(tipoProdotto.equals("cibo")) {
						prodotti.add(new Cibo(nome, prezzo, codiceSeriale, descrizione, conversione, pathFoto, categoria));
					}else { // tipoProdotto.equals("bevanda")
						prodotti.add(new Bevanda(nome, prezzo, codiceSeriale, descrizione, conversione, pathFoto, categoria));
					}
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return prodotti;
	}
	
}
