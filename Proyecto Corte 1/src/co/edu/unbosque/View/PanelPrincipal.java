package co.edu.unbosque.View;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel {

	public JLabel fondo;
	public JButton boton_crear;
	public JButton boton_verTodos;
	public JButton boton_Elaboracion;
	public JButton boton_vendidos;
	public JButton boton_recaudo;
	public JButton ver_atrac;

	public PanelPrincipal() {

		setLayout(null);

		boton_crear = new JButton("Crear pasaporte");
		boton_crear.setBackground(Color.white);
		boton_crear.setForeground(Color.red);
		boton_crear.setBounds(15, 600, 150, 50);
		add(boton_crear);

		boton_verTodos = new JButton("Ver todos los pasaportes");
		boton_verTodos.setBounds(170, 600, 180, 50);
		boton_verTodos.setBackground(Color.white);
		boton_verTodos.setForeground(Color.orange);
		add(boton_verTodos);

		boton_Elaboracion = new JButton("Pasaportes en elaboracion");
		boton_Elaboracion.setBounds(355, 600, 210, 50);
		boton_Elaboracion.setBackground(Color.white);
		boton_Elaboracion.setForeground(Color.green);
		add(boton_Elaboracion);

		boton_vendidos = new JButton("Pasaportes vendidos");
		boton_vendidos.setBounds(570, 600, 170, 50);
		boton_vendidos.setBackground(Color.white);
		boton_vendidos.setForeground(Color.blue);
		add(boton_vendidos);

		boton_recaudo = new JButton("Recaudo pasportes");
		boton_recaudo.setBounds(745, 600, 150, 50);
		boton_recaudo.setBackground(Color.white);
		boton_recaudo.setForeground(Color.magenta);
		add(boton_recaudo);
		
		ver_atrac = new JButton("Ver atracciones");
		ver_atrac.setBounds(900, 600, 150, 50);
		ver_atrac.setBackground(Color.white);
		ver_atrac.setForeground(Color.pink);
		add(ver_atrac);


		fondo = new JLabel();
		fondo.setBounds(0, 0, 3000, 750);
		add(fondo);

	}

}
