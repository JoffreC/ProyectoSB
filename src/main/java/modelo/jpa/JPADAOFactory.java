package modelo.jpa;

import modelo.dao.DAOFactory;
import modelo.dao.LibroDAO;
import modelo.dao.PrestamistaDAO;
import modelo.dao.PrestamoLibroDAO;

public class JPADAOFactory extends DAOFactory {

	@Override
	public LibroDAO getLibroDAO() {
		// TODO Auto-generated method stub
		return new JPALibroDAO();
	}

	@Override
	public PrestamoLibroDAO getPrestamoLibroDAO() {
		// TODO Auto-generated method stub
		return new JPAPrestamoLibroDAO();
	}

	@Override
	public PrestamistaDAO getPrestamistaDAO() {
		// TODO Auto-generated method stub
		return new JPAPrestamistaDAO();
	}

}
