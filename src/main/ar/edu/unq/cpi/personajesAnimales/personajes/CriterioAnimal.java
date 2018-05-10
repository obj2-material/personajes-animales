package ar.edu.unq.cpi.personajesAnimales.personajes;

import ar.edu.unq.cpi.personajesAnimales.animales.Animal;

public abstract class CriterioAnimal {
	Personaje personaje;
	
	public CriterioAnimal(Personaje personaje) {
		this.personaje = personaje;
	}
	
	public abstract void encontrarseCon(Animal animal);
}
