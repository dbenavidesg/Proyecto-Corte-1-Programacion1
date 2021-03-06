package co.edu.unbosque.Controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import co.edu.unbosque.Model.Acuatico;
import co.edu.unbosque.Model.Atraccion;
import co.edu.unbosque.Model.Infantil;
import co.edu.unbosque.Model.Pasaporte;
import co.edu.unbosque.Model.Terror;
import co.edu.unbosque.Model.Velocidad;
import co.edu.unbosque.View.VentanaAtracciones;
import co.edu.unbosque.View.VentanaCrearP;
import co.edu.unbosque.View.VentanaElaboracion;
import co.edu.unbosque.View.VentanaPasaportes;
import co.edu.unbosque.View.VentanaPrincipal;
import co.edu.unbosque.View.VentanaRecaudo;
import co.edu.unbosque.View.VentanaVendido;

public class Control implements ActionListener {

	public Pasaporte modelo_pasaporte;
	public Velocidad velocidad;
	public Infantil infantil;
	public Terror terror;
	public Acuatico acuatico;
	public ArrayList<Atraccion> lista_atracciones;
	public ArrayList<Pasaporte> lista_pasaportes;

	public VentanaPrincipal vnt_principal;
	public ImageIcon img;
	public Icon icono;

	public VentanaPasaportes vnt_pasaporte;
	public VentanaCrearP vnt_crear_p;
	public VentanaAtracciones vnt_atracciones;
	public VentanaVendido vnt_vendido;
	public VentanaElaboracion vnt_elabracion;
	public VentanaRecaudo vnt_recaudo;

	public int contador;

	/**
	 * Este es el constructor de la clase Control el cual se le asigna la
	 * inicializaci�n de los atributos y objectos. De esta manera el objecto es
	 * creado con un valorinicial. Este m�todo se llama automaticamente cuando se
	 * crea el objeto.<b>post</b> Se debe generar la ventana propuesta, creaci�n de
	 * los arraylist y los action listeners<br>
	 */

	public Control() {

		vnt_principal = new VentanaPrincipal();

		vnt_principal.pnl_principal.boton_verTodos.addActionListener(this);
		vnt_principal.pnl_principal.boton_crear.addActionListener(this);
		vnt_principal.pnl_principal.ver_atrac.addActionListener(this);
		vnt_principal.pnl_principal.boton_vendidos.addActionListener(this);
		vnt_principal.pnl_principal.boton_Elaboracion.addActionListener(this);
		vnt_principal.pnl_principal.boton_recaudo.addActionListener(this);

		// Inicializacion arraylist de atracciones
		lista_atracciones = new ArrayList<Atraccion>();

		velocidad = new Velocidad("Terminator", "Velocidad", 12000, "La estatura m�nima es 130 cm",
				"No se requiere estatura m�xima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("El Tornado", "Velocidad", 12000, "La estatura m�nima es 130 cm",
				"No se requiere estatura m�xima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("El Salto del �ngel", "Velocidad", 12000, "La estatura m�nima es 130 cm",
				"No se requiere estatura m�xima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("Iron Maiden", "Velocidad", 12000, "La estatura m�nima es 130 cm",
				"No se requiere estatura m�xima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("Fire Hole", "Velocidad", 12000, "La estatura m�nima es 130 cm",
				"No se requiere estatura m�xima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("Brain Crush", "Velocidad", 12000, "La estatura m�nima es 130 cm",
				"No se requiere estatura m�xima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("El Revoltoso", "Velocidad", 12000, "La estatura m�nima es 130 cm",
				"No se requiere estatura m�xima");
		lista_atracciones.add(velocidad);

		infantil = new Infantil("La Casa de Dulces", "Infantil", 5000, "No se requiere estatura m�nima",
				"No se requiere estatura m�xima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("Mundo Maravilloso", "Infantil", 5000, "No se requiere estatura m�nima",
				"No se requiere estatura m�xima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("La Casa de los Espejos", "Infantil", 5000, "No se requiere estatura m�nima",
				"No se requiere estatura m�xima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("Conociendo la Naturaleza", "Infantil", 5000, "No se requiere estatura m�nima",
				"No se requiere estatura m�xima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("Tazitas", "Infantil", 5000, "No se requiere estatura m�nima",
				"No se requiere estatura m�xima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("El Gusanito", "Infantil", 5000, "No se requiere estatura m�nima",
				"No se requiere estatura m�xima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("Mini-Me", "Infantil", 5000, "No se requiere estatura m�nima",
				"No se requiere estatura m�xima");
		lista_atracciones.add(infantil);

		terror = new Terror("El T�o Frank", "Terror", 12000, "La estatura m�nima es 140 cm",
				"No se requiere estatura m�xima");
		lista_atracciones.add(terror);
		terror = new Terror("La Entrada al Averno", "Terror", 12000, "La estatura m�nima es 140 cm",
				"No se requiere estatura m�xima");
		lista_atracciones.add(terror);

		acuatico = new Acuatico("El Chorro", "Acuatico", 8000, "La estatura m�nima es 130 cm",
				"La estatura m�xima es 190 cm");
		lista_atracciones.add(acuatico);
		acuatico = new Acuatico("H20", "Acuatico", 8000, "La estatura m�nima es 130 cm",
				"La estatura m�xima es 190 cm");
		lista_atracciones.add(acuatico);
		acuatico = new Acuatico("Angel's Fall", "Acuatico", 8000, "La estatura m�nima es 130 cm",
				"La estatura m�xima es 190 cm");
		lista_atracciones.add(acuatico);
		acuatico = new Acuatico("La Anaconda", "Acuatico", 8000, "La estatura m�nima es 130 cm",
				"La estatura m�xima es 190 cm");
		lista_atracciones.add(acuatico);

		// Inicializacion arraylist de pasaportes
		lista_pasaportes = new ArrayList<Pasaporte>();

		lista_pasaportes.add(0, new Pasaporte("John 'Johanna' Romo", "216651616", 5, 110, "Vendido", "Bronze", 5));
		lista_pasaportes.add(1, new Pasaporte("Julian", "21563333", 24, 190, "En Elaboracion", "Oro", 15));

		// Imagen fondo
		img = new ImageIcon("./Imagenes/powerslave.jpg");
		icono = new ImageIcon(img.getImage().getScaledInstance(1100, 750, Image.SCALE_DEFAULT));
		vnt_principal.pnl_principal.fondo.setIcon(icono);

	}

