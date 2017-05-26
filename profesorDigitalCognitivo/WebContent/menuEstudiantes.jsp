-<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
	<%@ page import = "logicaDeNegocios.dao.DaoEstudiante"%>
	<%@ page import = "logicaDeNegocios.dto.DtoEstudiante"%>
<html>
<head>
    <title>Menú Estudiantes</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
     <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   
    
</head>
</style>
<body>	
	<% DaoEstudiante listaE=new DaoEstudiante();
	 DtoEstudiante estudiante=new DtoEstudiante(); %>
	<header>
		<div="main">
			<div class="wrap">
		       		<h2 class=fuenteletra8>Menú <a class="fuenteLetra3">Estudiantes</a></h2>
	 		</div>
		</div> 
     <div class="contenido" style="margin:45px auto"></hr>
     <a href="registrarEstudiante.jsp"><button type="button" class="btn btn-primary">Agregar Estudiante</button></a></hr>
	<div class="row">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h4>
            Lista de Estudiantes
          </h4>
        </div>
        <table class="table table-fixed" >
        	<thead>
            <tr>

              <th class="col-xs-2">Id Estudiante</th>
              <th class="col-xs-2">Nombre</th>
              <th class="col-xs-2">Carné</th>
              <th class="col-xs-2">Fecha Nacimiento</th>
              <th class="col-xs-2">Correo Electrónico</th>
            </tr>
          </thead>
          <tbody>
          	<tr>
				<% for(int i=0; i<listaE.crearListado().size();i++){
					estudiante=listaE.crearListado().get(i);
				%>
									<td><%=estudiante.getIdEstudiante() %> </td>
									<td><%=estudiante.getNombre() + " " + estudiante.getPrimerApellido() + " " + estudiante.getSegundoApellido() %> </td>
									<td><%=estudiante.getNumeroCarne() %></td>
									<td><%=estudiante.getFechaNacimiento() %></td>
									<td><%=estudiante.getCorreo() %></td>
        				</tr>
        				<%
        					}
        				 %>
        			</tbody>
		        </table>
		        </div>
		      </div>
		  </div>
	</body>
</html>