package es.curso.java.repaso.ejercicios.ejercicio1;

public class FerreteriaMainEnumProperties {

	public static void main(String[] args) {

		Tornillo tornillo1 = new Tornillo(TornillosEnum.tornillo1.getId(),
				TornillosEnum.tornillo1.getColor(),
				TornillosEnum.tornillo1.getLongitud(),
				TornillosEnum.tornillo1.getDiametro(),
				TornillosEnum.tornillo1.getPrecio()
			);
		
		for ( TornillosEnum te :  TornillosEnum.values()) {
			te.toString();
		}

	}

}
