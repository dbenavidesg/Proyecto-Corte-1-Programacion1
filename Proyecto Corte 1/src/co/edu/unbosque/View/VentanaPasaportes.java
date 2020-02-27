package co.edu.unbosque.View;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import co.edu.unbosque.Controller.Control;

public class VentanaPasaportes extends JFrame {

	public Control control;
	public JTable table;
	public DefaultTableModel model;
	public JButton boton_regresar;
	public JButton boton_eliminar;

//	Object[][] datos = { { nombres, cedula, edad, estatura, estado, categoria, numero_atracciones } };
	public VentanaPasaportes(Control c) {
		control = c;
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 520);
		setTitle("Lista de Pasaportes");
		setResizable(false);
		inicializarComponentes();

		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void inicializarComponentes() {

		String[] nombre_columnas = { "Nombre Dueño", "Cédula", "Edad", "Estatura", "Estado Pasaporte", "Categoria",
				"Número de Atracciones" };

		DefaultTableModel model = new DefaultTableModel(nombre_columnas, 0);
		table = new JTable(model);
		table.setModel(model);

		for (int i = 0; i < control.lista_pasaportes.size(); i++) {

			String nombres = control.lista_pasaportes.get(i).getNombre_dueño();
			String cedula = control.lista_pasaportes.get(i).getCedula();
			int edad = control.lista_pasaportes.get(i).getEdad();
			int estatura = control.lista_pasaportes.get(i).getEstatura();
			String estado = control.lista_pasaportes.get(i).getEstado_pasaporte();
			String categoria = control.lista_pasaportes.get(i).getCategoria();
			int numero_atracciones = control.lista_pasaportes.get(i).getNumero_atracciones();

			Object[] datos = { nombres, cedula, edad, estatura, estado, categoria, numero_atracciones };

			model.addRow(datos);
		}

		DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
		Alinear.setHorizontalAlignment(SwingConstants.CENTER);
		


		for (int i = 0; i < nombre_columnas.length; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(Alinear);
			TableColumnModel columnModel = table.getColumnModel();
			columnModel.getColumn(i).setPreferredWidth(200);

		}

		JScrollPane scroll = new JScrollPane(table);
		getContentPane().add(scroll);
		table.setBounds(20, 20, 680, 650);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setWidth(100);
		table.setVisible(true);

		boton_eliminar = new JButton("Eliminar un Pasaporte");
		boton_eliminar.setBounds(0, 510, 100, 100);
		add(boton_eliminar);

		boton_regresar = new JButton("Regresar");
		boton_regresar.setBounds(0, 510, 150, 100);
		add(boton_regresar);

	}
}
