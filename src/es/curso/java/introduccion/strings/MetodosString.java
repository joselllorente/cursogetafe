package es.curso.java.introduccion.strings;

public class MetodosString {

	public static void main(String[] args) {
		
		String var1 = "Hola";
		String var2 = "Hola";
		String var8 = new String("Hola");
		System.out.println(var1==var8);
		System.out.println(var1.equals(var8));


		
		
		
		String nombre1 = "Jose Luis";
		String nombre2 = nombre1;
		
		nombre1 = nombre1.toLowerCase();
		//nombre1.toUpperCase();
		
		System.out.println(nombre1);
		System.out.println(nombre2);

		
		
		System.out.println(nombre1.charAt(0));
		
		System.out.println(nombre1.concat(nombre2));
		
		String result = nombre1+"|"+nombre2+"|"+"Eva";
		System.out.println(result);
		
		System.out.println(nombre1.toLowerCase().contains("se") );
		
		System.out.println(nombre1.endsWith(".txt"));
		System.out.println(nombre1.startsWith("JO"));
		
		//"JOSE LUI werwr"
		System.out.println(nombre1.indexOf("S"));//->2
		System.out.println(nombre1.lastIndexOf("S"));//->2
		
		
		String var3 = "				";
		System.out.println(var3.isBlank());
		System.out.println(var3.isEmpty());
		
		System.out.println(nombre1.length());
		
		System.out.println(nombre1.replace("E", "I"));
		System.out.println(nombre1);
		
		String var4 = "EEEEE";
		System.out.println(var4.replace("E", "I"));
		
		
		String loremIpsum = "Lorem ipsum dolor sit amet, "
				+ "consectetur adipiscing elit, "
				+ "sed do eiusmod tempor incididunt ut "
				+ "labore et dolore magna aliqua. "
				+ "Ut enim ad minim veniam, quis nostrud exercitation "
				+ "ullamco laboris nisi ut aliquip ex ea "
				+ "commodo consequat. Duis aute irure dolor "
				+ "in reprehenderit in voluptate velit esse "
				+ "cillum dolore eu fugiat nulla pariatur. "
				+ "Excepteur sint occaecat cupidatat non proident, "
				+ "sunt in culpa qui officia deserunt mollit "
				+ "anim id est laborum          ";
		
		int posicionUltimoPunto = loremIpsum.lastIndexOf(".")+1;
		int posicionPrimerPunto = loremIpsum.indexOf(".")+1;
		String ultimaFrase = loremIpsum.substring(posicionUltimoPunto);
		System.out.println(ultimaFrase.trim());
		
		String fraseMedia = loremIpsum.substring(posicionPrimerPunto
				, posicionUltimoPunto );
		
		System.out.println(fraseMedia);
//		String var5 = "    Esto es una prueba      ";
//		String var6 = var5.substring(8);
//		System.out.println(var6);
//		String var7 = var5.substring(8,11);
//		System.out.println(var7);
//		
//		System.out.println(var5.trim());
		
		
	}

}


