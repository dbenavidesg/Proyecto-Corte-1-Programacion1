package co.edu.unbosque.View;

import java.awt.Color;
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

public class VentanaAtracciones extends JFrame {

	public Control control;
	public JTable table;
	public JButton boton_regresar;
	public JButton boton_eliminar;
	public JButton boton_agregar;

	public VentanaAtracciones(Control c) {
		
		control = c;
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 520);
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

		for (int i = 0; i < control.lista_atracciones.size(); i++) {

			String est_min = "";
			String est_max = "";
			String nombre = control.lista_atracciones.get(i).getNombre();
			String tipo = control.lista_atracciones.get(i).getTipo_atracciones();
			int precio = (int) control.lista_atracciones.get(i).getPrecio();
			
			if(control.lista_atracciones.get(i).tipo_atracciones.equals("Velocidad")) {
				est_min = control.velocidad.estatura_minima;
				est_max = control.velocidad.estatura_maxima;
				
			} else if(control.lista_atracciones.get(i).tipo_atracciones.equals("Acuatico")) {
				est_min = control.acuatico.estatura_minima;
				est_max = control.acuatico.estatura_maxima;
				
			} else if(control.lista_atracciones.get(i).tipo_atracciones.equals("Terror")) {
				est_min = control.terror.estatura_minima;
				est_max = control.terror.estatura_maxima;
				
			} else if(control.lista_atracciones.get(i).tipo_atracciones.equals("Infantil")) {
				est_min = control.infantil.estatura_minima;
				est_max = control.infantil.estatura_maxima;
				
			}
			
			Object[] datos = { nombre, tipo, precio, est_min, est_max };
			model.addRow(datos);
		}

		DefaultTableCellRenderer Alinear = new DefaultTableCellRenderer();
		Alinear.setHorizontalAlignment(SwingConstants.CENTER);
		
		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(200);
		columnModel.getColumn(2).setPreferredWidth(150);
		columnModel.getColumn(3).setPreferredWidth(200);
		columnModel.getColumn(4).setPreferredWidth(200);

		for (int i = 0; i < nombre_columnas.length; i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(Alinear);
		}

		JScrollPane scroll = new JScrollPane(table);
		scroll.setBackground(Color.white);
		getContentPane().add(scroll);
		
		table.setBounds(20, 20, 680, 650);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getColumnModel().getColumn(0).setWidth(100);
		table.setVisible(true);
		
		boton_eliminar = new JButton("Eliminar una Atraccion");
		boton_eliminar.setBounds(0, 510, 100, 100);
		boton_eliminar.setBackground(Color.white);
		boton_eliminar.setForeground(Color.black);
		add(boton_eliminar);
		
		boton_agregar = new JButton("Agregar una Atraccion");
		boton_agregar.setBounds(0, 510, 100, 100);
		boton_agregar.setBackground(Color.white);
		boton_agregar.setForeground(Color.black);
		add(boton_agregar);
		
		boton_regresar = new JButton("Anterior");
		boton_regresar.setBounds(0, 510, 150, 100);
		boton_regresar.setBackground(Color.white);
		boton_regresar.setForeground(Color.black);
		add(boton_regresar);

	}
}
