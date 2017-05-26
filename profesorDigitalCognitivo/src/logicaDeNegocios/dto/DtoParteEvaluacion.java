package logicaDeNegocios.dto;
import java.util.ArrayList;

public class DtoParteEvaluacion {
	private String tipoParte;
	private int puntajeAsignado;
	private ArrayList<DtoPregunta> preguntas;
	private double puntajePorPregunta;
	
	
	//************************************** GETTERS & SETTERS *****************************************
	public String getTipoParte() {
		return tipoParte;
	}
	public void setTipoParte(String tipoParte) {
		this.tipoParte = tipoParte;
	}
	public int getPuntajeAsignado() {
		return puntajeAsignado;
	}
	public void setPuntajeAsignado(int puntajeAsignado) {
		this.puntajeAsignado = puntajeAsignado;
	}
	public ArrayList<DtoPregunta> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(ArrayList<DtoPregunta> preguntas) {
		this.preguntas = preguntas;
	}
	public double getPuntajePorPregunta() {
		return puntajePorPregunta;
	}
	public void setPuntajePorPregunta() {
		this.puntajePorPregunta = getPuntajeAsignado()/ getPreguntas().size();
	}
	
	//************************************** OTROS METODOS *****************************************
	public void agregarPreguntas(DtoPregunta pPregunta){
		preguntas.add(pPregunta);
	}
	
	
	
}
