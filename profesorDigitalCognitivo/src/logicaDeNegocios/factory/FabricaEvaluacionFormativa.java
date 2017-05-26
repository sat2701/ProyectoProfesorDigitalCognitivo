package logicaDeNegocios.factory;

import logicaDeNegocios.Evaluacion;
import logicaDeNegocios.EvaluacionFormativa;
import logicaDeNegocios.dto.DtoEvaluacion;

public class FabricaEvaluacionFormativa implements FabricaEvaluacion {
	public Evaluacion fabricarEvaluacion(DtoEvaluacion dtoEvaluacion){
		return new EvaluacionFormativa(dtoEvaluacion.getNombreEvaluacion(), dtoEvaluacion.getPuntajeTotal(),
				dtoEvaluacion.getPorcentajeCurso(),dtoEvaluacion.getHoraFecha(), dtoEvaluacion.getMinutosDisponibles());
		
	}

}
