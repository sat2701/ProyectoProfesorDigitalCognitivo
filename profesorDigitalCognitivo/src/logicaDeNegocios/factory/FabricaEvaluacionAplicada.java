package logicaDeNegocios.factory;

import logicaDeNegocios.EvaluacionAplicada;
import logicaDeNegocios.dto.DtoEvaluacionAplicada;

public class FabricaEvaluacionAplicada {
	public EvaluacionAplicada fabricarEvaluacionRealizada(DtoEvaluacionAplicada dtoEvaluacionRealizada){
		return new EvaluacionAplicada(dtoEvaluacionRealizada.getNotaObtenida(), dtoEvaluacionRealizada.getEvaluacionAsociada(),
				dtoEvaluacionRealizada.getEstudiante(),dtoEvaluacionRealizada.getEstado());
	}
}
