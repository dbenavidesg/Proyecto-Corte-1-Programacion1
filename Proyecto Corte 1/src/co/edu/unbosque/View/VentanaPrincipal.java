package co.edu.unbosque.View;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame {

	public JLabel Titulo;
	public PanelPrincipal pnl_principal;

	public VentanaPrincipal() {

		getContentPane().setLayout(null);
		setTitle(".:GRITOMAX:.");
		setSize(950, 750);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		pnl_principal = new PanelPrincipal();
		pnl_principal.setBounds(0, 0, 950, 750);
		add(pnl_principal);

		setVisible(true);

	}
}
