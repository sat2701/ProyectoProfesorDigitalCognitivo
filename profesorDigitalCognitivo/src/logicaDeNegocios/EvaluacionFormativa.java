package logicaDeNegocios;

import java.sql.Date;

public class EvaluacionFormativa extends Evaluacion {

	
	//************************************** CONSTRUCTOR *****************************************
	public EvaluacionFormativa(String pNombreEvaluacion, int pPuntajeTotal, double pPorcentajeCurso,
			String pHoraFecha, int pMinutosDisponibles){
		super(pNombreEvaluacion, pPuntajeTotal, pPorcentajeCurso, pHoraFecha, pMinutosDisponibles,"Formativa");
	}
}
