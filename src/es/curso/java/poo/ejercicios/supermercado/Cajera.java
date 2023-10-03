package es.curso.java.poo.ejercicios.supermercado;

public class Cajera {
	private long id;
	private String nombre;
	
	public Cajera(long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
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
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cajera [id=" + id + ", " + (nombre != null ? "nombre=" + nombre : "") + "]";
	}


	public double cobrar (Cliente cliente) {
		System.out.println("Cajera "+this.nombre + 
				" cobrando al cliente "+cliente.getNombre());
		double importe = 0;
		
		for (Producto p : cliente.getCarritoCompra()) {
			importe += p.getPrecio();
		}
		
		return cliente.isVip()?importe*0.85:importe;
	}
	
	
	
	
}
