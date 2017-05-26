package logicaDeNegocios;

public class RespuestaDada {
	private Pregunta preguntaAsociada;
	private String respuestaBrindada;
	private boolean isCorrecto;
	
	//************************************** CONSTRUCTOR *****************************************
	public RespuestaDada(Pregunta pPreguntaAsociada, String pRespuestaBrindada, boolean pIsCorrecto){
		setPreguntaAsociada(pPreguntaAsociada);
		setRespuestaBrindada(pRespuestaBrindada);
		setCorrecto(pIsCorrecto);
	}
	
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
