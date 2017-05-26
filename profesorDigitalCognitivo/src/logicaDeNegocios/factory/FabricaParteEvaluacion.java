package logicaDeNegocios.factory;

import logicaDeNegocios.ParteEvaluacion;
import logicaDeNegocios.dto.DtoParteEvaluacion;

public class FabricaParteEvaluacion {
	
	public ParteEvaluacion fabricarEvaluacion(DtoParteEvaluacion dtoParteEvaluacion){
		return new ParteEvaluacion(dtoParteEvaluacion.getTipoParte(), dtoParteEvaluacion.getPuntajeAsignado());
	}

}
