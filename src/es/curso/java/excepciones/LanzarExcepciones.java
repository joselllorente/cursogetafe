package es.curso.java.excepciones;

import java.io.IOException;

import es.curso.java.poo.ejercicios.supermercado.Cliente;

public class LanzarExcepciones {

	public static void main(String[] args) {
		LanzarExcepciones le = new LanzarExcepciones();
		
		
		
		
		try {
			le.test(3,0);
			le.test(2,1);
		} catch (NullPointerException | IOException | MiExcepcion e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

	}
	
	public void test(int num1, int num2) throws IOException, NullPointerException, MiExcepcion{
		
		if (num2==0) {
			//NullPointerException npe = new NullPointerException("Mi error");
			
			//throw new NullPointerException("Mi error NullPointer");
			throw new ArithmeticException("No puedes dividir por cero");
		}else {
			System.out.println(num1/num2);
			throw new MiExcepcion();
			//throw new IOException("Mi error IOExecption");
		}
	}

}
