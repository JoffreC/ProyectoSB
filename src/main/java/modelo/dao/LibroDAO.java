package modelo.dao;

import java.util.List;

import modelo.entidades.Libro;

public interface LibroDAO extends GenericDAO <Libro, Integer>{
	Libro getByISBN(String isbn);
	List<Libro> getListLibros();
}
