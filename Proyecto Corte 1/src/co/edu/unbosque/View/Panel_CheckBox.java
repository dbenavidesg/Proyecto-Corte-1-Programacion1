package co.edu.unbosque.View;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import co.edu.unbosque.Controller.Control;

public class Panel_CheckBox extends JPanel {

	public JTextField campo_texto_atracciones;
	public JScrollPane barraDesplazamiento;
	public JCheckBox checkbox;

	public Control control;

	public Panel_CheckBox() {

		setLayout(new FlowLayout());
		setBackground(Color.white);
		control = new Control();
		inicializarBarra();
		inicializarTexto();
		setVisible(true);

	}
	// arreglo de checkboxes

	public void inicializarTexto() {

//		ArrayList<JCheckBox> checkboxes = new ArrayList<JCheckBox>();

		for (int i = 0; i < control.lista_atracciones.size(); i++) {
//			String [] nombres = { control.lista_atracciones.get(i).getNombre() };
			JCheckBox checkbox = new JCheckBox(control.lista_atracciones.get(i).getNombre());
			add(checkbox);
			// checkboxes.add(checkbox);

		}

		campo_texto_atracciones = new JTextField();
		campo_texto_atracciones.setBounds(10, 10, 690, 290);
		add(campo_texto_atracciones);

//		System.out.println(checkbox);

	}

	public void inicializarBarra() {
		barraDesplazamiento = new JScrollPane(campo_texto_atracciones);
		barraDesplazamiento.setBounds(5, 5, 695, 295);
		add(barraDesplazamiento);
	}
}
