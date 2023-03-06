package modelo.dao;

import modelo.jpa.JPADAOFactory;

public abstract class DAOFactory {
	//factory pattern
	//injection dependency
	protected static DAOFactory factory = new JPADAOFactory();
	
	
	public static DAOFactory getFactory() {
		return factory;
	}
	public abstract LibroDAO getLibroDAO();
	public abstract PrestamoLibroDAO getPrestamoLibroDAO();
	public abstract PrestamistaDAO getPrestamistaDAO();
	
}
