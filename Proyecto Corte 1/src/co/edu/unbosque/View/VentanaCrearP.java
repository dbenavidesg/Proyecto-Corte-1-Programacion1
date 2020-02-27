package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import co.edu.unbosque.Controller.Control;

public class VentanaCrearP extends JFrame {

	public JTextField nombre;
	public JLabel et_nombre;
	public JTextField cedula;
	public JLabel et_cedula;
	public JTextField estatura;
	public JLabel et_estatura;
	public JTextField edad;
	public JLabel et_edad;
	public JButton validar1;
	public JLabel Tit;

	public Panel_categoria p1;
	public Panel_CheckBox panel_checkbox;

	public VentanaCrearP() {

		getContentPane().setLayout(null);
		setTitle(".:CREAR PASAPORTE:.");
		setSize(700, 800);
		setResizable(false);
		setBackground(Color.pink);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		inicializar();
		setVisible(true);
	}

	public void inicializar() {
		
		Tit = new JLabel(".:CREAR NUEVO PASAPORTE:.");
		Tit.setBounds(200, 20, 300, 50);
		Tit.setForeground(Color.black);
		Tit.setFont(new Font("Arial", Font.BOLD, 18));
		add(Tit);

		nombre = new JTextField();
		nombre.setBounds(200, 70, 100, 30);
		add(nombre);

		et_nombre = new JLabel("Nombre: ");
		et_nombre.setBounds(140, 70, 100, 30);
		add(et_nombre);

		cedula = new JTextField();
		cedula.setBounds(410, 70, 100, 30);
		add(cedula);

		et_cedula = new JLabel("Cedula: ");
		et_cedula.setBounds(360, 70, 100, 30);
		add(et_cedula);

		estatura = new JTextField();
		estatura.setBounds(200, 130, 100, 30);
		add(estatura);

		et_estatura = new JLabel("Estatura: ");
		et_estatura.setBounds(140, 130, 100, 30);
		add(et_estatura);

		edad = new JTextField();
		edad.setBounds(410, 130, 100, 30);
		add(edad);

		et_edad = new JLabel("Edad: ");
		et_edad.setBounds(360, 130, 100, 30);
		add(et_edad);

		p1 = new Panel_categoria();
		p1.setBounds(0, 200, 700, 150);
		getContentPane().add(p1);
		setLocationRelativeTo(null);
		setVisible(false);
		
		panel_checkbox = new Panel_CheckBox();
		panel_checkbox.setBounds(20, 350, 700, 350);
		panel_checkbox.setVisible(false);
		add(panel_checkbox);


	}
}
