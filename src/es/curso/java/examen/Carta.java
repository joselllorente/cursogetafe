package es.curso.java.examen;

public class Carta {
	
	private String nombre;
	private Plato [] platos;
	private Bebida [] bebidas;
	
	public Carta(String nombre, Plato[] platos, Bebida[] bebidas) {
		super();
		this.nombre = nombre;
		this.platos = platos;
		this.bebidas = bebidas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Plato[] getPlatos() {
		return platos;
	}

	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}

	public Bebida[] getBebidas() {
		return bebidas;
	}

	public void setBebidas(Bebida[] bebidas) {
		this.bebidas = bebidas;
	}
	
	public void calculaImporte () {
		double importe =0;
		//Calculamos precio de la carta
		for (Bebida bebida : this.getBebidas()) {
			importe+=bebida.getPrecio();
		}
		
		for (Plato plato : this.getPlatos()) {
			if (plato!=null && plato.isDisponible())
				importe+=plato.getPrecio();
		}
		System.out.println("El importe de la carta "+ this.getNombre() +
				" es de "+importe);
	}

}
