<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Registro Préstamo</title>
<script src="https://kit.fontawesome.com/3a2a321853.js"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/estilo.css">
</head>

<body>
	<section class="header-container">
		<div class="logo-container">
			<i class="fa-solid fa-book fa-2xl book-icon"></i>
			<p id="logo-txt">Sistema Bibliotecario</p>
			<i class="fa-solid fa-book fa-2xl book-icon"></i>
		</div>

		<div class="redes-sociales">
			<i class="fa-brands fa-facebook fa-2xl"></i> <i
				class="fa-brands fa-instagram fa-2xl"></i> <i
				class="fa-brands fa-youtube fa-2xl"></i>
		</div>
	</section>
	<section class="header-nav border-black">
		<nav class="bg-black">
			<ul class="nav-container">
				<li><a href="GestionarUsuarioController?ruta=inicio">Menú
						Principal</a></li>
			</ul>
		</nav>
	</section>
	<section class="form-prestamista">
		<fieldset class="field">
			<form class="formulario"
				action="GestionarPrestamoController?ruta=registro" method="POST">
				<label for="nombre">Escoga el Prestamista: </label> <select name="prestamista-id">
					<c:forEach var="prestamista" items="${prestamistas}">
						<option  value="${prestamista.id}">${prestamista.name}</option>
					</c:forEach>
				</select>
				<label for="nombre">Escoga el Libro: </label> <select name ="libro-id">
					<c:forEach var="libro" items="${libros}">
						<option value="${libro.id}">${libro.tittle}</option>
					</c:forEach>
				</select>
				<label>Escoga el número de días de préstamo</label>
				<input name="dias" type="number" min="1" max="5"> 
				<input type="submit"
					value="Registrar">
			</form>
		</fieldset>
	</section>
	<div id="footer" class="footer">
		<h3>Términos y Condiciones</h3>
		<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
			Quidem, voluptas provident! Corrupti mollitia veritatis, pariatur
			eligendi autem rerum ipsum facere temporibus adipisci aut maxime
			necessitatibus officiis alias vel tenetur odio?</p>
		<p>
			Grupo 8 | Sistema Bibliotecario | <a href="https://www.epn.edu.ec">
				Escuela Politécnica Nacional</a>
		</p>
	</div>
</body>
</html>