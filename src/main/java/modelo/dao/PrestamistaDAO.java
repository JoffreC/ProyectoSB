package modelo.dao;

import java.util.List;

import modelo.entidades.Prestamista;

public interface PrestamistaDAO extends GenericDAO<Prestamista, Integer> {
	List<Prestamista> getListPrestamistas();
}
