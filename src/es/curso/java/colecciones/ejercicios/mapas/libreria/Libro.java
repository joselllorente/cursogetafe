package es.curso.java.colecciones.ejercicios.mapas.libreria;

public class Libro {
	private String titulo;
	private String autor;
	private int numCopias;

	public Libro(String titulo, String autor, int numCopias) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numCopias = numCopias;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @return the numCopias
	 */
	public int getNumCopias() {
		return numCopias;
	}

	/**
	 * @param numCopias the numCopias to set
	 */
//	public void setNumCopias(int numCopias) {
//		this.numCopias = numCopias;
//	}

	@Override
	public String toString() {
		return "Libro [" + (titulo != null ? "titulo=" + titulo + ", " : "")
				+ (autor != null ? "autor=" + autor + ", " : "") + "numCopias=" + numCopias + "]";
	}
	
	
	public void actualizarCopias(int numCopias) {
		this.numCopias+=numCopias;
	}

}
