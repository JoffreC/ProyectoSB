package modelo.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Libro
 *
 */
@Entity

public class Libro implements Serializable {

	private static final long serialVersionUID = 1L;   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "isbn_book")
	
	private String ISBN;
	@Column(name = "tittle_book")
	private String tittle;
	@Column(name = "author_book")
	private String author;
	@Column(name = "gender_book")
	private String gender;
	@Column(name = "registratio_date")
		private String registrationDate;
	
	@ManyToOne
	private PrestamoLibro prestamoLibro;
	

	public Libro() {
		this.prestamoLibro = null;//inicialmente el libro no esta prestado 
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getISBN() {
		return this.ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}   
	public String getTittle() {
		return this.tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}   
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}   
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}   
	public String getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	public PrestamoLibro getPrestamoLibro() {
		return prestamoLibro;
	}
	public void setPrestamoLibro(PrestamoLibro prestamoLibro) {
		this.prestamoLibro = prestamoLibro;
	}
	
	
	
   
}
