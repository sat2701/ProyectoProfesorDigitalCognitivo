package conexionMySql;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


public class ConectaDb {
	private static Connection cnn;
	
	public ConectaDb(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			cnn=DriverManager.getConnection("jdbc:mysql://35.185.80.173:3306/dbDisenioProy1", "profesor", "hola1234");
		}catch(SQLException e){
			
		}catch(Exception e){
			
		}
	}
	
	public static Connection getConnection(){
		return cnn;
	}
	
	public static void desconectar(){
		cnn=null;
		boolean lol=null;
	}

}
