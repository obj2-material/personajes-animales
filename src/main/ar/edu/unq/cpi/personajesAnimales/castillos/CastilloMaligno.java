package ar.edu.unq.cpi.personajesAnimales.castillos;

import ar.edu.unq.cpi.personajesAnimales.personajes.Personaje;
import ar.edu.unq.cpi.personajesAnimales.pocimas.Pocima;
import ar.edu.unq.cpi.personajesAnimales.pocimas.PocimaAmarilla;

public class CastilloMaligno extends Castillo {

	@Override
	protected Pocima confeccionarPocima(Personaje personaje) {
		return new PocimaAmarilla();
	}

	@Override
	protected void modificarSabiduria(Personaje personaje) {
		personaje.perderSabiduria(5);
	}
}
