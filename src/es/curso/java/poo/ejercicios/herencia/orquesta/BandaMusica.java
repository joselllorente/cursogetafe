package es.curso.java.poo.ejercicios.herencia.orquesta;

public class BandaMusica {

	public static void main(String[] args) {
		BandaMusica banda = new BandaMusica();
		banda.empezarConcierto();
		

	}
	
	private void empezarConcierto() {
		
		//Como la clase es abstracta no podemos crear objetos de ese tipo
		//Instrumento instrumento = new Instrumento("I","tipo1");
		Guitarra guitarra = new Guitarra("Guitarra1","Cuerda",6);
		GuitarraElectrica guitarraElectica 
			= new GuitarraElectrica("Guitarra Electrica","Cuerda",6,150);		
		Instrumento piano = new Piano("Piano1","Cuerda Percutida", 7,"Piano de Cola");
		Tambor tambor = new Tambor("Tambor","Percusión","plástico");
		
		Instrumento [] instrumentos = {guitarra,guitarraElectica,piano, tambor };
		//Afinando
		afinarInstrumentos(instrumentos);
		tocarInstrumentos(instrumentos);
		
	}
	
	private void afinarInstrumentos(Instrumento [] instrumentos) {
		
		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
		}
		
	}


	private void tocarInstrumentos(Instrumento [] instrumentos) {
		for (Instrumento instrumento : instrumentos) {
			if (instrumento instanceof Tambor) {
				Tambor t = (Tambor)instrumento; 
				t.aporrear();
				//instrumento.aporrear();
			}else {
				instrumento.tocar();
			}
		}
	}
}
