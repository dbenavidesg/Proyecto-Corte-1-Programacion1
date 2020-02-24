package co.edu.unbosque.View;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import co.edu.unbosque.Controller.Control;

public class VentanaPasaportes extends JFrame {

	public Control control;

//	Object[][] datos = { { nombres, cedula, edad, estatura, estado, categoria, numero_atracciones } };
	public VentanaPasaportes() {

		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setResizable(false);
		inicializarComponentes();

		setLocationRelativeTo(null);
		setVisible(true);

	}

	public void inicializarComponentes() {
		
		Object [][] datos = new Object [][] {};	
		
		for (int i = 0; i < control.lista_pasaportes.size(); i++) {
			
			String[] nombres = { control.lista_pasaportes.get(i).getNombre_dueño() };
			String[] cedula = { control.lista_pasaportes.get(i).getCedula() };
			Object[] edad = { control.lista_pasaportes.get(i).getEdad() };
			Object[] estatura = { control.lista_pasaportes.get(i).getEstatura() };
			String[] estado = { control.lista_pasaportes.get(i).getEstado_pasaporte() };
			String[] categoria = { control.lista_pasaportes.get(i).getCategoria() };
			Object[] numero_atracciones = { control.lista_pasaportes.get(i).getNumero_atracciones() };

			Object [][] datos1 = { nombres, cedula, edad, estatura, estado, categoria, numero_atracciones };
			
			datos = datos1;
		}

		String[] nombre_columnas = { "Nombre Dueño", "Cédula", "Edad", "Estatura", "Estado Pasaporte", "Categoria",
				"Número de Atracciones" };

		JTable table = new JTable(datos, nombre_columnas);

		DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
		Alinear.setHorizontalAlignment(SwingConstants.CENTER);

//		DefaultTableModel model = new DefaultTableModel();
//		model.addColumn("Nombre Dueño");
//		model.addColumn("Cédula");
//		model.addColumn("Edad");
//		model.addColumn("Estatura");
//		model.addColumn("Estado Pasaporte");
//		model.addColumn("Categoria");
//		model.addColumn("Número de Atracciones");
//
//		table.setModel(model);
		
		for (int i = 0; i < nombre_columnas.length; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(Alinear);
		}
		
		JScrollPane scroll = new JScrollPane(table);
		getContentPane().add(scroll);
		table.setVisible(true);

	}
}
