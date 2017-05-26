package logicaDeNegocios.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexionMySql.ConexionSingleton;
import logicaDeNegocios.dto.DtoSubtema;
import logicaDeNegocios.dto.DtoTema;

public class DaoSubtema {
	Statement state;

	public void crearSubtema(String descripcionSubtema, String descripcionTema){
		
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="INSERT INTO subtema VALUES('"+ descripcionSubtema+ "','" + descripcionTema + "');";
			state.executeUpdate(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void eliminarSubtema(String pDescripcion){
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="DELETE FROM subtema WHERE descripcion='" + pDescripcion+ "';";
			state.executeUpdate(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void actualizarSubtema(DtoSubtema dtoSubtema){
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="UPDATE subtema SET decripcion=" + dtoSubtema.getDescripcion()+ ";";
			state.executeUpdate(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public DtoSubtema consultarSubtema(String pDescripcion){
		DtoSubtema subtema=new DtoSubtema();
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="SELECT * FROM subtema WHERE descripcion=" + pDescripcion +";";
			ResultSet rs1=state.executeQuery(sql);
			subtema.setDescripcion(rs1.getString(1));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return subtema;
	}
	
	public ArrayList<DtoSubtema> listarSubtemasTema(String DescripcionTema){
		ArrayList<DtoSubtema> listaSubtemas= new ArrayList<DtoSubtema>();
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="SELECT * FROM subtema where tema_descripcion='"+DescripcionTema+"';";
			ResultSet rs1=state.executeQuery(sql);
			while(rs1.next()){
				DtoSubtema subtema=new DtoSubtema();
				subtema.setDescripcion(rs1.getString(1));	
				listaSubtemas.add(subtema);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return listaSubtemas;
	}
	
	
}
