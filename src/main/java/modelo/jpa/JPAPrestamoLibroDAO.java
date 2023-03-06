package modelo.jpa;

import modelo.dao.PrestamoLibroDAO;
import modelo.entidades.PrestamoLibro;

public class JPAPrestamoLibroDAO extends JPAGenericDAO<PrestamoLibro, Integer> implements PrestamoLibroDAO{
	public JPAPrestamoLibroDAO() {
		super(PrestamoLibro.class);
	}
}
