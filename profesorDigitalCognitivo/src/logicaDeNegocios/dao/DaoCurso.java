package logicaDeNegocios.dao;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexionMySql.ConexionSingleton;
import logicaDeNegocios.Curso;
import logicaDeNegocios.dto.DtoCurso;
import logicaDeNegocios.dto.DtoProfesor;

public class DaoCurso {
	
	Statement state;

	public void crearCurso(Curso daoCurso){
		
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="INSERT INTO curso VALUES('" + daoCurso.getCodigo() + "','" + daoCurso.getDescripcion() + "',null);";
			state.executeUpdate(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void eliminarCurso(String pCodigoCurso){
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="DELETE FROM curso WHERE codigo='" + pCodigoCurso+ "';";
			state.executeUpdate(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void actualizarCurso(DtoCurso dtoCurso, String cursoOriginal){
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="UPDATE curso SET codigo='" + dtoCurso.getCodigo()+"', descripcion='" + dtoCurso.getDescripcion() + "' "
					+ "WHERE codigo='" + cursoOriginal + "';";
			state.executeUpdate(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void registrarProfesor(String correoProfesor,String codigoCurso){
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="UPDATE curso SET profesor_correoElectronico='"+correoProfesor+"' WHERE codigo='" + codigoCurso + "';";
			state.executeUpdate(sql);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public DtoCurso consultarCurso(String pCodigo){
		DtoCurso curso=new DtoCurso();
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="SELECT * FROM curso WHERE codigo=" + pCodigo +";";
			ResultSet rs1=state.executeQuery(sql);
			curso.setCodigo(rs1.getString(1));
			curso.setDescripcion(rs1.getString(2));
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return curso;
	}
	
	public ArrayList<DtoCurso> listarCursos(){
		ArrayList<DtoCurso> listaCursos= new ArrayList<DtoCurso>();
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="SELECT codigo,descripcion,nombre FROM curso JOIN profesor ON correoElectronico=profesor_correoElectronico "
					+ "ORDER BY descripcion, correoElectronico;";
			ResultSet rs1=state.executeQuery(sql);
			while(rs1.next()){
				DtoCurso curso=new DtoCurso();	
				curso.setCodigo(rs1.getString(1));
				curso.setDescripcion(rs1.getString(2));
				curso.setNombreProfesor(rs1.getString(3));
				listaCursos.add(curso);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return listaCursos;
	}
	
	public ArrayList<DtoCurso> listarCursosSinProfesor(){
		ArrayList<DtoCurso> listaCursos= new ArrayList<DtoCurso>();
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="SELECT * from curso where profesor_correoElectronico IS NULL;";
			ResultSet rs1=state.executeQuery(sql);
			while(rs1.next()){
				DtoCurso curso=new DtoCurso();	
				curso.setCodigo(rs1.getString(1));
				curso.setDescripcion(rs1.getString(2));
				listaCursos.add(curso);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return listaCursos;
	}
	
	public ArrayList<DtoCurso> listarMisCursos(String correo){
		ArrayList<DtoCurso> listaCursos= new ArrayList<DtoCurso>();
		try {
			state= ConexionSingleton.conectar().createStatement();
			String sql="SELECT * from curso where profesor_correoElectronico='"+correo+"';";
			ResultSet rs1=state.executeQuery(sql);
			while(rs1.next()){
				DtoCurso curso=new DtoCurso();	
				curso.setCodigo(rs1.getString(1));
				curso.setDescripcion(rs1.getString(2));
				curso.setNombreProfesor(rs1.getString(3));
				listaCursos.add(curso);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return listaCursos;
	}

	
	
}
