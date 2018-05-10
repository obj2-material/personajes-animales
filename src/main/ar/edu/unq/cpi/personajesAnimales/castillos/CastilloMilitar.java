package ar.edu.unq.cpi.personajesAnimales.castillos;

import ar.edu.unq.cpi.personajesAnimales.personajes.Personaje;
import ar.edu.unq.cpi.personajesAnimales.pocimas.Pocima;
import ar.edu.unq.cpi.personajesAnimales.pocimas.PocimaVerde;

public class CastilloMilitar extends Castillo {

	@Override
	protected Pocima confeccionarPocima(Personaje personaje) {
		return new PocimaVerde();
	}

}
