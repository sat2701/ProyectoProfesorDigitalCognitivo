package logicaDeNegocios.dto;

import java.util.ArrayList;

import logicaDeNegocios.Tema;

public class DtoSubtema {
	private String descripcion;
	private ArrayList<DtoPregunta> preguntas;
	
	private Tema tema;

	
	//************************************** GETTERS & SETTERS *****************************************
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<DtoPregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<DtoPregunta> preguntas) {
		this.preguntas = preguntas;
	}
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}
	

	
	
}
