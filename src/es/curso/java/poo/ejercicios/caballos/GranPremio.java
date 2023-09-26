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
	
	private GranPremio(long id, String nombre, Carrera[] carreras) {
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
	
	private void empezarGranPremio() {
		for (Carrera carrera : carreras) {
			carrera.iniciarCarrera();
		}
	}
	
	
}