	/**
	 * El m�todo es invocado cuando ocurre una acci�n. <b>pre</b> Se
	 * debierondeterminar los objetos que implementan el ActionListener. <br>
	 * <b>post</b> Un objeto que implementa el ActionListener adquiere eldeterminado
	 * ActionEvent cuando ocurra el evento. <br>
	 * 
	 * @param e e - Re presenta un evento generado por un componente, que en su
	 *          mayor�ason botones. El evento pasa por todos los objetos que tienen
	 *          comoregistrado un ActionListener, y as� poder obtener un evento
	 *          ygenerarlo. e != null, e != " ".
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Ver todos los pasaportes")) {
			vnt_principal.setVisible(false);
			vnt_pasaporte = new VentanaPasaportes(this);
			vnt_pasaporte.boton_regresar.addActionListener(this);
			vnt_pasaporte.boton_eliminar.addActionListener(this);

		}

		if (e.getActionCommand().equals("Crear pasaporte")) {
			vnt_principal.setVisible(false);
			vnt_crear_p = new VentanaCrearP();
			vnt_crear_p.p1.validar2.addActionListener(this);

		}

		if (e.getActionCommand().equals("Validar")) {

			if (vnt_crear_p.nombre.getText() == "" || vnt_crear_p.edad.getText() == null
					|| vnt_crear_p.estatura.getText() == null || vnt_crear_p.cedula.getText() == null) {
				JOptionPane.showMessageDialog(null, "Advertencia",
						"Se�or Usuario por favor ingresar toda la informaci�n en los campos de texto",
						JOptionPane.WARNING_MESSAGE);

			} else {
				vnt_crear_p.panel_checkbox.setVisible(true);

				for (int i = 0; i < lista_atracciones.size(); i++) {

					if (vnt_crear_p.panel_checkbox.checkbox_velocidad.isSelected()) {
						contador++;
					}
					System.out.println(contador);
					// vnt_crear_p.panel_checkbox.checkbox_velocidad.getSelectedIcon();
				}
			}
		}

		if (e.getActionCommand().equals("Regresar")) {
			vnt_principal.setVisible(true);
			vnt_pasaporte.setVisible(false);
		}

		if (e.getActionCommand().equals("Ver atracciones")) {
			vnt_principal.setVisible(false);
			vnt_atracciones = new VentanaAtracciones(this);
			vnt_atracciones.boton_regresar.addActionListener(this);

		}

		if (e.getActionCommand().equals("Anterior")) {
			vnt_atracciones.setVisible(false);
			vnt_principal.setVisible(true);
		}

		if (e.getActionCommand().equals("Pasaportes vendidos")) {
			vnt_principal.setVisible(false);
			vnt_vendido = new VentanaVendido(this);
			vnt_vendido.boton_atras.addActionListener(this);
		}

		if (e.getActionCommand().equals("Atras")) {
			vnt_vendido.setVisible(false);
			vnt_principal.setVisible(true);
		}

		if (e.getActionCommand().equals("Pasaportes en elaboracion")) {
			vnt_principal.setVisible(false);
			vnt_elabracion = new VentanaElaboracion(this);
			vnt_elabracion.boton_atras.addActionListener(this);
		}

		if (e.getActionCommand().equals("Volver")) {
			vnt_elabracion.setVisible(false);
			vnt_principal.setVisible(true);
		}

		if (e.getActionCommand().equals("Guardar")) {

			String nombrea = vnt_crear_p.nombre.getText();
			String cedulaa = vnt_crear_p.cedula.getText();
			String edad = vnt_crear_p.edad.getText();
			int a = Integer.parseInt(edad);
			String estatura = vnt_crear_p.estatura.getText();

			int b = Integer.parseInt(estatura);
			if (vnt_crear_p.p1.categoria.getSelectedItem() == "Oro") {

				lista_pasaportes.add(new Pasaporte(nombrea, cedulaa, a, b, "vendido", "Oro", 2));

			}
			if (vnt_crear_p.p1.categoria.getSelectedItem() == "Bronce") {

				lista_pasaportes.add(new Pasaporte(nombrea, cedulaa, a, b, "vendido", "Bronce", 2));

			}
			if (vnt_crear_p.p1.categoria.getSelectedItem() == "Plata") {

				lista_pasaportes.add(new Pasaporte(nombrea, cedulaa, a, b, "vendido", "	Plata", 2));

			}
		}

		if (e.getActionCommand().equals("Recaudo pasportes")) {
			vnt_principal.setVisible(false);
			vnt_recaudo = new VentanaRecaudo();
		}
	}

}
