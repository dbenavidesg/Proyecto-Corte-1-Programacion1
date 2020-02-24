package co.edu.unbosque.View;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

import co.edu.unbosque.Controller.Control;
import co.edu.unbosque.Model.Velocidad;

public class VentanaAtracciones extends JFrame {

	public Control control;

	public VentanaAtracciones() {

		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 500);
		setResizable(false);
		inicializarComponentes();

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void inicializarComponentes() {

		Object[][] datos = new Object[][] {};

		for (int i = 0; i < control.lista_atracciones.size(); i++) {
			String [] nombre = { control.lista_atracciones.get(i).getNombre() };
			String [] tipo = { control.lista_atracciones.get(i).getTipo_atracciones() };
			Object [] precio = { control.lista_atracciones.get(i).getPrecio() };
			String [] est_min = { };
			String [] est_max = { };
			
			Object [][] datos2 = { nombre, tipo, precio, est_min, est_max };
			
			datos = datos2;
		}

		String[] nombre_columnas = { "Nombre", "Tipo", "Precio Predeterminado", "Estatura Mínima", "Estatura Máxima" };
		
		JTable table = new JTable(datos, nombre_columnas);
		
		DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
		Alinear.setHorizontalAlignment(SwingConstants.CENTER);
		
		for (int i = 0; i < nombre_columnas.length; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(Alinear);
		}
		
		JScrollPane scroll = new JScrollPane(table);
		getContentPane().add(scroll);

	}
}
