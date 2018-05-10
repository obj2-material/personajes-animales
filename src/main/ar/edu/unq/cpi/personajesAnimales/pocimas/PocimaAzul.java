package ar.edu.unq.cpi.personajesAnimales.pocimas;

import ar.edu.unq.cpi.personajesAnimales.animales.Animal;
import ar.edu.unq.cpi.personajesAnimales.personajes.Personaje;

public class PocimaAzul extends Pocima {
	private int resistenciaAnimalPropio;
	private int resistenciaAnimalAjeno;

	public int getResistenciaAnimalPropio() {
		return resistenciaAnimalPropio;
	}

	public void setResistenciaAnimalPropio(int resistenciaAnimalPropio) {
		this.resistenciaAnimalPropio = resistenciaAnimalPropio;
	}

	public int getResistenciaAnimalAjeno() {
		return resistenciaAnimalAjeno;
	}

	public void setResistenciaAnimalAjeno(int resistenciaAnimalAjeno) {
		this.resistenciaAnimalAjeno = resistenciaAnimalAjeno;
	}

	public PocimaAzul(int resistenciaAnimalPropio, int resistenciaAnimalAjeno) {
		this.resistenciaAnimalPropio = resistenciaAnimalPropio;
		this.resistenciaAnimalAjeno = resistenciaAnimalAjeno;
	}

	@Override
	public TipoPocima getTipo() {
		return TipoPocima.AZUL;
	}

	@Override
	public void aplicar(Animal animal, Personaje personaje) {
		animal.recibirPocimaAzul(this, personaje);		
	}
}
