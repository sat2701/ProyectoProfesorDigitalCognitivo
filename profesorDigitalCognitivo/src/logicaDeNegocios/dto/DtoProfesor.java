package logicaDeNegocios.dto;

import java.util.ArrayList;

public class DtoProfesor{
	private String idProfesor;
	private String nombre;
	private String correoElectronico;
	private String contrasenia;
	private ArrayList<DtoCurso> cursos;
	
	
	//************************************** GETTERS & SETTERS *****************************************
	public String getIdProfesor() {
		return idProfesor;
	}
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<DtoCurso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<DtoCurso> cursos) {
		this.cursos = cursos;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	//************************************** OTROS METODOS *****************************************
	public void asignarCurso(DtoCurso pCurso){
		cursos.add(pCurso);
	}
}
