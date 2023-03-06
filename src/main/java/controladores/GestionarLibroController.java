package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.DAOFactory;
import modelo.entidades.Libro;

/**
 * Servlet implementation class GestionarLibroController
 */
@WebServlet("/GestionarLibroController")
public class GestionarLibroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public GestionarLibroController() {
        
        
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
			mostrarMenuPrincipalLibros(request, response);
			break;
			
		case "registrar":
			registrarLibro(request, response);
			break;
			
			case "formLibro":
			registrarPrestamista(request, response);
			break;
		case "formDeleteLibro":
			mostrarFormEliminacion(request, response);
			break;
		case "eliminar":
			eliminarLibro(request, response);
			break;
		}
	}
	private void mostrarMenuPrincipalLibros(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.getRequestDispatcher("jsp/GestionarLibros.jsp").forward(request, response);
	}
	private void registrarPrestamista(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.getRequestDispatcher("jsp/FormLibro.jsp").forward(request, response);
	}
	private void registrarLibro(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		Libro libro = new Libro();
		libro.setISBN(request.getParameter("isbn"));
		libro.setTittle(request.getParameter("titulo"));
		libro.setAuthor(request.getParameter("autor"));
		libro.setGender(request.getParameter("genero"));
		libro.setRegistrationDate(request.getParameter("fechapublicacion"));
		DAOFactory.getFactory().getLibroDAO().create(libro);
		request.getRequestDispatcher("jsp/MenuPrincipal.jsp").forward(request, response);
	}
	private void mostrarFormEliminacion(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.getRequestDispatcher("jsp/FormEliminacion.jsp").forward(request, response);
	}
	private void eliminarLibro(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String isbn = request.getParameter("isbn");
		
		Libro libro= DAOFactory.getFactory().getLibroDAO().getByISBN(isbn);
		DAOFactory.getFactory().getLibroDAO().deleteById(libro.getId());
		request.getRequestDispatcher("jsp/MenuPrincipal.jsp").forward(request, response);
	}
}
