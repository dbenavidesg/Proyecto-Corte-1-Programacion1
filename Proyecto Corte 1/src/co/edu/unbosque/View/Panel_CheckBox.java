package co.edu.unbosque.View;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import co.edu.unbosque.Controller.Control;

public class Panel_CheckBox extends JPanel {

	public JTextField campo_texto_atracciones;
	public JScrollPane barraDesplazamiento;
	public JCheckBox check_box;
	
	public Control control;

	public Panel_CheckBox() {

		setLayout(null);
		setBackground(Color.white);

	}
	
	public void inicializarTexto() {
		String [] nombre_atracciones = new String[] {};
		for (int i = 0; i < control.lista_atracciones.size(); i++) {
			String [] nombre_atracciones2 = { control.lista_atracciones.get(i).nombre };
			nombre_atracciones = nombre_atracciones2;
		}
		check_box = new JCheckBox(control.lista_atracciones.get(0).getNombre());
	}

	public void inicializarBarra() {
		barraDesplazamiento = new JScrollPane(campo_texto_atracciones);
		barraDesplazamiento.setBounds(5, 5, 695, 295);
		add(barraDesplazamiento);
	}
}
