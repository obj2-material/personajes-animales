package ar.edu.unq.cpi.personajesAnimales;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unq.cpi.personajesAnimales.pocimas.Pocima;

public class Personaje {
	private static final int SABIDURIA_MAXIMA = 30;
	
	int sabiduria;
	List<Pocima> pocimas = new ArrayList<>();
	
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
}
