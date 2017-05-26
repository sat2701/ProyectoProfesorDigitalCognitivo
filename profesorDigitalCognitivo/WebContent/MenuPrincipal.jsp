<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>About</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
    <script src="js/jquery-1.7.min.js"></script>
    <script src="js/jquery.easing.1.3.js"></script>
    <script src="js/FF-cash.js"></script>
</head>
<body>
<div id="fb-root"></div>



<!--==============================header=================================-->
<header>
	<div class="main">
		<div class="wrap">
	       		<h1><a href="index.jsp"><img src="images/logo.png" alt=""></a>
	 	</div>
	</div> 


	<div class="header-content">
      	<div class="wrap main">
      	
      		<H3>Bienvenido <%= session.getAttribute("logueado")%></H3>
      		<form action="/MenuPrincipal" method="post">
      			<input type="submit" name="cerrar" value="Cerrar Sesión">
      		</form>
      		
      		
      		
      		<div class="block-1">
			<img src="images/cursos.jpg" alt="" class="img-radius">	
			<div class="border-1">
						
            			<a href="menuCurso.jsp" class="button-2 top-1">Cursos</a>
            		</div>
        	</div>
        	<div class="block-1">
        		<img src="images/estudiante.jpg" alt="" class="img-radius">
        		<div class="border-1">
        	        	<a href="menuEstudiantes.jsp" class="button-2 top-1">Estudiantes</a>
           		</div>
       		</div>
        	<div class="block-1">
        		<img src="images/profesores.jpg" alt="" class="img-radius">
            		<div>
		            	<a href="menuProfesores.jsp" class="button-2 top-1">Profesores</a>
            		</div>
        	</div>
     	</div>
</div>
</header>
<div class="ic"></div>

<!--==============================footer=================================-->
  <footer>
     	<a class="fuenteLetra1"	>2017 realizado por </a><a class="fuenteLetra2" href="https://www.youtube.com/watch?v=XKQzAFgSPJY" target="_blank"> Los Rebeldes del Swing</a>
  </footer>	
</body>
</html>