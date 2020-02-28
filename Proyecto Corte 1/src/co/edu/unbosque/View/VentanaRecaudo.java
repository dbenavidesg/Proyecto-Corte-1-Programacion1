package co.edu.unbosque.View;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaRecaudo extends JFrame {

	public JLabel etiqueta_recuado;
	public VentanaPasaportes vnt_pasaporte;
	public JButton boton_atras;

	/**
	 * El método constructor es aquel método al que se le asigna la inicialización
	 * de las variables y objetos. <b>post</b> Se debe crear cada uno de los objetos
	 * o caracteristicas dadas en el constructor<br>
	 */

	public VentanaRecaudo() {

		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 100);
		setTitle("Recuado");
		setResizable(false);

		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * Este método consiste en el calculo del recaudo. <b> pre </b> Para poder
	 * realizar este calculo se debió de crear con anterioridad la tabla que
	 * contiene la infomación de los pasaportes. <br>
	 * <b> post </b> A partir de este método se obtiene el recaudo de los pasaportes
	 * en relación a las categorias y a sus restricciones. <br>
	 */

	public void recaudoprecio() {

		double fila = 0;
		double total = 0;
		if (vnt_pasaporte.table.getRowCount() > 0) {
			for (int i = 0; i < vnt_pasaporte.table.getRowCount(); i++) {
				total = Double.parseDouble(vnt_pasaporte.table.getValueAt(i, 6).toString());
				fila += total;
			}

			etiqueta_recuado = new JLabel("El total es" + fila);
			etiqueta_recuado.setBounds(120, 40, 60, 20);
			add(etiqueta_recuado);

		}

		boton_atras = new JButton("Retornar");
		boton_atras.setBounds(125, 70, 50, 20);
		add(boton_atras);

	}
}
