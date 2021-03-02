package Dao;
import java.sql.*;


public class DBconnection {
	
	private static DBconnection instance;
	private Connection conn;
	
	
	private DBconnection()throws SQLException,ClassNotFoundException
	{
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/Food";
		conn=DriverManager.getConnection(url,"postgres","1234.ciao");
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
	

