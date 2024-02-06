package es.curso.java.repaso.herencia;

public final class PerroAfricano extends Animal {
	private String colorPelo;

	public PerroAfricano(String nombre, String colorPelo) {
		super(nombre);
		this.colorPelo = colorPelo;
	}
	
	@Override
	public void correr () {
		super.correr();
		System.out.println("Muy rápido");
	}

	
	public void correr (int velocidad) {
		correr();
	}

	@Override
	public void comer() {
		System.out.println("El animal "+getNombre() + " está comiendo");
		
	}
	
	public void ladrar() {
		System.out.println("El perro africano está ladrando");
	}
	
}



