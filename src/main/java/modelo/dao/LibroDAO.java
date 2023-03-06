package modelo.dao;

import modelo.entidades.Libro;

public interface LibroDAO extends GenericDAO <Libro, Integer>{
	Libro getByISBN(String isbn);
}
