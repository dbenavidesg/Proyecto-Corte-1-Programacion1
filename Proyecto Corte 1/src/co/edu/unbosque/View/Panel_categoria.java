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

	/**
	 * El método constructor es aquel método al que se le asigna la inicialización
	 * de las variables y objetos. Además, se añaden las características de este
	 * JPanel. <b>post</b> Se debe crear cada uno de los objetos o caracteristicas
	 * dadas en el constructor<br>
	 */

	public Panel_categoria() {

		setLayout(null);
		setBackground(Color.pink);
		setBounds(0, 180, 650, 300);
		setVisible(true);
		inicializar();
	}

	/**
	 * A este método le corresponde la inicialización de los atributos descritos con
	 * anterioridad. <b>pre</b> Se debe de crear con anterioridad la VentanaCrearP
	 * <br>
	 * <b>post</b> Se deben crear y asignar al panel cada uno de los atributos dados
	 * <br>
	 */

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
