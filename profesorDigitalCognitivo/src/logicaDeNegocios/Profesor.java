package logicaDeNegocios;

import java.util.ArrayList;

import logicaDeNegocios.dao.DaoProfesor;

public class Profesor{
	private String correo;
	private String contrasenia;
	private String nombre;
	private ArrayList<Curso> cursos;
	
	//************************************** CONSTRUCTOR *****************************************
	public Profesor(String pNombre, String pCorreo, String pContrasenia){
		setNombre(pNombre);
		setCorreo(pCorreo);
		setContrasenia(pContrasenia);
	}
	
	//************************************** GETTERS & SETTERS *****************************************

	public String getNombre() {
		return nombre;
	}
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
	//************************************** OTROS METODOS *****************************************
	public void almacenarProfesor(Profesor pProfesor){
		DaoProfesor crearP=new DaoProfesor();
		crearP.crearProfesor(pProfesor);
	}
	
}