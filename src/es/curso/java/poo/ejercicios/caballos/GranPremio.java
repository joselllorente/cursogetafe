package es.curso.java.poo.ejercicios.caballos;

public class GranPremio {

	private long id;
	private String nombre;
	private Carrera[] carreras;
	
	public void iniciarGranPremio(Caballo caballo) {
		Caballo caballoProfe=new Caballo(1,"Caballo Profe",11,6,40,200,true);

		Caballo[] caballos1= {caballoProfe,caballo};

		Carrera carrera1=new Carrera(1,"getafe ",1000,caballos1);
		Carrera [] carreras = {carrera1};
		GranPremio gp = new GranPremio(1,"Gran Prix Getafe",carreras);
		gp.empezarGranPremio();
	}
	
	public GranPremio() {
		
	}
	
	GranPremio(long id, String nombre, Carrera[] carreras) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.carreras = carreras;
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

	public Carrera[] getCarreras() {
		return carreras;
	}

	public void setCarreras(Carrera[] carreras) {
		this.carreras = carreras;
	}
	
	void empezarGranPremio() {
		System.out.println("Empezando el gran premio " + this.nombre);
		//Creo los apostantes
		Apostante apostante1 = new Apostante(0,"Apostante1",1000);
		Apostante apostante2 = new Apostante(1,"Apostante2",1000);
		
		for (Carrera carrera : this.carreras) {
			System.out.println("Empezando la carrera "+carrera.getNombre());
			
			Caballo [] caballos = carrera.getCaballos();
			int importeApostante1 = apostante1.apostar(caballos);			
			int importeApostante2 = apostante2.apostar(carrera.getCaballos());
			
			int caballoGanador = carrera.iniciarCarrera();
			
			if (caballoGanador==apostante1.getApuesta()) {
				System.out.println("El apostante "+ apostante1.getNombre() + " ha ganado");
				apostante1.actualizaSaldo(importeApostante1*5);
			}
			
			if (caballoGanador==apostante2.getApuesta()) {
				System.out.println("El apostante "+ apostante2.getNombre() + " ha ganado");
				apostante2.actualizaSaldo(importeApostante2*5);;
			}
		}
		
		System.out.println("Se han disputado todas las carreras del Gran Premio");
		System.out.println("El apostante " + apostante1.getNombre() + " tiene "+ apostante1.getSaldo());
		System.out.println("El apostante " + apostante2.getNombre() + " tiene "+ apostante2.getSaldo());

	}
	
	
	
}

