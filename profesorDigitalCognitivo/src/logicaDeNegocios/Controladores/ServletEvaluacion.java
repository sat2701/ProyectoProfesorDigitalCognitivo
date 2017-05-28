package logicaDeNegocios.Controladores;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.OutputStream;

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
import serviciosCognitivos.GenerarPDF;

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
		String[] correos=request.getParameterValues("seleccion");
		eva.habilitarEvaluacion(request.getParameter("CodigoCursoActual"), request.getParameter("NombreEvaluacionActual"),correos);
		response.sendRedirect("EvaluacionesNoHabilitadas.jsp");
	}
	else if(request.getParameter("GenerarPDF")!=null){
		DaoEvaluacion datosEvaluacion= new DaoEvaluacion();
		response.setContentType("application/pdf");
		ServletOutputStream out= response.getOutputStream();
		try{
			try{
				//FileOutputStream archivo = new FileOutputStream(home+"/Downloads/Evaluacion.pdf");
				//FileOutputStream archivo = new FileOutputStream(home+"/Downloads/Evaluacion.jsp");
				Document doc= new Document();
				PdfWriter.getInstance(doc, out);
				doc.open();
				
				Paragraph titulo=new Paragraph();
				Font fontTitulo=new Font(Font.FontFamily.HELVETICA,16,Font.BOLD,BaseColor.BLACK);
				titulo.add(new Phrase("Evaluacion Consultada",fontTitulo));
				titulo.setAlignment(Element.ALIGN_CENTER);
				doc.add(titulo);
				
				Paragraph parrafo=new Paragraph();
				Font fontParrafo=new Font(Font.FontFamily.HELVETICA,16,Font.BOLD,BaseColor.BLACK);
				parrafo.add(new Phrase(datosEvaluacion.consultarInfoEvaluacion(request.getParameter("NombreEvaluacion"),request.getParameter("CodigoCursoActual")),fontParrafo));
				parrafo.setAlignment(Element.ALIGN_CENTER);
				doc.add(parrafo);
				
				doc.close();
				
			}catch(Exception e1){
				e1.getMessage();
			}
		}finally{
			out.close();
		}
	}
}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		


}
}
