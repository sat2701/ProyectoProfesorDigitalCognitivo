package logicaDeNegocios;

import java.util.ArrayList;


import logicaDeNegocios.dto.DtoSubtema;
import logicaDeNegocios.factory.FabricaSubtema;


public class Tema {
	private String descripcion;
	private ArrayList<Subtema> subtemas;

	//************************************** CONSTRUCTOR *****************************************
	public Tema(String pDescripcion){
		setDescripcion(pDescripcion);
	}

	//************************************** GETTERS & SETTERS *****************************************
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public ArrayList<Subtema> getSubtemas() {
		return subtemas;
	}

	public void setSubtemas(ArrayList<Subtema> subtemas) {
		this.subtemas = subtemas;
	}
	
	//************************************** OTROS METODOS *****************************************
	public void agregarSubtema(DtoSubtema dtoSubtema){
		FabricaSubtema subtema=new FabricaSubtema();
		subtemas.add(subtema.fabricarSubtema(dtoSubtema));
	}
	
	public void agregarSubtema(Subtema subTema){
		subtemas.add(subTema);
	}
	
}
