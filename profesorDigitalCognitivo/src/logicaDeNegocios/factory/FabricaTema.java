package logicaDeNegocios.factory;


import logicaDeNegocios.Tema;
import logicaDeNegocios.dto.DtoTema;

public class FabricaTema {
	
	public Tema fabricarTema(DtoTema dtoTema){
		return new Tema(dtoTema.getDescripcion());
	}

}
