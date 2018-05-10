package ar.edu.unq.cpi.personajesAnimales.personajes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.cpi.personajesAnimales.animales.Animal;
import ar.edu.unq.cpi.personajesAnimales.pocimas.Pocima;
import ar.edu.unq.cpi.personajesAnimales.pocimas.TipoPocima;

public class Personaje {
	private static final int SABIDURIA_MAXIMA = 30;
	
	int sabiduria;
	List<Pocima> pocimas = new ArrayList<>();
	CriterioAnimal criterioAnimal;
	
	public CriterioAnimal getCriterioAnimal() {
		return criterioAnimal;
	}

	public void setCriterioAnimal(CriterioAnimal criterioAnimal) {
		this.criterioAnimal = criterioAnimal;
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	public List<Pocima> getPocimas() {
		return pocimas;
	}

	public void setPocimas(List<Pocima> pocimas) {
		this.pocimas = pocimas;
	}

	public void ganarSabiduria(int cantidad) {
		sabiduria = Math.min(sabiduria + cantidad, SABIDURIA_MAXIMA);
	}

	public void agregarPocima(Pocima pocima) {
		this.pocimas.add(pocima);
	}

	public void perderSabiduria(int cantidad) {
		sabiduria = Math.max(sabiduria - cantidad, 0);
	}

	public void encontrarseCon(Animal animal) {
		criterioAnimal.encontrarseCon(animal);
	}

	public boolean tienePocima(TipoPocima tipoBuscado) {
		return this.pocimas.stream().anyMatch(p -> p.getTipo().equals(tipoBuscado));
	}

	public void usarPocima(TipoPocima tipo, Animal animal) {
		Pocima pocima = this.getPocima(tipo);
		pocima.aplicar(animal, this);
		this.pocimas.remove(pocima);
	}

	private Pocima getPocima(TipoPocima tipo) {
		return this.pocimas.stream().filter(p -> p.getTipo().equals(tipo)).findAny().get();
	}
}
