package es.curso.java.hibernate.relations.unomuchos.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;



@Entity
@Table(name = "TB_PERSONA")
public class Persona implements Serializable {
	@Id
	@SequenceGenerator(name = "PERSONAGEN", sequenceName = "PERSONA_GEN", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PERSONAGEN")
	@Column(name = "ID", nullable = false, updatable = false)
	private long id;
	
	@Column(name = "NOMBRE_PERSONA")
	private String nombre;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@IndexColumn(name="indice")
//	@OrderBy("titulo asc")
//	@OrderColumn
//	El impacto en el rendimiento de la base de datos que puede producir este comportamiento es algo que debes tener muy presente, ya que las tablas afectadas tendr�n que reordenarse cada vez que se hayan cambios en ellas (en tablas de cierto tama�o, o en aquellas donde se inserten o modifiquen registros con cierta frecuencia, es totalmente desaconsejable forzar una ordenaci�n autom�tica).
	/*En este caso, en vez de utilizar una clave for�nea en Cliente, JPA utilizar� por defecto una 
	 * tabla de uni�n (join table). Cuando ocurre esto, las tablas donde se almacenan ambas entidades contienen una clave for�nea a una tercera tabla con dos columnas; esta tercera tabla es llamada tabla de uni�n, y es donde se estata la asociaci�n entre las entidades relacionadas. Como siempre, podemos configurar el mapeo mediante metadatos (anotaciones/XML) para que se ajuste a nuestras necesidades:
	 * */
	
	//Creara una tabla intermedia para representar la relaci�n de ambas tablas.
//	@JoinTable(name = "TB_PERSONA_LIBROS", joinColumns = @JoinColumn(name = "FK_PERSONA"), 
//        inverseJoinColumns = @JoinColumn(name = "FK_LIBRO")) 
    @JoinColumn(name="idPersona")
	private List<Libro> libros = new ArrayList<Libro>();

	public Persona() {
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

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public void addLibro(Libro libro) {
		this.libros.add(libro);
	}
}