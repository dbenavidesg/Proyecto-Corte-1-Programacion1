package co.edu.unbosque.View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

	public JButton boton_crear;
	public JButton boton_verTodos;
	public JButton boton_Elaboracion;
	public JButton boton_vendidos;
	public JButton boton_recaudo;
	public JLabel Titulo;
	public Img_fondo imagen_fondo;

	public VentanaPrincipal() {

		getContentPane().setLayout(null);
		setTitle(".:GRITOMAX:.");
		setSize(950, 750);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		boton_crear = new JButton("Crear pasaporte");
		boton_crear.setBounds(15, 600, 150, 50);
		add(boton_crear);

		boton_verTodos = new JButton("Ver todos los pasaportes");
		boton_verTodos.setBounds(170, 600, 180, 50);
		add(boton_verTodos);

		boton_Elaboracion = new JButton("Pasaportes en elaboracion");
		boton_Elaboracion.setBounds(355, 600, 210, 50);
		add(boton_Elaboracion);

		boton_vendidos = new JButton("Pasaportes vendidos");
		boton_vendidos.setBounds(570, 600, 170, 50);
		add(boton_vendidos);

		boton_recaudo = new JButton("Recaudo pasportes");
		boton_recaudo.setBounds(745, 600, 150, 50);
		add(boton_recaudo);
		
		imagen_fondo = new Img_fondo();
		imagen_fondo.setBounds(0, 0, 950, 750);
		add(imagen_fondo);

		setVisible(true);

	}
}
