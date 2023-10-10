package es.curso.java.poo.ejercicios.hospital;

import java.util.Random;

public class Doctor extends EmpleadosHospital{
	private String especialidad;

//	public Doctor(long id, String nombre, int edad) {
//		super(id, nombre, edad);
//	}

	public Doctor(long id, String nombre, int edad, String especialidad) {
		super(id, nombre, edad);
		this.especialidad = especialidad;
	}

	public Doctor(long id, String nombre, int edad, String turno, String especialidad) {
		super(id, nombre, edad, turno);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Enfermo diagnosticarPaciente(Paciente paciente) {
		Random r=new Random();
		int numAleatorio= r.nextInt(1,10);

		//System.out.println("El numero aleatorio es: " + numAleatorio);
		System.out.println("El numero aleatorio es: " + numAleatorio);
		if(numAleatorio>=2) {
			System.out.println("El paciente " + paciente.getNombre() + " esta enfermo");
			Enfermo enfermo = new Enfermo(paciente,"Gripe");
			
			return enfermo;
		}else {
			System.out.println("El paciente " + paciente.getNombre() + " no esta enfermo");
			return null;
		}
	}


}
