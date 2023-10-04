package es.curso.java.examen;

import es.curso.java.utils.Utilidades;

public class Restaurante {

	private String nombre;

	public static void main(String[] args) {

		Restaurante restaurante = new Restaurante("Restaurante Juani");
		restaurante.abrirRestaurante();

	}

	public void abrirRestaurante() {

		Plato plato1 = new Plato("caracoles", 15.20, true);
		Plato plato2 = new Plato("merluza", 16.30, true);
		Plato plato3 = new Plato("tallarines carbonara", 9.50, true);
		Plato plato4 = new Plato("croquetas", 8.50, true);
		Plato plato5 = new Plato("Jamón de Jabugo", 30.60, false);

		Bebida bebida1 = new Bebida("cerveza", 2.70);
		Bebida bebida2 = new Bebida("agua", 1.20);

		Plato[] platos1 = { plato3, plato1, null };
		Plato[] platos2 = { plato2, plato4, plato5 };

		Bebida[] bebidas1 = { bebida1, bebida2 };
		Bebida[] bebidas2 = { bebida1 };
		Bebida[] bebidas3 = { bebida2 };

		Carta carta1 = new Carta("Menú del día normal", platos1, bebidas2);
		Carta carta2 = new Carta("Menú especial", platos2, bebidas3);;

		//mostrarInfoCarta(false, carta1,carta2);
		
		//mostrarPlatosDisponibles(carta2);

		
		Carta cartaElegida = queCartaDesea(carta1, carta2);
		//calculaImporte(cartaElegida);
		cartaElegida.calculaImporte();
		
			
	}

	/**
	 * Mostrar los platos disponibles para cada una de la cartas del restaurante
	 * @param mostrarBebidas mostrará las bebidas de la carta si viene a true
	 * @param cartas
	 * 
	 */
	public void mostrarInfoCarta(boolean mostrarBebidas, Carta... cartas) {
		
		for (Carta carta : cartas) {
			if (carta!=null) {
				System.out.println("==== Carta "+carta.getNombre()+"==========");
				System.out.println("Platos");
				for(Plato plato : carta.getPlatos()) {
					
					if (plato!=null && plato.isDisponible()) {
						System.out.println("\t"+ plato);
					}
				}
				if (mostrarBebidas) {
					System.out.println("Bebidas");
					for(Bebida bebida : carta.getBebidas()) {
						System.out.println("\t"+ bebida);
					}
				}
			}
		}
		
	}

	
	
	public Carta queCartaDesea(Carta... cartas) {
		Carta cartaDeseada = null;
		
		for (Carta carta : cartas) {
			mostrarInfoCarta(true, carta);
		}

		//Pedimos al usuario el nombre de la carta
		String respuesta = Utilidades.pideDatoTexto("¿Qué menú deseas? \n\n");

		for (Carta carta : cartas) {
			if (carta.getNombre().toLowerCase().contains(respuesta.toLowerCase())) {
				cartaDeseada= carta;
				break;
			}
		}
		
		return cartaDeseada;
	}

	public void importeCarta(Carta carta) {
		

	}

	public Restaurante(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
