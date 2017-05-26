-<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ page import = "logicaDeNegocios.dao.DaoProfesor"%>
	<%@ page import = "logicaDeNegocios.dto.DtoProfesor"%>
<html>
<head>
    <title>Menú Profesores</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
     <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>   
</head>
</style>
<body>	
	<% DaoProfesor listaP=new DaoProfesor();
	 DtoProfesor profesor=new DtoProfesor(); %>
	<header>
		<div="main">
			<div class="wrap">
		       		<h2 class=fuenteletra8>Menú <a class="fuenteLetra3">Profesores</a></h2>
	 		</div>
		</div> 

<div class="contenido" style="margin:45px auto"></hr>
<a href="registrarProfesor.jsp"><button type="button" class="btn btn-primary">Agregar Profesor</button></a></hr>
	<div class="row">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h4>
            Lista de Profesores 
          </h4>
        </div>
        <table class="table table-fixed" >
        	<thead>
            <tr>

              <th class="col-xs-8">Nombre</th>
              <th class="col-xs-2">Correo Electrónico</th>

            </tr>
          </thead>
          <tbody>
          	<tr>
				<% for(int i=0; i<listaP.listarProfesores().size();i++){
					profesor=listaP.listarProfesores().get(i);
				%>
									<td> <%=profesor.getNombre()%></td>
									<td><%=profesor.getCorreoElectronico()%></td>
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