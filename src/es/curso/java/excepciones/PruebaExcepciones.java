package es.curso.java.excepciones;

public class PruebaExcepciones {

	private static String [] colores;
	
	public static void main(String[] args) {
		
		System.out.println("Empieza");
		
		colores = new String[5];
		
		try {
			
			System.out.println(7/0);
			colores[2]= "azul";
//			Cliente c = null;
//			c.getNombre();
			System.out.println("Pasa");
			
		}catch(NullPointerException npe) {
			
			System.out.println("Ha ocurrido un error de "
					+ "tipo nullpointer "+ npe.getMessage());
			npe.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Ha ocurrido un error de tipo "
					+ "arrayoutbound "+ aiobe.getMessage());
		}finally {
			System.out.println("Siempre se ejecuta");
		}
		
		System.out.println("Termina");
		

	}

}
