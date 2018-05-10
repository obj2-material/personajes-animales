package ar.edu.unq.cpi.personajesAnimales.castillos;

import ar.edu.unq.cpi.personajesAnimales.personajes.Personaje;
import ar.edu.unq.cpi.personajesAnimales.pocimas.Pocima;
import ar.edu.unq.cpi.personajesAnimales.pocimas.PocimaAzul;

public class CastilloAgricola extends Castillo {
	private int resistenciaAnimalPropio;
	private int resistenciaAnimalAjeno;

	public CastilloAgricola(int resistenciaAnimalPropio, int resistenciaAnimalAjeno) {
		this.resistenciaAnimalPropio = resistenciaAnimalPropio;
		this.resistenciaAnimalAjeno = resistenciaAnimalAjeno;
	}
	
	@Override
	protected Pocima confeccionarPocima(Personaje personaje) {
		return new PocimaAzul(
			resistenciaAnimalPropio + this.bonusPorSabiduria(personaje), 
			resistenciaAnimalAjeno + this.bonusPorSabiduria(personaje)
		);
	}

	private int bonusPorSabiduria(Personaje personaje) {
		return personaje.getSabiduria() > 20 ? 3 : 0;
	}

}
