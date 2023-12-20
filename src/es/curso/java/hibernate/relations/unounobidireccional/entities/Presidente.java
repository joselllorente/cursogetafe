package es.curso.java.hibernate.relations.unounobidireccional.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PRESIDENTE")
public class Presidente implements Serializable {
	@Id
	@SequenceGenerator(name = "PRESIDENTEGEN", sequenceName = "PRESIDENTE_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRESIDENTEGEN")
	@Column(name = "ID", nullable = false, updatable = false)
	private int id;

	private String nombre;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Pais pais;

	public Presidente() {
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
}
