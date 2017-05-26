package logicaDeNegocios;

import java.sql.Date;

public class EvaluacionSumativa extends Evaluacion {

	//************************************** CONSTRUCTOR *****************************************
	public EvaluacionSumativa(String pNombreEvaluacion, int pPuntajeTotal, double pPorcentajeCurso,
			String pHoraFecha, int pMinutosDisponibles){
		super(pNombreEvaluacion, pPuntajeTotal, pPorcentajeCurso, pHoraFecha, pMinutosDisponibles, "Sumativa");
	}
}
