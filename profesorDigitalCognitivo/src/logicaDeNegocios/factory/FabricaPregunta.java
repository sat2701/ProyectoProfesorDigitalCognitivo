package logicaDeNegocios.factory;

import logicaDeNegocios.Pregunta;
import logicaDeNegocios.dto.DtoPregunta;

public interface FabricaPregunta {

	public abstract Pregunta fabricarPregunta(DtoPregunta dtoPregunta);
}
