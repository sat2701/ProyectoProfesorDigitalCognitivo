package logicaDeNegocios.factory;

import logicaDeNegocios.Curso;
import logicaDeNegocios.dto.DtoCurso;

public class FabricaCurso {

	public Curso fabricarCurso(DtoCurso dtoCurso){
		return new Curso(dtoCurso.getCodigo(), dtoCurso.getDescripcion());
	}
}
