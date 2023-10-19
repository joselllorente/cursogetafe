package es.curso.java.colecciones.ejercicios.guerra;

import es.curso.java.colecciones.ejercicios.guerra.exceptions.LimiteValoresException;

public class Guerrero {
	private String nombre;
	private String tipo;
	private int fuerza;
	private int resistencia;

	public Guerrero(String nombre, String tipo, 
			int fuerza, int resistencia) throws LimiteValoresException {
		super();
		if (fuerza+resistencia>10) {
			throw new LimiteValoresException(
					"La suma de la fuerza "
					+ "y la resistencias del guerrero "
					+ "no puede ser superior a 10");
		}else {
			this.fuerza = fuerza;
			this.resistencia = resistencia;
		}
		
		this.nombre = nombre;
		this.tipo = tipo;
	
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the fuerza
	 */
	public int getFuerza() {
		return fuerza;
	}

	/**
	 * @param fuerza the fuerza to set
	 */
	void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	/**
	 * @return the resistencia
	 */
	public int getResistencia() {
		return resistencia;
	}

	/**
	 * @param resistencia the resistencia to set
	 */
	void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	@Override
	public String toString() {
		return "Guerrero [" + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (tipo != null ? "tipo=" + tipo + ", " : "") + "fuerza=" + fuerza + ", resistencia=" + resistencia
				+ "]";
	}

}
