package ar.edu.unq.cpi.personajesAnimales.animales;

import ar.edu.unq.cpi.personajesAnimales.personajes.Personaje;
import ar.edu.unq.cpi.personajesAnimales.pocimas.PocimaAzul;

public abstract class Animal {
	int fuerzaVinculo;
	int energia;
	int resistencia;
	Duenio duenio;

	public int getFuerzaVinculo() {
		return fuerzaVinculo;
	}

	public void setFuerzaVinculo(int fuerzaVinculo) {
		this.fuerzaVinculo = fuerzaVinculo;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {	
		this.energia = energia;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public Duenio getDuenio() {
		return duenio;
	}

	public void setDuenio(Duenio duenio) {
		this.duenio = duenio;
	}

	public void recibirPocimaAzul(PocimaAzul pocima, Personaje personaje) {
		this.duenio.recibirPocimaAzul(pocima, personaje, this);
	}

	public void aumentarResistencia(int cantidad) {
		this.resistencia += cantidad;
	}

	public void disminuirResistencia(int cantidad) {
		this.resistencia -= cantidad;
	}
}
