package co.edu.unbosque.View;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

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

	public Object filasTable() {

		Object [][] datos = new Object [][]{};	
		
		for (int i = 0; i < control.lista_pasaportes.size(); i++) {
			
			String[] nombres = { control.lista_pasaportes.get(i).nombre_dueño };
			String[] cedula = { control.lista_pasaportes.get(i).cedula };
			Object[] edad = { control.lista_pasaportes.get(i).edad };
			Object[] estatura = { control.lista_pasaportes.get(i).estatura };
			String[] estado = { control.lista_pasaportes.get(i).estado_pasaporte };
			String[] categoria = { control.lista_pasaportes.get(i).categoria };
			Object[] numero_atracciones = { control.lista_pasaportes.get(i).numero_atracciones };

			datos = { nombres, cedula, edad, estatura, estado, categoria, numero_atracciones };

		}

	}

	public void inicializarComponentes() {

		String[] nombre_columnas = { "Nombre Dueño", "Cédula", "Edad", "Estatura", "Estado Pasaporte", "Categoria",
				"Número de Atracciones" };

		JTable table = new JTable((Object[][]) filasTable(), nombre_columnas);

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
//
//		String nombres = control.lista_pasaportes.get(index);
//		String[] cedula = { control.lista_pasaportes.get(i).cedula };
//		int[] edad = { control.lista_pasaportes.get(i).edad };
//		int[] estatura = { control.lista_pasaportes.get(i).estatura };
//		String[] estado = { control.lista_pasaportes.get(i).estado_pasaporte };
//		String[] categoria = { control.lista_pasaportes.get(i).categoria };
//		int[] numero_atracciones = { control.lista_pasaportes.get(i).numero_atracciones };

		table.getColumnModel().getColumn(0).setCellRenderer(Alinear);
		JScrollPane scroll = new JScrollPane(table);

		getContentPane().add(scroll);

	}
}
