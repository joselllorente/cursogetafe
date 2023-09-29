package es.curso.java.poo.ejercicios.supermercado;

public class Cliente {
	private long id;
	private String nombre;
	private Producto [] carritoCompra;
	private boolean vip;
	
	public Cliente(long id, String nombre, boolean vip) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vip = vip;
		this.carritoCompra = new Producto[5];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Producto[] getCarritoCompra() {
		return carritoCompra;
	}

	public void setCarritoCompra(Producto[] carritoCompra) {
		this.carritoCompra = carritoCompra;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public long getId() {
		return id;
	}
	
	
	
	
	
}
