package es.curso.java.hibernate.relations.muchosamuchos.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_MATERIA")
public class Materia implements Serializable {
	@Id
	@SequenceGenerator(name = "MATERIAGEN", sequenceName = "MATERIA_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MATERIAGEN")
	@Column(name = "ID", nullable = false, updatable = false)
	private long id;
	private String nombre;

	public Materia() {
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