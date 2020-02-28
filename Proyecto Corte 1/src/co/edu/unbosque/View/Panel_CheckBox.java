package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.Controller.Control;

public class Panel_CheckBox extends JPanel {

	public JScrollPane barraDesplazamiento;
	public JCheckBox checkbox_velocidad;
	public JCheckBox checkbox_terror;
	public JCheckBox checkbox_acuatico;
	public JCheckBox checkbox_infantil;
	public JCheckBox checkbox;
	public JTable table;
	public JLabel etiqueta_instrucciones;
	public JButton boton_terminar;

	public Control control;

	/**
	 * El método constructor es aquel método al que se le asigna la inicialización
	 * de las variables y objetos. Además, se añaden las características de este
	 * JFrame. <b>post</b> Se debe crear cada uno de los objetos o
	 * caracteristicas dadas en el constructor<br>
	 */

	public Panel_CheckBox() {

		setLayout(new FlowLayout());
		setBackground(Color.white);
		control = new Control();

		TitledBorder border = new TitledBorder("Seleccionar Atracciones");
		border.setTitleColor(Color.black);
		setBorder(border);

		inicializarTexto();
		setVisible(true);

	}

	/**
	 * A este método le corresponde la inicialización de los atributos descritos con
	 * anterioridad. <b>pre</b> Se debe de crear con anterioridad la VentanaCrearP y
	 * la lista de atracciones. <br>
	 * <b>post</b> Se deben crear y asignar al panel cada uno de los atributos dados
	 * <br>
	 */

	public void inicializarTexto() {

		etiqueta_instrucciones = new JLabel("Por favor seleccione al menos cinco atracciones");
		etiqueta_instrucciones.setBounds(10, 10, 670, 20);
		etiqueta_instrucciones.setForeground(Color.pink);
		add(etiqueta_instrucciones);

		checkbox = new JCheckBox();
		checkbox_velocidad = new JCheckBox();
		checkbox_terror = new JCheckBox();
		checkbox_acuatico = new JCheckBox();
		checkbox_infantil = new JCheckBox();

		for (int i = 0; i < control.lista_atracciones.size(); i++) {

			if (control.lista_atracciones.get(i).tipo_atracciones.equals("Velocidad")) {
				JCheckBox checkbox_velocidad = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_velocidad);

			}
			if (control.lista_atracciones.get(i).tipo_atracciones.equals("Terror")) {
				JCheckBox checkbox_terror = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_terror);

			}
			if (control.lista_atracciones.get(i).tipo_atracciones.equals("Acuatico")) {
				JCheckBox checkbox_acuatico = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_acuatico);

			}
			if (control.lista_atracciones.get(i).tipo_atracciones.equals("Infantil")) {
				JCheckBox checkbox_infantil = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_infantil);

			}

		}

		boton_terminar = new JButton("Finalizar");
		boton_terminar.setBounds(50, 500, 50, 20);
		add(boton_terminar);

	}

}
