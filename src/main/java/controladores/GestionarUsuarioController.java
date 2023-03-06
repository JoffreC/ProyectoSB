package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.dao.DAOFactory;
import modelo.entidades.Prestamista;


@WebServlet("/GestionarUsuarioController")
public class GestionarUsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    
    public GestionarUsuarioController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		rutear(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		rutear(request, response);
	}
	
	private void rutear(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ruta = (request.getParameter("ruta") == null)? "inicio" : request.getParameter("ruta");
		switch(ruta) {
		case "inicio": 
			mostrarMenuPrincipal(request, response);
			break;
		case "prestamista":
			registrarPrestamista(request, response);
			break;
		case "formPrestamista":
			mostrarFormPrestamista(request, response);
			break;
		}
	}
	private void mostrarMenuPrincipal(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.getRequestDispatcher("jsp/MenuPrincipal.jsp").forward(request, response);
	}
	private void registrarPrestamista(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		Prestamista prestamista = new Prestamista();
		prestamista.setName(request.getParameter("nombre"));
		prestamista.setCI(request.getParameter("ci"));
		prestamista.setAddress(request.getParameter("direccion"));
		DAOFactory.getFactory().getPrestamistaDAO().create(prestamista);
		request.getRequestDispatcher("jsp/MenuPrincipal.jsp").forward(request, response);
	}
	private void mostrarFormPrestamista(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		request.getRequestDispatcher("jsp/FormPrestamista.jsp").forward(request, response);
	}
	
	
	
		

}
