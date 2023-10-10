package es.curso.java.poo.ejercicios.hospital;

public final class Enfermo extends Persona{
	private String enfermedad; 
	
	public Enfermo(long id, String nombre, int edad) {
		super(id, nombre, edad);
	}

	public Enfermo(long id, String nombre, int edad, String enfermedad) {
		super(id, nombre, edad);
		this.enfermedad = enfermedad;
	}
	
	public Enfermo (Paciente paciente, String enfermedad) {
		super(paciente.getId(), paciente.getNombre(), paciente.getEdad());
		this.enfermedad = enfermedad;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public void comer() {
		System.out.println("El paciente " + this.getNombre() + " esta comiendo en la habitacion");
	}

	
}