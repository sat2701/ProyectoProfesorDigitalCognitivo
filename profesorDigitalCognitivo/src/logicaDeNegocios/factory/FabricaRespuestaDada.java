package logicaDeNegocios.factory;

import logicaDeNegocios.RespuestaDada;
import logicaDeNegocios.dto.DtoRespuesta;


public class FabricaRespuestaDada {
	public RespuestaDada fabricarRespuesta(DtoRespuesta dtoRespuesta){
		return new RespuestaDada(dtoRespuesta.getPreguntaAsociada(),dtoRespuesta.getRespuestaBrindada(),
				dtoRespuesta.isCorrecto());
	}

}
