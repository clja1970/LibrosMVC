package es.pepecl2020.Libro;

import java.util.ArrayList;

public class Profesiones
{
	public ArrayList<String> profesiones = new ArrayList<String>();
	
	public Profesiones()
	
	{
		profesiones.add("Butanero ");
		profesiones.add("Fontanero ");
		profesiones.add("Gasolinero ");
		profesiones.add("Desempleado ");
		profesiones.add("Físico nuclear ");
	}

	public ArrayList<String> getProfesiones()
	{
		return profesiones;
	}

	public void setProfesiones(ArrayList<String> profesiones)
	{
		this.profesiones = profesiones;
	}
	
}
