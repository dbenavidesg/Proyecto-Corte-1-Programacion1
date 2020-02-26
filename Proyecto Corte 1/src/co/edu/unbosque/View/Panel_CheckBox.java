package co.edu.unbosque.View;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.Controller.Control;
import co.edu.unbosque.Model.Velocidad;

public class Panel_CheckBox extends JPanel {

	public JScrollPane barraDesplazamiento;
	public JCheckBox checkbox_velocidad;
	public JCheckBox checkbox_terror;
	public JCheckBox checkbox_acuatico;
	public JCheckBox checkbox_infantil;
	public JTable table;

	public Control control;

	public Panel_CheckBox() {

		setLayout(new FlowLayout());
		setBackground(Color.white);
		control = new Control();
		inicializarBarra();
		inicializarTexto();
		inicializarBarra();
		setVisible(true);

	}
	// arreglo de checkboxes

	public void inicializarTexto() {

		for (int i = 0; i < control.lista_atracciones.size(); i++) {
			
			if (control.lista_atracciones.get(i).tipo_atracciones.equals("Velocidad")) {
				JCheckBox checkbox_velocidad = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_velocidad);
				
			} else if (control.lista_atracciones.get(i).tipo_atracciones.equals("Terror")) {
				JCheckBox checkbox_terror = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_terror);
				
			} else if (control.lista_atracciones.get(i).tipo_atracciones.equals("Acuatico")) {
				JCheckBox checkbox_acuatico = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_acuatico);
				
			} else if (control.lista_atracciones.get(i).tipo_atracciones.equals("Infantil")) {
				JCheckBox checkbox_infantil = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_infantil);
				
			}

		}

	}

	public void inicializarTabla() {

		String[] nombre_columnas = { "Velocidad", "Terror", "Acuático", "Infantil" };

		DefaultTableModel model = new DefaultTableModel(nombre_columnas, 0);
		table = new JTable(model);
		table.setModel(model);

		for (int i = 0; i < control.lista_atracciones.size(); i++) {

			String velocidad = checkbox_velocidad.getText();
			String terror = checkbox_terror.getText();
			String acuatico = checkbox_acuatico.getText();
			String infantil = checkbox_infantil.getText();

			Object[] datos = { velocidad, terror, acuatico, infantil };

			model.addRow(datos);
		}

		DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
		Alinear.setHorizontalAlignment(SwingConstants.CENTER);

		for (int i = 0; i < nombre_columnas.length; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(Alinear);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table.getColumnModel().getColumn(0).setWidth(100);
		}

		JScrollPane scroll = new JScrollPane(table);
		add(scroll);
		table.setBounds(20, 20, 680, 650);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setWidth(100);
		table.setVisible(true);
	}

	public void inicializarBarra() {
		barraDesplazamiento = new JScrollPane(table);
		barraDesplazamiento.setBounds(5, 5, 695, 295);
		add(barraDesplazamiento);
	}
}
