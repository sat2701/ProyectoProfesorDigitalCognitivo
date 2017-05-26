package logicaDeNegocios.factory;

import logicaDeNegocios.Pregunta;
import logicaDeNegocios.PreguntaComplete;
import logicaDeNegocios.dto.DtoPregunta;

public class FabricaComplete {
	
	public PreguntaComplete fabricarPregunta(DtoPregunta dtoPregunta){
		return new PreguntaComplete(dtoPregunta.getDescripcionPregunta(), dtoPregunta.getRespuestaCorrecta(),
				dtoPregunta.getDescripcionAyuda(),dtoPregunta.getPregunta());
	}

}
