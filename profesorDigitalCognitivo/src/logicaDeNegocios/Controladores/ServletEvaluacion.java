package logicaDeNegocios.Controladores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logicaDeNegocios.Curso;
import logicaDeNegocios.Evaluacion;
import logicaDeNegocios.dao.DaoEvaluacion;
import logicaDeNegocios.dao.DaoParteEvaluacion;
import logicaDeNegocios.dto.DtoCurso;
import logicaDeNegocios.dto.DtoEvaluacion;
import logicaDeNegocios.dto.DtoParteEvaluacion;
import logicaDeNegocios.factory.FabricaCurso;
import logicaDeNegocios.factory.FabricaEvaluacion;
import logicaDeNegocios.factory.FabricaEvaluacionFormativa;
import logicaDeNegocios.factory.FabricaEvaluacionSumativa;

/**
 * Servlet implementation class ServletEvaluacion
 */
@WebServlet("/ServletEvaluacion")
public class ServletEvaluacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEvaluacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("evaluaciones")!=null){
			response.sendRedirect("Evaluacion.jsp?codigoCurso="+request.getParameter("codigoCurso"));
		}
		else if(request.getParameter("ventanaRegistrar")!=null){
			response.sendRedirect("registrarEvaluacion.jsp?codigoCurso="+request.getParameter("codigoCurso"));
		}
		else if(request.getParameter("registrar")!=null){
			DtoEvaluacion evaluacion= new DtoEvaluacion();
			FabricaEvaluacion fabrica;
			Curso curso = new Curso("","");
			String codigoCurso= request.getParameter("codigoCurso");
			curso.setCodigo(codigoCurso);
			
			int minutos = Integer.parseInt(request.getParameter("minutos"));
			double porcentajeCurso = Double.parseDouble(request.getParameter("porcentajeCurso"));
			int puntaje = Integer.parseInt(request.getParameter("puntaje"));
			
			evaluacion.setCurso(curso);
			evaluacion.setHoraFecha(request.getParameter("horaYFecha"));			
			evaluacion.setHabilitada(false);
			evaluacion.setMinutosDisponibles(minutos);
			evaluacion.setNombreEvaluacion(request.getParameter("nombre"));
			evaluacion.setPorcentajeCurso(porcentajeCurso);
			evaluacion.setPuntajeTotal(puntaje);
			
			if(request.getParameter("tipo").equals("sumativa")){
				fabrica = new FabricaEvaluacionSumativa();
			}else{
				fabrica = new FabricaEvaluacionFormativa();
			}

			Evaluacion evaluacionFabricada= fabrica.fabricarEvaluacion(evaluacion);
			
			curso.agregarEvaluacion(evaluacionFabricada);
			
			DtoParteEvaluacion parteEvaluacion= new DtoParteEvaluacion();
			FabricaEvaluacion fabricaParte;
			String tipo;
			String puntos;
			DaoParteEvaluacion daoParte = new DaoParteEvaluacion();
			String nombreEvaluacion = evaluacionFabricada.getNombreEvaluacion();
			
			if(request.getParameter("seleccionUnica")!=null){
				puntos = request.getParameter("puntosSeleccionUnica");				
				daoParte.crearParteEvaluacion("Selección Única", puntos, codigoCurso, nombreEvaluacion);
			}if(request.getParameter("desarrollo")!=null){
				puntos = request.getParameter("puntosDesarrollo");
				daoParte.crearParteEvaluacion("Desarrollo", puntos, codigoCurso, nombreEvaluacion);
			}if(request.getParameter("complete")!=null){
				puntos = request.getParameter("puntosComplete");
				daoParte.crearParteEvaluacion("Complete", puntos, codigoCurso, nombreEvaluacion);
			}
			//tipo puntaje  	codigoCurso evalNombre
			
			response.sendRedirect("AgregarPreguntasEvaluacion.jsp?codigo="+request.getParameter("codigoCurso")+
					"&nombreEvaluacion=" +request.getParameter("nombre"));
			
	}else if(request.getParameter("habilitarEvaluacion")!=null){
		HttpSession session = request.getSession(true);
		session.setAttribute("Evaluacion",request.getParameter("NombreEvaluacion"));
		response.sendRedirect("estudiantesEvaluacion.jsp");
		
	}else if(request.getParameter("Habilitar")!=null){
		DaoEvaluacion eva=new DaoEvaluacion();
		ArrayList <String> listaCorreos=new ArrayList<String>();
		String[] correos=request.getParameterValues("seleccion");
		for(int check=0;check<request.getParameterValues("seleccion").length; check++){
			if(correos!=null){
				listaCorreos.add(correos[check]);
				
			}
		}
		eva.habilitarEvaluacion(request.getParameter("CodigoCursoActual"), request.getParameter("NombreEvaluacionActual"),listaCorreos);
		response.sendRedirect("EvaluacionesNoHabilitadas.jsp");
	}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		


}
}
