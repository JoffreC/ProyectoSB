<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Menu Principal</title>
    <script
      src="https://kit.fontawesome.com/3a2a321853.js"
      crossorigin="anonymous"
    ></script>
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
        <i class="fa-brands fa-facebook fa-2xl"></i>
        <i class="fa-brands fa-instagram fa-2xl"></i>
        <i class="fa-brands fa-youtube fa-2xl"></i>
      </div>
    </section>
    <section class="header-nav border-black">
      <nav class="bg-black">
        <ul class="nav-container">
          <li><a href="GestionarUsuarioController?ruta=formPrestamista">Registrar Prestamista</a></li>
          <li><a href="GestionarLibroController?ruta=menu">Gestión Libros</a></li>
          <li><a href="GestionarPrestamoController?ruta=menu">Registrar Préstamo</a></li>
        </ul>
      </nav>
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