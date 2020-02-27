package co.edu.unbosque.View;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
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

	public Control control;

	public Panel_CheckBox() {

		setLayout(new FlowLayout());
		setBackground(Color.white);
		control = new Control();
		inicializarBarra();
		inicializarTexto();
		inicializarTabla();
		setVisible(true);

	}
	// arreglo de checkboxes

	public void inicializarTexto() {

		checkbox = new JCheckBox();
		checkbox_velocidad = new JCheckBox();
		checkbox_terror = new JCheckBox();
		checkbox_acuatico = new JCheckBox();
		checkbox_infantil = new JCheckBox();

		for (int i = 0; i < control.lista_atracciones.size(); i++) {

			if (control.lista_atracciones.get(i).tipo_atracciones.equals("Velocidad")) {
				JCheckBox checkbox_velocidad = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_velocidad);
				checkbox_velocidad.setVisible(false);

			} 
			if (control.lista_atracciones.get(i).tipo_atracciones.equals("Terror")) {
				JCheckBox checkbox_terror = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_terror);
				checkbox_terror.setVisible(false);

			}
			if (control.lista_atracciones.get(i).tipo_atracciones.equals("Acuatico")) {
				JCheckBox checkbox_acuatico = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_acuatico);
				checkbox_acuatico.setVisible(false);

			}
			if (control.lista_atracciones.get(i).tipo_atracciones.equals("Infantil")) {
				JCheckBox checkbox_infantil = new JCheckBox(control.lista_atracciones.get(i).getNombre());
				add(checkbox_infantil);
				checkbox_infantil.setVisible(false);

			}

		}

	}

	public void inicializarTabla() {

		String[] nombre_columnas = { " ", "Velocidad", " ", "Terror", " ", "Acuático", " ", "Infantil" };

		DefaultTableModel model = new DefaultTableModel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public Class<?> getColumnClass(int column) {
				
				if(column % 2 == 0) {
					return Boolean.class;
				} else if(column % 2 == 1) {
					return String.class;
				}
				return String.class;
			}
		};

		table = new JTable(model);
		table.setModel(model);

		for (int i = 0; i < control.lista_atracciones.size(); i++) {
			for (int j = 0; j < nombre_columnas.length; j++) {
				if(model.getValueAt(i, j).getClass().equals(Boolean.class)) {
					  checkbox.setSelected(Boolean.parseBoolean(model.getValueAt(i,j).toString()));
				} else {
					
				}
			}


//			if(model.getColumnClass(i) != null) {
//				if(i % 2 == 0) {
//
//
//
//				} else if(i % 2 == 1) {
//					String velocidad = checkbox_velocidad.getText();
//					String terror = checkbox_terror.getText();
//					String acuatico = checkbox_acuatico.getText();
//					String infantil = checkbox_infantil.getText();
//
//					String [] datos = { velocidad, terror, acuatico, infantil };
//					model.addRow(datos);
//				}
//			}



		}

		DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
		Alinear.setHorizontalAlignment(SwingConstants.CENTER);

		for (int i = 0; i < nombre_columnas.length; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(Alinear);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table.getColumnModel().getColumn(i).setWidth(200);
		}

		JScrollPane scroll = new JScrollPane(table);
		add(scroll);
		table.setBounds(20, 20, 700, 650);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setWidth(100);
		table.setVisible(true);
	}

	public void inicializarBarra() {
		barraDesplazamiento = new JScrollPane(table);
		barraDesplazamiento.setBounds(5, 5, 700, 330);
		add(barraDesplazamiento);
	}
}
