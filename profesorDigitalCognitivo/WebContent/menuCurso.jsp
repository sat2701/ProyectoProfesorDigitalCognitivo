
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page import = "logicaDeNegocios.dao.DaoCurso"%>
<%@ page import = "logicaDeNegocios.dto.DtoCurso"%>
<html>
<head>

    <title>Menú de Cursos</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>  
</head>

</style>
<body>	
	<% DaoCurso listaC=new DaoCurso();
	 DtoCurso curso=new DtoCurso(); %>
	<header>
		<div class="main">
			<div class="wrap">
		       		<h2 class=fuenteletra8>Menú de <a class="fuenteLetra3"> Cursos </a></h2>
	 		</div>
      </div>
      
      <div class="contenido" ></hr>
      <a href="registrarCurso.jsp"><button type="button" class="btn btn-primary">Agregar Curso</button></a>
      <a href="CursosNoAsignados.jsp"><button type="button" class="btn btn-primary">Cursos Sin Asignar</button></a>
      <a href="MisCursos.jsp"><button type="button" class="btn btn-primary">Mis Cursos</button></a></hr>
      
	<div class="row">
      <div class="panel panel-default">
        <div class="panel-heading">
          <h4>
            Cursos con Profesor Asignado
          </h4>
        </div>
        <table class="table table-fixed" >
        	<thead>
            <tr>

              <th class="col-xs-2">Código</th>
              <th class="col-xs-3">Descripción</th>
              <th class="col-xs-3">Profesor Asignado</th>
            </tr>
          </thead>
          <tbody>
          	<tr>
				<% for(int i=0; i<listaC.listarCursos().size();i++){
					curso=listaC.listarCursos().get(i);
				%>
									<td><%=curso.getCodigo() %> </td>
									<td><%=curso.getDescripcion() %> </td>
									<td><%=curso.getNombreProfesor() %> </td>
        				</tr>
        				<%
        					}
        				 %>
        			</tbody>
		        </table>
		        </div>
		      </div>
		  </div>
      </div>
	</header>
</body>
</html>