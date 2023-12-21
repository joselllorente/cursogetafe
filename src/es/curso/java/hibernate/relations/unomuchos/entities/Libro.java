package es.curso.java.hibernate.relations.unomuchos.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="TB_LIBROS")
public class Libro implements Serializable {
	@Id
	@SequenceGenerator(name = "LIBROGEN", sequenceName = "LIBRO_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LIBROGEN")
	@Column(name = "ID", nullable = false, updatable = false)
	private long id;
	@Column(length=32, name="TITULO", nullable=false)
	private String titulo;

//	Para bidireccional
	@ManyToOne(targetEntity = Persona.class, fetch = FetchType.EAGER)
	@JoinColumn(name = "FK_PERSONA", nullable = false, updatable = false)
	private Persona persona;
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public Libro() {
	}

	public long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + "]";
	}
	
	
}
