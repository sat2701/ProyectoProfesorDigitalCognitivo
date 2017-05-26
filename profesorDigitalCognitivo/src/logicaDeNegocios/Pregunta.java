package logicaDeNegocios;

public abstract class Pregunta {
	protected String pregunta;
	protected String descripcionPregunta;
	protected String respuestaCorrecta;
	protected String descripcionAyuda;
	
	
	//************************************** CONSTRUCTOR *****************************************
	public Pregunta(String pDescripcionPregunta, String pRespuestaCorrecta, String pDescripcionAyuda, String pPregunta){
		setDescripcionPregunta(pDescripcionPregunta);
		setRespuestaCorrecta(pRespuestaCorrecta);
		setDescripcionAyuda(pDescripcionAyuda);
		setPregunta(pPregunta);
	}
	


	//************************************** GETTERS & SETTERS *****************************************
	public String getDescripcionPregunta() {
		return descripcionPregunta;
	}
	public void setDescripcionPregunta(String descripcionPregunta) {
		this.descripcionPregunta = descripcionPregunta;
	}
	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}
	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}
	public String getDescripcionAyuda() {
		return descripcionAyuda;
	}
	public void setDescripcionAyuda(String descripcionAyuda) {
		this.descripcionAyuda = descripcionAyuda;
	}
	public String getPregunta() {
		return pregunta;
	}
	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}
	
	
}
