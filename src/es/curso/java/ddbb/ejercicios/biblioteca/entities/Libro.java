package es.curso.java.ddbb.ejercicios.biblioteca.entities;

public class Libro {
	private long id;
	private String titulo;
	private String autor;
	private String isbn;
	private Biblioteca biblioteca;
	
	public Libro(long id, String titulo, String autor, String isbn, Biblioteca biblioteca) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.biblioteca = biblioteca;
	}
	
	public Libro(long id, String titulo, String autor, String isbn) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
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
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @return the biblioteca
	 */
	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	/**
	 * @param biblioteca the biblioteca to set
	 */
	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", " + (titulo != null ? "titulo=" + titulo + ", " : "")
				+ (autor != null ? "autor=" + autor + ", " : "") + (isbn != null ? "isbn=" + isbn + ", " : "")
				+ (biblioteca != null ? "biblioteca=" + biblioteca : "") + "]";
	}
	
	
	
	
}
