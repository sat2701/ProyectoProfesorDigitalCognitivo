package logicaDeNegocios.factory;

import logicaDeNegocios.Evaluacion;
import logicaDeNegocios.dto.DtoEvaluacion;

public interface FabricaEvaluacion {
	
	public abstract Evaluacion fabricarEvaluacion(DtoEvaluacion dtoEvaluacion);

}
