<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminar Libro</title>
<link rel="stylesheet" href="css/estilo.css">
<script
      src="https://kit.fontawesome.com/3a2a321853.js"
      crossorigin="anonymous"
    ></script>
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
				<li><a href="GestionarUsuarioController?ruta=inicio">Menú Principal</a></li>
			</ul>
		</nav>
	</section>
	<br>
	<section class="tabla-container">
	<h3>Tabla Libros Existentes</h3>
	<table>
		<tr>
			<th>ID</th>
			<th>Título</th>
			<th>Género</th>
		</tr>
		<tr>
			<c:forEach items="${libros}" var="Libro">
				<tr>
					<td>${Libro.id}</td>
					<td>${Libro.tittle}</td>
					<td>${Libro.gender}</td>
				</tr>
			</c:forEach>
		</tr>
	</table>
	</section>
	
	<section class="form-prestamista">
		<fieldset class="field">
			<form class="formulario"
				action="GestionarLibroController?ruta=eliminar" method="POST">
				
				<label for="direccion">Digite el ID a eliminar: </label> <input
					type="text" name="id" required> <input type="submit"
					value="Eliminar">
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