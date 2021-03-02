package Dao;

import java.sql.SQLException;

import Classi.Indirizzo;
import Classi.Ordine;
import Classi.Rider;
import Classi.Ristorante;
import Classi.Utente;

public interface DaoFattura {

	public boolean  creaOrdine(Ordine ordine, Indirizzo indirizzo, Rider rider, Ristorante ristorante) throws SQLException,Exception;

}
