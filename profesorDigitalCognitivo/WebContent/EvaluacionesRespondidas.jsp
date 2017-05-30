<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
	<%@ page import = "logicaDeNegocios.dao.DaoEvaluacionAplicada"%>
	<%@ page import = "logicaDeNegocios.dto.DtoEvaluacionAplicada"%>
<html>
<head>
    <title>Estado de la Evaluación</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
     <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   
    
</head>
</head>
<body>
	<% DaoEvaluacionAplicada listaAplicada=new DaoEvaluacionAplicada();
	 DtoEvaluacionAplicada estado=new DtoEvaluacionAplicada(); %>
	<header>
		<div="main">
			<div class="wrap">
		       		<h2 class=fuenteletra8 >Respuestas de la <a class="fuenteLetra3">Evaluación</a></h2>
	 		</div>
		</div> 
     <div class="contenido" style="margin:45px auto"></hr>
     <form action="/ServletEvaluacion" method="get">
	<div class="row">
      <div class="panel panel-default">
      
        <div class="panel-heading">
          <h4>
            Respuestas de la Evaluación Realizada:
          </h4>
        </div>
        
        <table class="table table-fixed" >
        	<thead>
            <tr>

              <th class="col-xs-2">Tipo Pregunta</th>}
              <th class="col-xs-2">Pregunta</th>
              <th class="col-xs-2">Respuesta</th>
              <th class="col-xs-3">Correcto</th>
              <th class="col-xs-3">Puntos Obtenidos</th>
            
            </tr>
          </thead>
          <tbody>
          	<tr>
				<% 
				String curso=session.getAttribute("IdentificadorCurso").toString();
				String evaluacion=session.getAttribute("NombreEvaluacion").toString();
				int condicion=listaAplicada.listarEstadoEvaluaciones(curso, evaluacion).size();
					for(int i=0; i<condicion;i++){
					estado=listaAplicada.listarEstadoEvaluaciones(curso, evaluacion).get(i);
				%>
									<td><%=estado.getIdEstudiante() %> </td>
									<td><%=estado.getNombreEstudiante()%> </td>
									<td><%=estado.getEstado() %>
									<td><%=estado.getEstado() %>
									<input type="hidden" name="Estudiante" value="<%=estado.getIdEstudiante() %>">
									<input type="hidden" name="CodigoCursoActual" value="<%=session.getAttribute("IdentificadorCurso").toString()%>">
									<input type="hidden" name="NombreEvaluacion" value="<%=session.getAttribute("NombreEvaluacion").toString() %>"></td>
									<td>Muchos jeje</td>
        				</tr>
        				<%
        					}
        				 %>
        			</tbody>
		        </table>
		        </div>
		      </div>
		      </form>
		  </div>
	</body>
</html>
