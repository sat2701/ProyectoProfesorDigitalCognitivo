package logicaDeNegocios;

import java.util.ArrayList;

import logicaDeNegocios.dto.DtoPregunta;
import logicaDeNegocios.factory.FabricaComplete;
import logicaDeNegocios.factory.FabricaDesarrollo;
import logicaDeNegocios.factory.FabricaSeleccionUnica;

public class Subtema {
	private String descripcion;
	private ArrayList<Pregunta> preguntas;

	//************************************** CONSTRUCTOR *****************************************
	public Subtema(String pDescripcion){
		setDescripcion(pDescripcion);
	}
		
	//************************************** GETTERS & SETTERS *****************************************
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	
	//************************************** OTROS METODOS *****************************************
	public void agregarPregunta(DtoPregunta dtoPregunta){
		Pregunta pregunta;
		if(dtoPregunta.getDescripcionPregunta().equals("Seleccion Unica")){
			FabricaSeleccionUnica fabrica= new FabricaSeleccionUnica();
			pregunta = fabrica.fabricarPregunta(dtoPregunta);
		}else if(dtoPregunta.getDescripcionPregunta().equals("Complete")){
			FabricaComplete fabrica= new FabricaComplete();
			pregunta=fabrica.fabricarPregunta(dtoPregunta);
		}else{
			FabricaDesarrollo fabrica=new FabricaDesarrollo();
			pregunta=fabrica.fabricarPregunta(dtoPregunta);
		}
		preguntas.add(pregunta);
	}
		
}
