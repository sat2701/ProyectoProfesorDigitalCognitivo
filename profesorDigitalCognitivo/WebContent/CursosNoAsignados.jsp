<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page import = "logicaDeNegocios.dao.DaoCurso"%>
<%@ page import = "logicaDeNegocios.dto.DtoCurso"%>
<html>
<head>
<meta http-equiv="Content-Type">
<link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Cursos sin Profesor</title>
</head>
<body>
	<% DaoCurso listaCursosSin=new DaoCurso();
	 DtoCurso curso1=new DtoCurso(); %>
</body>
	<header>
		<div="main">
			<div class="wrap">
		       		<h2 class=fuenteletra8 >Cursos  <a class="fuenteLetra3">Sin Profesor Asignado</a></h2>
	 		</div>
		</div> 
	  <div class="contenido" style="margin:45px auto"></hr>
	<div class="row">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h4>
            Cursos sin Profesor Asignado
          </h4>
        </div>
        <table class="table table-fixed" >
        	<thead>
            <tr>

              <th class="col-xs-2">Código</th>
              <th class="col-xs-3">Descripción</th>
              <th class="col-xs-3">Profesor Asignado</th>
              <th class="col-xs-3">Opciones</th>
            </tr>
          </thead>
          <tbody>
          	<tr>
				<% for(int i=0; i<listaCursosSin.listarCursosSinProfesor().size();i++){
					curso1=listaCursosSin.listarCursosSinProfesor().get(i);
				%>
									<td><%=curso1.getCodigo() %> </td>
									<td><%=curso1.getDescripcion() %> </td>
									<td>Sin Profesor Asignado</td>
									<td> 
										<form action="/ServletCurso" method="post" >
											<input type="hidden" value="<%=curso1.getCodigo() %>" name="CodigoCursoSinAsignar">
											<input type="hidden" value="<%= session.getAttribute("logueado")%>" name="SesionActual">
											<button type="submit" name="asignarProfe"> <span class="glyphicon glyphicon-pushpin"></span></button>
										</form>
									</td>
        				</tr>
        				<%
        					}
        				 %>
        			</tbody>
		        </table>
		        </div>
		      </div>
		  </div>
		
</html>