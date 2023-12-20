package es.curso.java.hibernate.relations.unounobidireccional.entities;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PAIS")
public class Pais implements Serializable {
	@Id
	@SequenceGenerator(name = "PAISGEN", sequenceName = "PAIS_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PAISGEN")
	@Column(name = "ID", nullable = false, updatable = false)
	private int id;

	private String nombre;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Presidente presidente;

	public Pais() {
	}

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}
}