package Dao;
import java.sql.*;

public class DBconnection {
	
	private static DBconnection instance;
	private Connection conn;
	
	private DBconnection()throws SQLException,ClassNotFoundException
	{
		// TODO : cambia l'url a localhost
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://192.168.1.37:5432/postgres";
		String user = "postgres";
		String password = "password";
		conn = DriverManager.getConnection(url, user, password);
		System.out.println("connesione al database effettuata con successo");
		String query = "SET search_path TO fooddb";
		PreparedStatement stmt = conn.prepareStatement(query);
		stmt.execute();
		System.out.println("Search path impostato con successo");
	}

	public Connection getConn() {
		return conn;
	}

	public static DBconnection getInstance() throws SQLException,ClassNotFoundException{
		if(instance==null)
		{
			instance=new DBconnection();
		}
		else if(instance.getConn().isClosed())
		{
			instance=new DBconnection();
		}
	
	return instance;
  }
}
	


	

