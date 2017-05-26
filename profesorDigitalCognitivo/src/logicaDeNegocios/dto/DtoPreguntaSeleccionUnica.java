package logicaDeNegocios.dto;

import java.util.ArrayList;

public class DtoPreguntaSeleccionUnica extends DtoPregunta{
	private ArrayList<String> posiblesRespuestas;

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
