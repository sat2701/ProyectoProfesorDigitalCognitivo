
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Registro Curso</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" media="screen" href="css/style.css">
    <script src="js/jquery-1.7.min.js"></script>
    <script src="js/jquery.easing.1.3.js"></script>
    <script src="js/FF-cash.js"></script>
</head>

</style>
<body>	
	<header>
		<div="main">
			<div class="wrap">
		       		<h2>Registro de <a class="fuenteLetra3">Nuevo Curso </a></h2>
	 		</div>
		</div> 
	

	<div class="contenido">
		<form action="/ServletCurso" method="post">
			<p class="fuenteLetra4">Ingrese todos los datos que se solicitan a continuación.</p>
			<table>
			<tr>
				<td class="fuenteLetra5">Código</td>
				<td><input type="text" placeholder="   código" name="CodigoCurso" /></td>
			</tr>
			<tr>
				<td class="fuenteLetra5">Descripción</td>
				<td><input type="text" placeholder="   descripción" name="Descripcion" /></td>	
			</tr>
			<tr>
				
			</table>
			<button type="submit" class="btn btn-primary" name="registrarCurso">Agregar Curso</button>
		</form>
	</div>
	</header>
</body>
</html>