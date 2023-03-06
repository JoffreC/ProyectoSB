package modelo.jpa;

import java.util.List;

import modelo.dao.PrestamistaDAO;
import modelo.entidades.Prestamista;

public class JPAPrestamistaDAO extends JPAGenericDAO<Prestamista, Integer> implements PrestamistaDAO {


public JPAPrestamistaDAO() {
	super(Prestamista.class);
}

}
