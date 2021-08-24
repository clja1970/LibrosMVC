package es.pepecl2020.Libro;

public class Principal
{

	public static void main(String[] args)
	{
		Vista objVista = new Vista();
		Modelo objModelo = new Modelo ();
		new Controlador (objVista,objModelo);
	}

}
