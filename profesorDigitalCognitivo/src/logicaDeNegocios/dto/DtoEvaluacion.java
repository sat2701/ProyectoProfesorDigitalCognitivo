package logicaDeNegocios.dto;

import java.sql.Date;
import java.util.ArrayList;

import logicaDeNegocios.Curso;

public class DtoEvaluacion {
	private String nombreEvaluacion;
	private int puntajeTotal;
	private double porcentajeCurso;
	private String horaFecha;
	private int minutosDisponibles;
	private boolean isHabilitada;
	private String tipo;
	private ArrayList<DtoParteEvaluacion> partesEvaluacion;
	private Curso curso;
	
	//************************************** GETTERS & SETTERS *****************************************
	public String getNombreEvaluacion() {
		return nombreEvaluacion;
	}
	public void setNombreEvaluacion(String nombreEvaluacion) {
		this.nombreEvaluacion = nombreEvaluacion;
	}
	public int getPuntajeTotal() {
		return puntajeTotal;
	}
	public void setPuntajeTotal(int puntajeTotal) {
		this.puntajeTotal = puntajeTotal;
	}
	public double getPorcentajeCurso() {
		return porcentajeCurso;
	}
	public void setPorcentajeCurso(double porcentajeCurso) {
		this.porcentajeCurso = porcentajeCurso;
	}
	public String getHoraFecha() {
		return horaFecha;
	}
	public void setHoraFecha(String horaFecha) {
		this.horaFecha = horaFecha;
	}
	public int getMinutosDisponibles() {
		return minutosDisponibles;
	}
	public void setMinutosDisponibles(int minutosDisponibles) {
		this.minutosDisponibles = minutosDisponibles;
	}
	public boolean isHabilitada() {
		return isHabilitada;
	}
	public void setHabilitada(boolean isHabilitada) {
		this.isHabilitada = isHabilitada;
	}
	public ArrayList<DtoParteEvaluacion> getPartesEvaluacion() {
		return partesEvaluacion;
	}
	public void setPartesEvaluacion(ArrayList<DtoParteEvaluacion> pPartesEvaluacion) {
		this.partesEvaluacion = pPartesEvaluacion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	

}
