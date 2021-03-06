package Dao;

import java.sql.SQLException;

import Classi.Carrello;

public interface DaoCarrello {

	public Carrello creaNuovoCarrello() throws ClassNotFoundException, SQLException; 	
	
	public boolean inserisciCarrello(Carrello carrello);	
	
}

