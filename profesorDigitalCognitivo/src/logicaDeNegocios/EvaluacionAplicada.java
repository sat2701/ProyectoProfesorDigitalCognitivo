package logicaDeNegocios;

import java.util.ArrayList;

public class EvaluacionAplicada {
	private double notaObtenida;
	private Evaluacion evaluacionAsociada;
	private Estudiante estudiante;
	private String estado;
	private ArrayList<RespuestaDada> respuestasDadas;

	//************************************** CONSTRUCTOR *****************************************
	public EvaluacionAplicada(double pNotaObtenida, Evaluacion pEvaluacionAsociada, Estudiante pEstudiante, String pEstado){
		setNotaObtenida(pNotaObtenida);
		setEvaluacionAsociada(pEvaluacionAsociada);
		setEstudiante(pEstudiante);
		setEstado(pEstado);
	}
	
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

	public ArrayList<RespuestaDada> getRespuestasDadas() {
		return respuestasDadas;
	}

	public void setRespuestasDadas(ArrayList<RespuestaDada> respuestasDadas) {
		this.respuestasDadas = respuestasDadas;
	}

	//************************************** OTROS METODOS *****************************************
	public void agregarRespuestasDadas(RespuestaDada pRespuesta){
		respuestasDadas.add(pRespuesta);
	}
	
	public void revisarEvaluacion(){
		
	}
	
}
