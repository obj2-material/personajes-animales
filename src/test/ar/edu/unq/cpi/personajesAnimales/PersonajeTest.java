package ar.edu.unq.cpi.personajesAnimales;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ar.edu.unq.cpi.personajesAnimales.animales.Animal;
import ar.edu.unq.cpi.personajesAnimales.animales.Buey;
import ar.edu.unq.cpi.personajesAnimales.animales.DuenioReal;
import ar.edu.unq.cpi.personajesAnimales.personajes.CriterioAplicarPocima;
import ar.edu.unq.cpi.personajesAnimales.personajes.Personaje;
import ar.edu.unq.cpi.personajesAnimales.pocimas.PocimaAzul;

public class PersonajeTest {
	Personaje luisa;
	Animal buey;
	
	@Before
	public void setUp() {
		luisa = new Personaje();
		buey = new Buey();
		buey.setDuenio(new DuenioReal(luisa));
	}
	
	@Test
	public void criterioAplicarPocimaUsaAzulCuandoHay() {
		luisa.setCriterioAnimal(new CriterioAplicarPocima(luisa));
		luisa.agregarPocima(new PocimaAzul(3, 5));
		
		luisa.encontrarseCon(buey);
		
		assertTrue(luisa.getPocimas().isEmpty());
		assertEquals(3, buey.getResistencia());
	}
}
