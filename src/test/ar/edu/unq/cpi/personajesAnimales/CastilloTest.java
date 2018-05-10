package ar.edu.unq.cpi.personajesAnimales;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ar.edu.unq.cpi.personajesAnimales.castillos.Castillo;
import ar.edu.unq.cpi.personajesAnimales.castillos.CastilloAgricola;
import ar.edu.unq.cpi.personajesAnimales.castillos.CastilloMaligno;
import ar.edu.unq.cpi.personajesAnimales.personajes.Personaje;
import ar.edu.unq.cpi.personajesAnimales.pocimas.Pocima;
import ar.edu.unq.cpi.personajesAnimales.pocimas.PocimaAzul;

public class CastilloTest {
	Castillo castilloAgricola;
	Personaje juana;
	
	@Before
	public void setUp() {
		castilloAgricola = new CastilloAgricola(2, 3);
		castilloAgricola.recargarCapacidadPocimas();
		
		juana = new Personaje();
	}
	
	@Test
	public void seRecuerdaPasoPersonaje() {
		castilloAgricola.registrarPaso(juana);
		assertTrue(castilloAgricola.pasoPorAqui(juana));
	}
	
	@Test
	public void aumentaSabiduriaPersonaje() {
		castilloAgricola.registrarPaso(juana);
		assertEquals(2, juana.getSabiduria());
	}
	
	@Test
	public void siTieneCapacidadAgregaPocimaAlPersonaje() {
		castilloAgricola.registrarPaso(juana);
		assertEquals(1, juana.getPocimas().size());
	}
	
	@Test
	public void siNoTieneCapacidadNoAgregaPocimaAlPersonaje() {
		castilloAgricola.setCapacidadCreacionPocimas(0);
		castilloAgricola.registrarPaso(juana);
		assertTrue(juana.getPocimas().isEmpty());
	}
	
	@Test
	public void castilloAgricolaAgregaPocimaAzulConBonusDeSabiduria() {
		juana.setSabiduria(21);
		castilloAgricola.registrarPaso(juana);
		PocimaAzul pocimaAzul = (PocimaAzul) juana.getPocimas().get(0);
		assertEquals(5, pocimaAzul.getResistenciaAnimalPropio());
	}
	
	@Test
	public void castilloAgricolaAgregaPocimaAzulSinBonusDeSabiduria() {
		castilloAgricola.registrarPaso(juana);
		PocimaAzul pocimaAzul = (PocimaAzul) juana.getPocimas().get(0);
		assertEquals(2, pocimaAzul.getResistenciaAnimalPropio());
	}
	
	@Test
	public void pasarPorCastilloMalignoDisminuyeSabiduria() {
		juana.setSabiduria(9);
		new CastilloMaligno().registrarPaso(juana);
		assertEquals(4, juana.getSabiduria());
	}
}
