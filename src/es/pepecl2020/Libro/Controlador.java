package es.pepecl2020.Libro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Controlador implements WindowListener, ActionListener
{
	Vista objvista= null;
	Modelo objmodelo= null;
	Profesiones objProfesion = null;
	Lugares objLugar = null;
	Accion objAccion = null;
	
	
	public Controlador(Vista objvista, Modelo objmodelo)
	{
		this.objvista= objvista;
		this.objmodelo= objmodelo;
		
		objProfesion = new Profesiones ();
		objAccion = new Accion ();
		objLugar = new Lugares ();
		objvista.ventana.addWindowListener(this);
		objvista.btnGenerar.addActionListener(this);
		
		objvista.ventana.setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource().equals(objvista.btnGenerar))
		{
			String prof, acci, sitio;
			
			prof = objProfesion.profesiones.get(objmodelo.tiradaProfesion());
			//System.out.println(objProfesion.profesiones.get(objmodelo.tiradaProfesion()));
			objvista.txt1.setText(prof);
			
			acci = objAccion.acciones.get(objmodelo.tiradaAccion());
			//System.out.println(objAccion.acciones.get(objmodelo.tiradaAccion()));
			objvista.txt2.setText(acci);
			
			sitio = objLugar.lugares.get(objmodelo.tiradaLugares());
			//System.out.println(objLugar.lugares.get(objmodelo.tiradaLugares()));
			objvista.txt3.setText(sitio);
			
			objvista.txaFinal.setText("   El " + prof + acci + sitio);
			
		}
		
	}


	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
		
	}


	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
}