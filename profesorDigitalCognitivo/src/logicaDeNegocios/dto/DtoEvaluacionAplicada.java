package logicaDeNegocios.dto;

import logicaDeNegocios.Estudiante;
import logicaDeNegocios.Evaluacion;

public class DtoEvaluacionAplicada {
	private double notaObtenida;
	private Evaluacion evaluacionAsociada;
	private Estudiante estudiante;
	private String estado;

	//************************************** GETTERS & SETTERS *****************************************
	public double getNotaObtenida() {
		return notaObtenida;
	}
	public void setNotaObtenida(double notaObtenida) {
		this.notaObtenida = notaObtenida;
	}
	public Evaluacion getEvaluacionAsociada() {
		return evaluacionAsociada;
	}
	public void setEvaluacionAsociada(Evaluacion evaluacionAsociada) {
		this.evaluacionAsociada = evaluacionAsociada;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
