package es.pepecl2020.Libro;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class Vista
{
	Frame ventana = new Frame("Libro");

	Label lbl1 = new Label("Profesiones");
	Label lbl2 = new Label("Acciones");
	Label lbl3 = new Label("Situacion");
	
	TextField txt1 = new TextField(20);
	TextField txt2 = new TextField(20);
	TextField txt3 = new TextField(20);

	Button btnGenerar = new Button("Generar");
	
	//Label txtRayas = new Label ("-------------------------");
	//Label txtRayasDos = new Label ("-------------------------");
	TextArea txaFinal = new TextArea (1,35);
	
	
	public Vista()
	{
		ventana.setLayout(new FlowLayout());
		
		ventana.add(lbl1);
		ventana.add(txt1);		
		ventana.add(lbl2);
		ventana.add(txt2);
		ventana.add(lbl3);
		ventana.add(txt3);
		//ventana.add(txtRayas);
		ventana.add(btnGenerar);
		//ventana.add(txtRayasDos);
		ventana.add(txaFinal);
		
		
		ventana.setBackground(Color.green);
		ventana.setSize(300, 220);
		ventana.setResizable(true);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}