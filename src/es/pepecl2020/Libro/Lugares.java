package es.pepecl2020.Libro;

import java.util.ArrayList;

public class Lugares
{
	ArrayList<String> lugares = new ArrayList<String>();
	
	public Lugares ()
	{
		lugares.add("España");
		lugares.add("la encimera");
		lugares.add("el horno");
		lugares.add("el crematorio");
		lugares.add("la cama");
	}

	public ArrayList<String> getLugares()
	{
		return lugares;
	}

	public void setLugares(ArrayList<String> lugares)
	{
		this.lugares = lugares;
	}
	
}
