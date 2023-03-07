package controladores;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.DAOFactory;
import modelo.entidades.*;


@WebServlet("/GestionarPrestamoController")
public class GestionarPrestamoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GestionarPrestamoController() {
        
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		rutear(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		rutear(request, response);
	}
	
	private void rutear(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ruta = (request.getParameter("ruta") == null)? "menu" : request.getParameter("ruta");
		switch(ruta) {
		case "menu": 
			mostrarFormPrestamo(request, response);
			break;
		case "registro": 
			registrarPrestamo(request, response);
			break;
		
		}
			


	}
	
	private void mostrarFormPrestamo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		List<Prestamista> prestamistas = DAOFactory.getFactory().getPrestamistaDAO().getListPrestamistas();
		List<Libro> libros = DAOFactory.getFactory().getLibroDAO().getListLibros();
		request.setAttribute("libros", libros);
		request.setAttribute("prestamistas", prestamistas);
		request.getRequestDispatcher("jsp/FormPrestamo.jsp").forward(request, response);
	}
	
	private void registrarPrestamo(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		PrestamoLibro prestamoLibro = new PrestamoLibro();
		prestamoLibro.setDateBookLend(getFechaActual());
		prestamoLibro.setPrestamista(DAOFactory.getFactory().getPrestamistaDAO().getById(Integer.parseInt(request.getParameter("prestamista-id"))));
		prestamoLibro.getBookLendedList().add(DAOFactory.getFactory().getLibroDAO().getById(Integer.parseInt(request.getParameter("libro-id"))));
		prestamoLibro.setDaysLended(Integer.parseInt(request.getParameter("dias")));
		DAOFactory.getFactory().getPrestamoLibroDAO().create(prestamoLibro);
		request.getRequestDispatcher("jsp/MenuPrincipal.jsp").forward(request, response);
	}
	
	private String getFechaActual() {
		LocalDate fecha = LocalDate.now(); // Obtener la fecha actual
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return fecha.format(formatter);
	}

}
