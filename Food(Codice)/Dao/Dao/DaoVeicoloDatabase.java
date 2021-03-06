package Dao;

import java.sql.*;
import java.util.ArrayList;

import Classi.Bicicletta;
import Classi.Moto;
import Classi.Veicolo;

public class DaoVeicoloDatabase implements DaoVeicolo{

	@Override
	public ArrayList<Veicolo> ottieniVeicoli(int codiceRider) {
		ArrayList<Veicolo> parcoVeicoli = new ArrayList<Veicolo>();
		String query = "SELECT tipoVeicolo, codiceSeriale, modello FROM veicolo AS V WHERE V.codiceRider = ?";
		try {
			Connection connection = DBconnection.getInstance().getConn();
			PreparedStatement stmt = connection.prepareStatement(query);
			stmt.setInt(1, codiceRider);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String tipoVeicolo = rs.getString("tipoVeicolo");
				int codiceSeriale = rs.getInt("codiceRider");
				if(tipoVeicolo.equals("Moto")) {
					parcoVeicoli.add(new Moto(codiceSeriale));
				}else {
					parcoVeicoli.add(new Bicicletta(codiceSeriale));
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			parcoVeicoli.clear();
		}
		return parcoVeicoli;
	}


}
