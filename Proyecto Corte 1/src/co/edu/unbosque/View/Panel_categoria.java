package co.edu.unbosque.View;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel_categoria extends JPanel {

	public JComboBox<String> categoria;
	public JLabel et_categoria;
	public JButton validar2;

	public Panel_categoria() {

		setLayout(null);
		setBackground(Color.gray);
		setBounds(0, 180, 650, 300);
		setVisible(true);
		inicializar();
	}

	public void inicializar() {

		et_categoria = new JLabel("Categoria pasaporte: ");
		et_categoria.setBounds(200, 40, 130, 30);
		add(et_categoria);

		String[] kk = { "Oro", "Plata", "Bronce" };
		categoria = new JComboBox<String>(kk);
		categoria.setBounds(350, 40, 100, 30);
		add(categoria);

		validar2 = new JButton("Validar");
		validar2.setBounds(300, 90, 80, 20);
		add(validar2);

	}
}
