package co.edu.unbosque.View;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

	public JLabel Titulo;
	public PanelPrincipal pnl_principal;

	/**
	 * Este es el constructor de la clase VentanaPrincipal es aquel al cual se le asigna la
	 * inicialización. <b>post</b> Se debe crear cada uno de los objetos o
	 * caracteristicas dadas en el constructor<br>
	 */
	
	public VentanaPrincipal() {

		getContentPane().setLayout(null);
		setTitle(".:GRITOMAX:.");
		setSize(1080, 750);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		pnl_principal = new PanelPrincipal();
		pnl_principal.setBounds(0, 0, 2000, 750);
		add(pnl_principal);

		setVisible(true);

	}
}
