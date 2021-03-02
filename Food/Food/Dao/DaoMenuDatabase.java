package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classi.Cibo;


public class DaoMenuDatabase  implements DaoMenu {
	

	public ResultSet ricercaCibo(String URL,Connection conn ,Cibo cibo) throws SQLException,Exception {
	
		{ 
		PreparedStatement stm = conn.prepareStatement(URL);
		stm.setString(1,cibo.getNome());
		return stm.executeQuery(); 
	    }
		
	}
	
	

}


 


