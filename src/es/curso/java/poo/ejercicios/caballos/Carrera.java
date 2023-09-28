package es.curso.java.poo.ejercicios.caballos;

public class Carrera {

	private long id;
	private String nombre;
	private double distancia;
	private Caballo[] caballos;

	public Carrera(long id, String nombre, double distancia, Caballo[] caballos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.distancia = distancia;
		this.caballos = caballos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

	public Caballo[] getCaballos() {
		return caballos;
	}

	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	}

	public int iniciarCarrera() {
		boolean hayGanador = false;
		Caballo caballoGanador=null;
		System.out.println("========== Empezando la carrera "+this.nombre + "===============");
		while(!hayGanador) {
			for (Caballo caballo : caballos) {
				caballo.correr();
				if(caballo.getAvance()>=this.distancia) {
					System.out.println("El caballo con nombre "
							+ caballo.getNombre() + " y número " + caballo.getNumero() + " ha ganado");
					hayGanador = true;
					caballoGanador = caballo;
					break;
				}
			}
		}
		resetearCaballos();
		return caballoGanador.getNumero();
	}
	
	public void resetearCaballos() {
		for (Caballo caballo : caballos) {
			caballo.reseteaAvance();
		}
	}


}
