package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Classi.Rider;
import Classi.Veicolo;

public class DaoRiderDatabase implements DaoRider{

	public ArrayList<Rider> ottieniRider(int codiceRistorante){
		ArrayList<Rider> riders = new ArrayList<Rider>();
		String query = "SELECT R.nome, R.cognome, R.biografia, R.pathFoto, R.codiceRider FROM rider AS R NATURAL JOIN corrierePer AS C WHERE C.codiceRistorante = ? ";
		try {
			Connection connection = DBconnection.getInstance().getConn();
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, codiceRistorante);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				String biografia = rs.getString("biografia");
				String pathFoto = rs.getString("pathFoto");
				int codiceRider = rs.getInt("codiceRider");
				DaoVeicolo dv = new DaoVeicoloDatabase();
				ArrayList<Veicolo> parcoVeicoli = dv.ottieniVeicoli(codiceRider);
				riders.add(new Rider(nome, cognome, biografia, pathFoto, codiceRider, parcoVeicoli));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return riders;
	}
	
}
