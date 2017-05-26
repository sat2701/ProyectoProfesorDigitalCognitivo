package logicaDeNegocios;

import java.util.ArrayList;

public class PreguntaSeleccionUnica extends Pregunta{
	private ArrayList<String> posiblesRespuestas;

	//************************************** CONSTRUCTOR *****************************************
	public PreguntaSeleccionUnica(String pDescripcionPregunta, String pRespuestaCorrecta,
			String pDescripcionAyuda,String pPregunta){
		super("Selección Única", pRespuestaCorrecta, pDescripcionAyuda, pPregunta);
	}
	//************************************** GETTERS & SETTERS *****************************************
	public ArrayList<String> getPosiblesRespuestas() {
		return posiblesRespuestas;
	}

	public void setPosiblesRespuestas(ArrayList<String> pPosiblesRespuestas) {
		this.posiblesRespuestas = pPosiblesRespuestas;
	}
	
	//************************************** OTROS METODOS *****************************************
	public void agregarPosiblesRespuestas(String pRespuesta){
		posiblesRespuestas.add(pRespuesta);
	}
	
}
