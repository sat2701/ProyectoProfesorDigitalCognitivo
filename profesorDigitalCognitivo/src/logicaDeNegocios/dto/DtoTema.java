package logicaDeNegocios.dto;

import java.util.ArrayList;

import logicaDeNegocios.Curso;

public class DtoTema {
	private String descripcion;
	private ArrayList<DtoSubtema> subtemas;
	private Curso curso;

	
	//************************************** GETTERS & SETTERS *****************************************
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public ArrayList<DtoSubtema> getSubtemas() {
		return subtemas;
	}

	public void setSubtemas(ArrayList<DtoSubtema> subtemas) {
		this.subtemas = subtemas;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
}
