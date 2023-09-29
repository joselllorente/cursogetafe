package es.curso.java.poo.ejercicios.supermercado;

public class Supermercado {
	private String nombre;
	private Cajera [] cajeras;
	
	public Supermercado(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Supermercado supermercado = new Supermercado("Supermecado CFTIC");
		supermercado.abrirSupermercado();
	}
	
	public void abrirSupermercado() {
		
	}
}
