package es.pepecl2020.Libro;

import java.util.ArrayList;

public class Accion
{
	ArrayList<String> acciones = new ArrayList<String>();

	public Accion()
	{	
		acciones.add("canta en ");
		acciones.add("baila en ");
		acciones.add("grita en ");
		acciones.add("come en ");
		acciones.add("caca en ");
	}

	public ArrayList<String> getAccion()
	{
		return acciones;
	}

	public void setAccion(ArrayList<String> acciones)
	{
		this.acciones = acciones;
	}
}