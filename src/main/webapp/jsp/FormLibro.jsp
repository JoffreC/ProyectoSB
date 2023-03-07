<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Libro</title>
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
        <i class="fa-brands fa-facebook fa-2xl"></i>
        <i class="fa-brands fa-instagram fa-2xl"></i>
        <i class="fa-brands fa-youtube fa-2xl"></i>
      </div>
    </section>
    <section class="header-nav border-black">
      <nav class="bg-black">
        <ul class="nav-container">
          	<li><a href="GestionarUsuarioController?ruta=inicio">Menú Principal</a></li>
        </ul>
      </nav>
    </section>
    <section class="form-prestamista">
        <fieldset class="field">
            <form class="formulario" action="GestionarLibroController?ruta=registrar" method="POST">
                <label for="nombre">ISBN: </label>
                <input type="text" name="isbn" required>
                <label for="ci">Título: </label>
                <input type="text" name="titulo" required>
                <label for="direccion">Autor: </label>
                <input type="text" name="autor" required>
                <label for="direccion">Género: </label>
                <input type="text" name="genero" required>
                <label for="direccion">Fecha de publicación: </label>
                <input type="date" name="fechapublicacion" required><br>
                <input type="submit" value="Registrar">
            </form>
        </fieldset>
    </section>
    <div id="footer" class="footer">
      <h3>Términos y Condiciones</h3>
      <p>
        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quidem,
        voluptas provident! Corrupti mollitia veritatis, pariatur eligendi autem
        rerum ipsum facere temporibus adipisci aut maxime necessitatibus
        officiis alias vel tenetur odio?
      </p>
      <p>
        Grupo 8 | Sistema Bibliotecario |
        <a href="https://www.epn.edu.ec"> Escuela Politécnica Nacional</a>
      </p>
    </div>
  </body>
</html>