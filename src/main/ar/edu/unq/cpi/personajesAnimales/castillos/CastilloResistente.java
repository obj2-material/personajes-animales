package ar.edu.unq.cpi.personajesAnimales.castillos;

import ar.edu.unq.cpi.personajesAnimales.Personaje;
import ar.edu.unq.cpi.personajesAnimales.pocimas.Pocima;
import ar.edu.unq.cpi.personajesAnimales.pocimas.PocimaRoja;

public class CastilloResistente extends Castillo {

	@Override
	protected Pocima confeccionarPocima(Personaje personaje) {
		return new PocimaRoja();
	}

}
