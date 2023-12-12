package es.curso.java.hibernate.ejercicios.ejercicio.biblioteca.entities;

import es.curso.java.hibernate.relations.unounounidireccional.entities.Direccion;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_BIBLIOTECAS")
public class Biblioteca {
	@Id
	@SequenceGenerator(name="BIBLIOTECAGEN", sequenceName="BIBLIOTECA_GEN", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BIBLIOTECAGEN")
	private long id;
	@Column(length = 20, nullable = false)
	private String nombre;
	
	@OneToOne(cascade = { CascadeType.ALL }, optional=false )
	//@PrimaryKeyJoinColumn(name = "FK_DIRECCION", referencedColumnName = "FK_DIRECCION")
	@JoinColumn(name = "FK_DIR", foreignKey = @ForeignKey(name = "FK_DIRECCION_UPDATE"))
	private Direccion direccion;

	
	public Biblioteca () {
		
	}
	
	public Biblioteca(long id, String nombre, Direccion direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public Biblioteca(String nombre, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	@Override
	public String toString() {
		return "Biblioteca [id=" + id + ", " + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (direccion != null ? "direccion=" + direccion : "") + "]";
	}
}
