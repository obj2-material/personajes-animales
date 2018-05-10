package ar.edu.unq.cpi.personajesAnimales.personajes;

import ar.edu.unq.cpi.personajesAnimales.animales.Animal;
import ar.edu.unq.cpi.personajesAnimales.pocimas.TipoPocima;

public class CriterioAplicarPocima extends CriterioAnimal {

	public CriterioAplicarPocima(Personaje personaje) {
		super(personaje);
	}

	@Override
	public void encontrarseCon(Animal animal) {
		if (personaje.tienePocima(TipoPocima.AZUL)) {
			personaje.usarPocima(TipoPocima.AZUL, animal);
		} else {
			if (personaje.tienePocima(TipoPocima.VERDE)) {
				personaje.usarPocima(TipoPocima.VERDE, animal);
			}
		}
	}

}
