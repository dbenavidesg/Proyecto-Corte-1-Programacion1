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

public class VentanaElaboracion extends JFrame {

	public Control control;
	public JTable table;
	public DefaultTableModel model;
	public JButton boton_atras;

	/**
	 * Este es el constructor de la clase VentanaElaboracion al que se le asigna la
	 * inicializaci�n. <b>post</b>Se debe crear la ventana<br>
	 * 
	 * @param c Este parametro es utilizado para llamar a la clase control y c !=
	 *          null, c != " ".
	 */

	public VentanaElaboracion(Control c) {

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

	/**
	 * Este metodo crea la tabla, la barra de dezplasamiento y un boton <b>pre</b>
	 * Se debe de crear con anterioridad la lista con los pasaportes. <br>
	 * <b>post</b> Se deben crear las caracteristicas dadas en el metodo.<br>
	 */

	public void inicializarComponentes() {

		String[] nombre_columnas = { "Nombre Due�o", "C�dula", "Edad", "Estatura", "Estado Pasaporte", "Categoria",
				"N�mero de Atracciones" };

		DefaultTableModel model = new DefaultTableModel(nombre_columnas, 0);
		table = new JTable(model);
		table.setModel(model);

		for (int i = 0; i < control.lista_pasaportes.size(); i++) {

			if (control.lista_pasaportes.get(i).getEstado_pasaporte().equals("En Elaboracion")) {

				String nombres = control.lista_pasaportes.get(i).getNombre_due�o();
				String cedula = control.lista_pasaportes.get(i).getCedula();
				int edad = control.lista_pasaportes.get(i).getEdad();
				int estatura = control.lista_pasaportes.get(i).getEstatura();
				String estado = control.lista_pasaportes.get(i).getEstado_pasaporte();
				String categoria = control.lista_pasaportes.get(i).getCategoria();
				int numero_atracciones = control.lista_pasaportes.get(i).getNumero_atracciones();

				Object[] datos = { nombres, cedula, edad, estatura, estado, categoria, numero_atracciones };

				model.addRow(datos);
			}

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

		boton_atras = new JButton("Volver");
		boton_atras.setBounds(0, 510, 150, 100);
		add(boton_atras);

	}
}
