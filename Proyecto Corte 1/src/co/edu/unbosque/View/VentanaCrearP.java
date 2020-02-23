package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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

	public VentanaCrearP() {

		getContentPane().setLayout(null);
		setTitle(".:CREAR PASAPORTE:.");
		setSize(600, 800);
		setResizable(false);
		setBackground(Color.gray);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		inicializar();
		setVisible(true);
	}

	public void inicializar() {

		nombre = new JTextField();
		nombre.setBounds(240, 90, 150, 30);
		add(nombre);

		et_nombre = new JLabel("Nombre: ");
		et_nombre.setBounds(160, 90, 100, 30);
		add(et_nombre);

		cedula = new JTextField();
		cedula.setBounds(240, 145, 150, 30);
		add(cedula);

		et_cedula = new JLabel("Cedula: ");
		et_cedula.setBounds(160, 145, 100, 30);
		add(et_cedula);

		estatura = new JTextField();
		estatura.setBounds(240, 200, 150, 30);
		add(estatura);

		et_estatura = new JLabel("Estatura: ");
		et_estatura.setBounds(160, 200, 100, 30);
		add(et_estatura);

		edad = new JTextField();
		edad.setBounds(240, 250, 150, 30);
		add(edad);

		et_edad = new JLabel("Edad: ");
		et_edad.setBounds(160, 250, 100, 30);
		add(et_edad);

		Tit = new JLabel(".:CREAR NUEVO PASAPORTE:.");
		Tit.setBounds(150, 20, 350, 50);
		Tit.setFont(new Font("Arial", Font.TRUETYPE_FONT, 20));
		add(Tit);
		//mv boli

		p1 = new Panel_categoria();
		p1.setBounds(0, 300, 650, 200);
		getContentPane().add(p1);
		setLocationRelativeTo(null);
		setVisible(false);

	}
}
