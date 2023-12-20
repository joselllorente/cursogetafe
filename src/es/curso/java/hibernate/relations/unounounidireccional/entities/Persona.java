package es.curso.java.hibernate.relations.unounounidireccional.entities;

import java.io.Serializable;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.ForeignKey;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PERSONAS")
public class Persona implements Serializable {
	
	@Id
	@SequenceGenerator(name = "PERSONASGEN", sequenceName = "PERSONAS_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONASGEN")
	@Column(name = "ID", nullable = false, updatable = false)
	private long id;
	private String nombre;
	// nosotros queremos que se realicen en cascada las operaciones de guardar y
	// eliminar, por lo que colocamos estos valores de la siguiente forma:
	// Usando las anotaciones de JPA tenemos un n�mero menor de operaciones que con
	// los archivos de mapeo. De hecho solo tenemos:
	// merge,persist,refresh,remove,all
	@OneToOne(cascade = { CascadeType.PERSIST }  )
	//@PrimaryKeyJoinColumn(name = "FK_DIRECCION",referencedColumnName = "FK_DIRECCION")
	//@ForeignKey(name = "FK_DIRECCION_CONS",inverseName = "FK_DIRECCION")
	private Direccion direccion;

	public Persona() {
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
