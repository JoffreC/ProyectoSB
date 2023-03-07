package modelo.jpa;

import java.util.List;

import javax.persistence.TypedQuery;

import modelo.dao.LibroDAO;
import modelo.entidades.Libro;

public class JPALibroDAO extends JPAGenericDAO<Libro, Integer> implements LibroDAO {

	public JPALibroDAO() {
		super(Libro.class);
	}
	
	
	public Libro getByISBN(String id) {
	    String jpql = "SELECT l FROM Libro l WHERE l.id = :id";
	    TypedQuery<Libro> query = em.createQuery(jpql, Libro.class);
	    query.setParameter("id", id);
	    return query.getSingleResult();
	}


	@Override
	public List<Libro> getListLibros() {
		 
		return  em.createQuery("SELECT l FROM Libro l", Libro.class).getResultList();
	}
	


}
