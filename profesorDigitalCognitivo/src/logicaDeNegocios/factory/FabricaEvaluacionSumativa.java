package logicaDeNegocios.factory;

import logicaDeNegocios.EvaluacionSumativa;
import logicaDeNegocios.dto.DtoEvaluacion;

public class FabricaEvaluacionSumativa implements FabricaEvaluacion{
		public EvaluacionSumativa fabricarEvaluacion(DtoEvaluacion dtoEvaluacion){
			return new EvaluacionSumativa(dtoEvaluacion.getNombreEvaluacion(), dtoEvaluacion.getPuntajeTotal(),
					dtoEvaluacion.getPorcentajeCurso(),dtoEvaluacion.getHoraFecha(), dtoEvaluacion.getMinutosDisponibles());
			
		}
}
