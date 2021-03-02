package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import Classi.Cibo;



public interface DaoMenu {

		public ResultSet ricercaCibo(String URL,Connection conn ,Cibo cibo) throws SQLException,Exception;
		


  }

