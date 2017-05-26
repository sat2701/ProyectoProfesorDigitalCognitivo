package logicaDeNegocios.factory;

import logicaDeNegocios.Pregunta;
import logicaDeNegocios.PreguntaSeleccionUnica;
import logicaDeNegocios.dto.DtoPregunta;

public class FabricaSeleccionUnica {

	public Pregunta fabricarPregunta(DtoPregunta dtoPregunta){
		return new PreguntaSeleccionUnica(dtoPregunta.getDescripcionPregunta(), dtoPregunta.getRespuestaCorrecta(),
				dtoPregunta.getDescripcionAyuda(),dtoPregunta.getPregunta());
	}
}
