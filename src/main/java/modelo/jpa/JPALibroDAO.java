package modelo.jpa;

import java.util.List;

import javax.persistence.TypedQuery;

import modelo.dao.LibroDAO;
import modelo.entidades.Libro;

public class JPALibroDAO extends JPAGenericDAO<Libro, Integer> implements LibroDAO {

	public JPALibroDAO() {
		super(Libro.class);
	}
	
	
	public Libro getByISBN(String isbn) {
	    String jpql = "SELECT l FROM Libro l WHERE l.ISBN = :isbn";
	    TypedQuery<Libro> query = em.createQuery(jpql, Libro.class);
	    query.setParameter("isbn", isbn);
	    return query.getSingleResult();
	}


	@Override
	public List<Libro> getListLibros() {
		 
		return  em.createQuery("SELECT l FROM Libro l", Libro.class).getResultList();
	}
	


}
