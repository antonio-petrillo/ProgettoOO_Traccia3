package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Classi.Indirizzo;
import Classi.Ordine;
import Classi.Rider;
import Classi.Ristorante;
import Classi.Utente;

	public class DaoFatturaDatabase implements DaoFattura {
		
		public boolean  creaOrdine(Ordine ordine, Indirizzo indirizzo, Rider rider, Ristorante ristorante, Utente utente) throws SQLException,Exception
		
		{	

//			    String INSERIMENTO_ORDINE = "INSERT INTO Ordine VALUES (?,?,?,?,?,?,?,?,?,?,?)";
//				Connection conn = null;
//				PreparedStatement stmt = null;
//				
//			    conn = DBconnection.getInstance().getConn();
//				stmt = conn.prepareStatement(INSERIMENTO_ORDINE);
//				stmt.setString(1, ordine.getUtente().getNome());
//				stmt.setString(2, ordine.getUtente().getCognome());
//				stmt.setString(4,  ordine.getUtente().getNumeroTelefonico());
//				stmt.setString(5,  ordine.getUtente().getEmail());
//				stmt.setString(6, indirizzo.getNomeVia());
//				stmt.setString(7, indirizzo.getCap());
//				stmt.setString(8, indirizzo.getProvincia());
//				stmt.setString(9, indirizzo.getNumeroCivico());
//				stmt.setString(10, rider.getCognome());
//				stmt.setString(11, ristorante.getNome());
//				stmt.executeUpdate();
//				stmt.close();
//				conn.close();
 			return true;	  
		}

}
