package ar.edu.unq.cpi.personajesAnimales.pocimas;

import ar.edu.unq.cpi.personajesAnimales.animales.Animal;
import ar.edu.unq.cpi.personajesAnimales.personajes.Personaje;

public abstract class Pocima {
	public abstract TipoPocima getTipo();
	public abstract void aplicar(Animal animal, Personaje personaje);
}
