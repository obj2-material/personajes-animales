package ar.edu.unq.cpi.personajesAnimales.castillos;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unq.cpi.personajesAnimales.personajes.Personaje;
import ar.edu.unq.cpi.personajesAnimales.pocimas.Pocima;

public abstract class Castillo {
	private Set<Personaje> personajesQuePasaron = new HashSet<>();
	private int capacidadCreacionPocimas;

	public Set<Personaje> getPersonajesQuePasaron() {
		return personajesQuePasaron;
	}

	public void setPersonajesQuePasaron(Set<Personaje> personajesQuePasaron) {
		this.personajesQuePasaron = personajesQuePasaron;
	}

	public int getCapacidadCreacionPocimas() {
		return capacidadCreacionPocimas;
	}

	public void setCapacidadCreacionPocimas(int capacidadCreacionPocimas) {
		this.capacidadCreacionPocimas = capacidadCreacionPocimas;
	}

	public void registrarPaso(Personaje personaje) {
		if (this.puedeProducirPocima()) {
			personaje.agregarPocima(this.crearPocima(personaje));
		}
		this.modificarSabiduria(personaje);
		this.recordarPaso(personaje);
	}
	
	protected void modificarSabiduria(Personaje personaje) {
		personaje.ganarSabiduria(2);
	}

	public void recargarCapacidadPocimas() {
		this.capacidadCreacionPocimas += 6;
	}
	
	public boolean pasoPorAqui(Personaje personaje) {
		return this.personajesQuePasaron.contains(personaje);
	}
	
	public void crearAnimal() {
		
	}

	private void recordarPaso(Personaje personaje) {
		this.personajesQuePasaron.add(personaje);
	}

	private Pocima crearPocima(Personaje personaje) {
		this.capacidadCreacionPocimas--;
		return this.confeccionarPocima(personaje);
	}

	protected abstract Pocima confeccionarPocima(Personaje personaje);

	private boolean puedeProducirPocima() {
		return this.capacidadCreacionPocimas > 0;
	}
}
