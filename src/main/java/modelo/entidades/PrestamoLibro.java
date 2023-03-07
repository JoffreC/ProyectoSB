package modelo.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: PrestamoLibro
 *
 */
@Entity

public class PrestamoLibro implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "date_book_lend")
	
	private String dateBookLend;
	
	@Column(name = "mulct")
	private double mulct;
	
	@Column(name = "days_lended")
	private int daysLended;
	
	@ManyToOne
	@JoinColumn(name = "prestamista_id")
	private Prestamista prestamista;
	
	@OneToMany(mappedBy = "prestamoLibro")
	private List<Libro> bookLendedList;

	
	public PrestamoLibro() {
		bookLendedList = new ArrayList<>();
		this.mulct = 0.0;
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public String getDateBookLend() {
		return dateBookLend;
	}
	public void setDateBookLend(String dateBookLend) {
		this.dateBookLend = dateBookLend;
	}
	public double getMulct() {
		return mulct;
	}
	public void setMulct(double mulct) {
		this.mulct = mulct;
	}
	public Prestamista getPrestamista() {
		return prestamista;
	}
	public void setPrestamista(Prestamista prestamista) {
		this.prestamista = prestamista;
	}
	public List<Libro> getBookLendedList() {
		return bookLendedList;
	}
	public void setBookLendedList(List<Libro> bookLensdedList) {
		this.bookLendedList = bookLensdedList;
	}
	public int getDaysLended() {
		return daysLended;
	}
	public void setDaysLended(int daysLended) {
		this.daysLended = daysLended;
	}
	
	
	
	
   
}
