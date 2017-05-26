package conexionMySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionSingleton {

	public static Connection cnn=null;
	
	private ConexionSingleton(){
		
	}
	
	public static Connection conectar(){
		if(cnn == null){
			try{
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				cnn=DriverManager.getConnection("jdbc:mysql://35.185.80.173:3306/dbDisenioProy1", "profesor", "hola1234");
			}catch(SQLException ex){	
				Logger.getLogger(ConexionSingleton.class.getName()).log(Level.SEVERE,null,ex);
			}catch(Exception e){
			}
		}
		return cnn;
			
	}	
	
	public static void desconectar(){
		cnn= null;
	}

}
