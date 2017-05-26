package logicaDeNegocios.dto;

import logicaDeNegocios.Pregunta;

public class DtoRespuesta {
	private Pregunta preguntaAsociada;
	private String respuestaBrindada;
	private boolean isCorrecto;
	
	//************************************** GETTERS & SETTERS *****************************************
	public Pregunta getPreguntaAsociada() {
		return preguntaAsociada;
	}
	public void setPreguntaAsociada(Pregunta preguntaAsociada) {
		this.preguntaAsociada = preguntaAsociada;
	}
	public String getRespuestaBrindada() {
		return respuestaBrindada;
	}
	public void setRespuestaBrindada(String respuestaBrindada) {
		this.respuestaBrindada = respuestaBrindada;
	}
	public boolean isCorrecto() {
		return isCorrecto;
	}
	public void setCorrecto(boolean isCorrecto) {
		this.isCorrecto = isCorrecto;
	}

}
