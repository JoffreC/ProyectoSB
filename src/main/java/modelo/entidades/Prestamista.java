package modelo.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Prestamista
 *
 */
@Entity

public class Prestamista implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "lender_name")
	private String name;
	@Column(name = "lender_ci")
	private String CI;
	@Column(name = "lender_address")
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "prestamo_id")
	private PrestamoLibro prestamoLibro;
	

	public Prestamista() {
		
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getCI() {
		return this.CI;
	}

	public void setCI(String CI) {
		this.CI = CI;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String adress) {
		this.address = adress;
	}
	public PrestamoLibro getPrestamoLibro() {
		return prestamoLibro;
	}
	public void setPrestamoLibro(PrestamoLibro prestamoLibro) {
		this.prestamoLibro = prestamoLibro;
	}
   
}
