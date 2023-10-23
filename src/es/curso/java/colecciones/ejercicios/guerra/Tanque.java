package es.curso.java.colecciones.ejercicios.guerra;

import es.curso.java.colecciones.ejercicios.guerra.exceptions.LimiteValoresException;

public class Tanque extends VehiculoGuerra {

	public Tanque(String nombre) throws LimiteValoresException {
		super(nombre);
	}

	public Tanque(String nombre, int ataque, int defensa) throws LimiteValoresException {
		super(nombre, ataque, defensa);
	}

	@Override
	public int atacar() {
		int sumaAtaqueGuerreros=0;
		
		for (Guerrero guerrero : this.getGuerreros()) {
			sumaAtaqueGuerreros+=guerrero.getFuerza();
		}
		return (int)(this.getAtaque() * Math.random() +  sumaAtaqueGuerreros * Math.random()/2 );
	}

	@Override
	public int defender(int ataque) {
		int sumaDefensaGuerreros=0;
		
		for (Guerrero guerrero : this.getGuerreros()) {
			sumaDefensaGuerreros+=guerrero.getResistencia();
		}
		int defensa = (int)(this.getDefensa() * Math.random() 
				+  sumaDefensaGuerreros * Math.random()/2 ); 
//		int result = ataque-defensa<0?0:ataque-defensa;
//		
//		setPuntosVida(this.getPuntosVida()-result);
		
		return ataque-defensa<0?0:ataque-defensa;
	}

}
