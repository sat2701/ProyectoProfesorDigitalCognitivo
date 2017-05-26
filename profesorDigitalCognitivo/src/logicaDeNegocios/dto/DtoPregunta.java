package logicaDeNegocios.dto;

public class DtoPregunta {
	private String descripcionPregunta;
	private String respuestaCorrecta;
	private String descripcionAyuda;
	private String pregunta;
	private String subtema;
	private String tema;
	
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
	public String getSubtema() {
		// TODO Auto-generated method stub
		return subtema;
	}
	public void setSubtema(String subtema) {
		this.subtema = subtema;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	
}
