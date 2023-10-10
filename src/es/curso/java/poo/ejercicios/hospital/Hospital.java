package es.curso.java.poo.ejercicios.hospital;

public class Hospital {
	private String nombre;
	private Habitacion[] habitaciones;
	private Paciente[] salaEspera;

	public Hospital(String nombre) {
		super();
		this.nombre = nombre;
		this.habitaciones = new Habitacion[2];
		this.salaEspera = new Paciente[3];
	}

	public void abrirHospital() {
		Habitacion habitacion1 = new Habitacion(1);
		Habitacion habitacion2 = new Habitacion(2);
		// Habitacion[] habitaciones= {habitacion1,habitacion2};
		this.habitaciones[0] = habitacion1;
		this.habitaciones[1] = habitacion2;

		String[] sintomas1 = { "dolor de cabeza", "dolor de estomago" };

		Paciente paciente1 = new Paciente(1, "Alvaro", 23, sintomas1);
		Paciente paciente2 = new Paciente(2, "Jose", 36, new String[] { "fiebre", "dolor de estomago" });
		Paciente paciente3 = new Paciente(3, "Carlos", 78, new String[] { "fiebre", "dolor de estomago" });

		this.salaEspera[0] = paciente1;
		this.salaEspera[1] = paciente2;
		this.salaEspera[2] = paciente3;

		Enfermero enfermero1 = new Enfermero(1, "Pepe", 47, "Turno2", 1);

		Doctor doctor1 = new Doctor(1, "Felix", 54, "Neurocirujano", "Turno1");

		// Fichan los empleados
		EmpleadosHospital[] empleados = { enfermero1, doctor1 };
		//ficharEmpleados(empleados);

		// Comen todas las personas
		Persona[] personas = { paciente1, paciente2, paciente3, enfermero1, doctor1 };
		//comerPersonas(personas);
		
		pasarConsultas(enfermero1, doctor1);

//		System.out.println("==============================================");
//
//		Paciente[] pacientesParaDoctor = enfermero1.atenderPaciente(salaEspera);
//
//		System.out.println("==============================================");
//
//		for (int i = 0; i < pacientesParaDoctor.length; i++) {
//			Enfermo enfermo = doctor1.diagnosticarPaciente(pacientesParaDoctor[i]);
//			boolean ingresado = false;
//			if (enfermo != null) {
//				for (Habitacion habitacion : this.habitaciones) {
//					if (habitacion.getEnfermo() == null) {
//						habitacion.setEnfermo(enfermo);
//						// System.out.println("El enfermo " + enfermo.getNombre() + " esta en la
//						// habitacion" + habitacion.getNumero());
//						ingresado = true;
//						// System.out.println(ingresado);
//						break;
//					}
//				}
//				if (!ingresado) {
//					System.out.println("Lo sentimos pero ya no queda habitacion");
//				}
//			}
//
//		}
//
//		System.out.println("==============================================");
//
//		for (Habitacion habitacion : habitaciones) {
//			if (habitacion.getEnfermo() != null) {
//				System.out.println("El paciente " + habitacion.getEnfermo().getNombre()
//						+ " ha sido ingresado en la habitacion " + habitacion.getNumero());
//			}
//		}
	}

	public void ficharEmpleados(EmpleadosHospital[] empleados) {
		for (EmpleadosHospital empleado : empleados) {
			empleado.fichar();
		}
	}

	public void comerPersonas(Persona[] personas) {
		for (Persona persona : personas) {
			persona.comer();
		}
		
		for(Habitacion habitacion: this.habitaciones) {
			Enfermo enfermo = habitacion.getEnfermo(); 
			if(enfermo!=null) {
				enfermo.comer();
			}
		}
	}
	
	private void pasarConsultas(Enfermero enfermero, Doctor doctor) {
		
		int i=0;
		for (Paciente paciente : salaEspera) {
			//Enfermero atiende paciente
			Paciente pacienteConsulta = enfermero.atenderPaciente(paciente);
			salaEspera[i]=null;
			i++;
			
			//
			if (pacienteConsulta!=null) {
				Enfermo enfermo = doctor.diagnosticarPaciente(pacienteConsulta);
				
				if (enfermo!=null) {
					if(!hospitalizarEnfermo(enfermo)) {
						System.out.println("No hay habitaciones libres el enfermo es derivado a otro hospital");
					}
				}else {
					System.out.println("El paciente "+ pacienteConsulta.getNombre() + " se va a su casa");
				}
				
			}else {
				System.out.println("El paciente no tiene nada se va a casa");
			}
			
		}
		
		//enfermero.atenderPaciente(salaEspera);
		
		
//		for (Paciente paciente : salaEspera) {
//			
//			enfermero.atenderPaciente(paciente);
//			
//		}
		
	}
	
	private boolean hospitalizarEnfermo(Enfermo enfermo) {
		for(Habitacion habita : habitaciones) {
			//La habotación está libre
			if(habita.getEnfermo()==null) {
				System.out.println("Enfermo "+enfermo.getNombre() + 
						" ingresado en la habitación "+habita.getNumero());
				
				habita.setEnfermo(enfermo); 
				return true;
			}
		}
		
		return false;
		
	}
	

}
