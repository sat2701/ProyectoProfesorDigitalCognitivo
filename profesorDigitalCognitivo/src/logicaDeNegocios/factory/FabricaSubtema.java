package logicaDeNegocios.factory;

import logicaDeNegocios.Subtema;
import logicaDeNegocios.dto.DtoSubtema;

public class FabricaSubtema {
	
	public Subtema fabricarSubtema(DtoSubtema dtoSubtema){
		return new Subtema(dtoSubtema.getDescripcion());
	}

}
