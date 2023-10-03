package es.curso.java.poo.ejercicios.supermercado;

import java.util.Random;

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
		if (vip) {
			this.carritoCompra = new Producto[6];
		}else {
			this.carritoCompra = new Producto[3];
		}
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
	
	
	public void aniadirProducto(Producto ... producto) {
		for (Producto producto2 : producto) {
			aniadirProducto(producto2);
		}
	}
	
	
	public void aniadirProducto(Producto producto) {
		
		for (int i = 0; i < carritoCompra.length; i++) {
			Producto espacioProd = carritoCompra[i];
			if (carritoCompra[i]==null) {
				carritoCompra[i] = producto;
				break;
			}
		}
		
	}
	
	
	public void pagar (double importeAPagar) throws  PagoConTarjetaException{
		Random rd = new Random();
		if (rd.nextBoolean())
			System.out.println("El cliente "+this.nombre+ " esta pagando "+ importeAPagar);
		else
			throw new PagoConTarjetaException();
	}
	
}



