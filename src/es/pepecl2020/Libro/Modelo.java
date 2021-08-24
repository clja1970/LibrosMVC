package es.pepecl2020.Libro;

import java.util.Random;

public class Modelo
{
	Random aleatorioProfesion = new Random();
	Random  aleatorioAccion = new Random();
	Random aleatorioLugares = new Random();
	
	
	
	public int tiradaProfesion()
	{
		return(aleatorioProfesion.nextInt(4));
	}
	public int tiradaAccion()
	{
		return(aleatorioAccion.nextInt(4));
	}
	public int tiradaLugares()
	{
		return(aleatorioLugares.nextInt(4));
	}
}
