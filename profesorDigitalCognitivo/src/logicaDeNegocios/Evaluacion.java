package logicaDeNegocios;

import java.sql.Date;
import java.util.ArrayList;

import logicaDeNegocios.dto.DtoParteEvaluacion;
import logicaDeNegocios.factory.FabricaParteEvaluacion;

public abstract class Evaluacion {
	private String nombreEvaluacion;
	private int puntajeTotal;
	private double porcentajeCurso;
	private String horaFecha;
	private int minutosDisponibles;
	private boolean isHabilitada;
	private ArrayList<ParteEvaluacion> partesEvaluacion;
	private String tipo;
	
	//************************************** CONSTRUCTOR *****************************************
	public Evaluacion(String pNombreEvaluacion, int pPuntajeTotal, double pPorcentajeCurso, String pHoraFecha,
			int pMinutosDisponibles, String pTipo){
		setNombreEvaluacion(pNombreEvaluacion);
		setPuntajeTotal(pPuntajeTotal);
		setPorcentajeCurso(pPorcentajeCurso);
		setHoraFecha(pHoraFecha);
		setMinutosDisponibles(pMinutosDisponibles);
		setHabilitada(false);
		setTipo(pTipo);
	}
	
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
	public ArrayList<ParteEvaluacion> getPartesEvaluacion() {
		return partesEvaluacion;
	}
	public void setPartesEvaluacion(ArrayList<ParteEvaluacion> pPartesEvaluacion) {
		this.partesEvaluacion = pPartesEvaluacion;
	}	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//************************************** OTROS METODOS *****************************************
	private void agregarParteEvaluacion(DtoParteEvaluacion dtoParte){
		FabricaParteEvaluacion fabrica=new FabricaParteEvaluacion();
		partesEvaluacion.add(fabrica.fabricarEvaluacion(dtoParte));
	}
	
}
