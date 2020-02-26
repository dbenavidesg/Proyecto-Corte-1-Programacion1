package co.edu.unbosque.View;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import co.edu.unbosque.Controller.Control;
import co.edu.unbosque.Model.Velocidad;

public class VentanaAtracciones extends JFrame {

	public Control control;
	public JTable table;

	public VentanaAtracciones(Control c) {
		control = c;
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setResizable(false);
		inicializarComponentes();

		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void inicializarComponentes() {

		String[] nombre_columnas = { "Nombre", "Tipo", "Precio Predeterminado", "Estatura Mínima", "Estatura Máxima" };

		DefaultTableModel model = new DefaultTableModel(nombre_columnas, 0);
		table = new JTable(model);
		table.setModel(model);

		for (int i = 0; i < control.lista_pasaportes.size(); i++) {

			String nombre = control.lista_atracciones.get(i).getNombre();
			String tipo = control.lista_atracciones.get(i).getTipo_atracciones();
			int precio = (int) control.lista_atracciones.get(i).getPrecio();
//			String est_min = control.lista_atracciones.get(i).ge
//			String est_max = 

			Object[] datos = { nombre, tipo, precio };
			model.addRow(datos);
		}

		DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
		Alinear.setHorizontalAlignment(SwingConstants.CENTER);

		for (int i = 0; i < nombre_columnas.length; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(Alinear);
//	TableColumnModel column_model = new Table
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table.getColumnModel().getColumn(0).setWidth(100);
		}

		JScrollPane scroll = new JScrollPane(table);
		getContentPane().add(scroll);
		table.setBounds(20, 20, 680, 650);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setWidth(100);
		table.setVisible(true);

	}
}
