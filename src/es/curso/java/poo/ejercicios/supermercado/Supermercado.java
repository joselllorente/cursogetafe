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
		Producto p1 = new Producto(1,"Tomate Frito",3,"Alimento");
		Producto p2 = new Producto(2,"Tomate Frito",4,"Alimento");
		Producto p3 = new Producto(3,"Tomate Frito",5,"Alimento");
		Producto p4 = new Producto(4,"Tomate Frito",6,"Alimento");
		Producto p5 = new Producto(5,"Tomate Frito",7,"Alimento");
		Producto p6 = new Producto(6,"Tomate Frito",8,"Alimento");
		Producto p7 = new Producto(7,"Tomate Frito",9,"Alimento");
		
		Cliente c1 = new Cliente(1,"Cliente1",true);
		
		//añadimos productos al carrito
		c1.aniadirProducto(p1);
		c1.aniadirProducto(p2);
		c1.aniadirProducto(p7,p5);
		
		Cajera cajera1 = new Cajera(1,"Cajera1");
		double importeCompra = cajera1.cobrar(c1);
		try {
			c1.pagar(importeCompra);
		} catch (PagoConTarjetaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

