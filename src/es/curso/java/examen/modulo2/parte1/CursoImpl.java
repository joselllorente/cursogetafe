package es.curso.java.examen.modulo2.parte1;

public abstract class CursoImpl implements Curso {
	private String nombre;
	private int codigo;
	private int cupoMaximo;
	
	public CursoImpl() {
		this.nombre="Curso Prueba";
		this.codigo = 1;
		this.cupoMaximo=15;
	}

	public CursoImpl(String nombre, int codigo, int cupoMaximo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.cupoMaximo = cupoMaximo;
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
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * @param cupoMaximo the cupoMaximo to set
	 */
	public void setCupoMaximo(int cupoMaximo) {
		this.cupoMaximo = cupoMaximo;
	}

	@Override
	public String getNombreCurso() {
		return getNombre();
	}

	@Override
	public int getCodigo() {

		return this.codigo;
	}

	@Override
	public int getCupoMaximo() {

		return this.cupoMaximo;
	}

	@Override
	public String toString() {
		return "CursoImpl [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "codigo=" + codigo + ", cupoMaximo="
				+ cupoMaximo + "]";
	}
	
}
