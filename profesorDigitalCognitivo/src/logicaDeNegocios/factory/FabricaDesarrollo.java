package logicaDeNegocios.factory;

import logicaDeNegocios.Pregunta;
import logicaDeNegocios.PreguntaDesarrollo;
import logicaDeNegocios.dto.DtoPregunta;

public class FabricaDesarrollo {
	
	public Pregunta fabricarPregunta(DtoPregunta dtoPregunta){
		return new PreguntaDesarrollo(dtoPregunta.getDescripcionPregunta(), dtoPregunta.getRespuestaCorrecta(),
				dtoPregunta.getDescripcionAyuda(),dtoPregunta.getPregunta());
	}

}
