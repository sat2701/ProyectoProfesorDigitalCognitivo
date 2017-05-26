package logicaDeNegocios.dto;

import java.sql.Date;
import java.util.ArrayList;

public class DtoCurso {
	private String codigo;
	private String descripcion;
	private ArrayList<DtoTema> temas;
	private ArrayList<DtoEstudiante> estudiantes;
	private ArrayList<DtoEvaluacion> evaluaciones;
	private String idProfesor;
	private String nombreProfesor;
		
	//************************************** GETTERS & SETTERS *****************************************
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String pCodigo) {
		this.codigo = pCodigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String pDescripcion) {
		this.descripcion = pDescripcion;
	}
	public ArrayList<DtoTema> getTemas() {
		return temas;
	}
	public void setTemas(ArrayList<DtoTema> pTemas) {
		this.temas = pTemas;
	}
	public ArrayList<DtoEstudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(ArrayList<DtoEstudiante> pEstudiantes) {
		this.estudiantes = pEstudiantes;
	}
	public ArrayList<DtoEvaluacion> getEvaluaciones() {
		return evaluaciones;
	}
	public void setEvaluaciones(ArrayList<DtoEvaluacion> pEvaluaciones) {
		this.evaluaciones = pEvaluaciones;
	}
	public String getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getNombreProfesor() {
		return nombreProfesor;
	}
	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	

}
