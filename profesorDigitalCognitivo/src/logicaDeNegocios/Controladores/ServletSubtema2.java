package logicaDeNegocios.Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logicaDeNegocios.dao.DaoSubtema;
import logicaDeNegocios.dto.DtoSubtema;

/**
 * Servlet implementation class ServletSubtema2
 */
@WebServlet("/ServletSubtema2")
public class ServletSubtema2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSubtema2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("botonAgregarSubtemas")!=null){
			response.sendRedirect("registrarSubtema");
			
		}else if(request.getParameter("editarSubtema")!=null){
			
		}else if(request.getParameter("eliminarSubtema")!=null){
			DaoSubtema operacion=new DaoSubtema();
			operacion.eliminarSubtema(request.getParameter("descripcionSubtema"));
			response.sendRedirect("Subtema2.jsp");;
			
		}else if(request.getParameter("agregarPregunta")!=null){
			HttpSession session = request.getSession(true);
			session.setAttribute("DescripcionSubtema",request.getParameter("descripcionSubtema"));
			response.sendRedirect("Preguntas3.jsp");
		}else if(request.getParameter("eliminarSubtema")!=null){
			
		}else if(request.getParameter("registrarSub")!=null){
			DtoSubtema subtema=new DtoSubtema();
			subtema.setDescripcion(request.getParameter("textDescripcionSubtema"));
			DaoSubtema transferir=new DaoSubtema();
			transferir.crearSubtema(subtema.getDescripcion(),request.getParameter("descripcionTema"));
			response.sendRedirect("Subtema2.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
