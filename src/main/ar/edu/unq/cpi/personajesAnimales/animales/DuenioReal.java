package ar.edu.unq.cpi.personajesAnimales.animales;

import ar.edu.unq.cpi.personajesAnimales.personajes.Personaje;
import ar.edu.unq.cpi.personajesAnimales.pocimas.PocimaAzul;

public class DuenioReal extends Duenio {
	private Personaje personaje;

	public DuenioReal(Personaje personaje) {
		this.personaje = personaje;
	}

	@Override
	public void recibirPocimaAzul(PocimaAzul pocima, Personaje personaje, Animal animal) {
		if (this.esElDuenio(personaje)) {
			animal.aumentarResistencia(pocima.getResistenciaAnimalPropio());
		} else {
			animal.disminuirResistencia(pocima.getResistenciaAnimalAjeno());
		}
	}

	private boolean esElDuenio(Personaje personaje) {
		return this.personaje.equals(personaje);
	}
}
