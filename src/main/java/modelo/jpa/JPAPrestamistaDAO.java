package modelo.jpa;

import java.util.List;

import modelo.dao.PrestamistaDAO;
import modelo.entidades.Libro;
import modelo.entidades.Prestamista;

public class JPAPrestamistaDAO extends JPAGenericDAO<Prestamista, Integer> implements PrestamistaDAO {


public JPAPrestamistaDAO() {
	super(Prestamista.class);
}

@Override
public List<Prestamista> getListPrestamistas() {
	
	return  em.createQuery("SELECT p FROM Prestamista p", Prestamista.class).getResultList();
}

}
