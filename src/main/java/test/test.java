package test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import modelo.dao.DAOFactory;
import modelo.entidades.*;

public class test {

	public static void main(String[] args) {
		Prestamista prestamista = new Prestamista();
		prestamista.setAddress("Guajalo");
		prestamista.setCI("172600435");
		prestamista.setName("Jimmy");
		
		for(int i=0;i<5;i++) {
			DAOFactory.getFactory().getPrestamistaDAO().create(prestamista);
		}
		
		Libro libro = new Libro();
		libro.setAuthor("Jimmy");
		libro.setGender("novela");
		libro.setISBN("1234");
		libro.setTittle("La Peste");
		LocalDate fecha = LocalDate.now(); // Obtener la fecha actual
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Crear un formateador
		String fechaFormateada = fecha.format(formatter);
		libro.setRegistrationDate(fechaFormateada);
		for(int i=0;i<5;i++) {
			DAOFactory.getFactory().getLibroDAO().create(libro);
		}
		
		
		/*
		 * PrestamoLibro prestamoLibro = new PrestamoLibro();
		prestamoLibro.setDateBookLend(fechaFormateada);
		prestamoLibro.setMulct(564.0);
		prestamoLibro.setPrestamista(prestamista);
		prestamoLibro.getBookLensdedList().add(libro);
		prestamoLibro.setBookLensdedList(prestamoLibro.getBookLensdedList());
		DAOFactory.getFactory().getPrestamoLibroDAO().create(prestamoLibro);
		 * */
		
		
		
		
	}

}
