package es.curso.java.lambdas;

public class Suma implements Operacion {

	private int numero;
		
	public Suma(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int operar(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}
	
	

}
