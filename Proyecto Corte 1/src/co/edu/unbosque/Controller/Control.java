package co.edu.unbosque.Controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import co.edu.unbosque.Model.Acuatico;
import co.edu.unbosque.Model.Atraccion;
import co.edu.unbosque.Model.Infantil;
import co.edu.unbosque.Model.Pasaporte;
import co.edu.unbosque.Model.Terror;
import co.edu.unbosque.Model.Velocidad;
import co.edu.unbosque.View.VentanaCrearP;
import co.edu.unbosque.View.VentanaPasaportes;
import co.edu.unbosque.View.VentanaPrincipal;

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

	public Control() {

		vnt_principal = new VentanaPrincipal();
		
		//Inicializacion arraylist de atracciones
		lista_atracciones = new ArrayList<Atraccion>();
		
		velocidad = new Velocidad("Terminator", "Velocidad", 12000, "La estatura mínima es 130 cm",
				"No se requiere estatura máxima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("El Tornado", "Velocidad", 12000, "La estatura mínima es 130 cm",
				"No se requiere estatura máxima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("El Salto del Ángel", "Velocidad", 12000, "La estatura mínima es 130 cm",
				"No se requiere estatura máxima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("Iron Maiden", "Velocidad", 12000, "La estatura mínima es 130 cm",
				"No se requiere estatura máxima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("Fire Hole", "Velocidad", 12000, "La estatura mínima es 130 cm",
				"No se requiere estatura máxima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("Brain Crush", "Velocidad", 12000, "La estatura mínima es 130 cm",
				"No se requiere estatura máxima");
		lista_atracciones.add(velocidad);
		velocidad = new Velocidad("El Revoltoso", "Velocidad", 12000,
				"La estatura mínima es 130 cm", "No se requiere estatura máxima");
		lista_atracciones.add(velocidad);

		infantil = new Infantil("La Casa de Dulces", "Infantil", 5000, "No se requiere estatura mínima",
				"No se requiere estatura máxima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("Mundo Maravilloso", "Infantil", 5000, "No se requiere estatura mínima",
				"No se requiere estatura máxima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("La Casa de los Espejos", "Infantil", 5000, "No se requiere estatura mínima",
				"No se requiere estatura máxima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("Conociendo la Naturaleza", "Infantil", 5000, "No se requiere estatura mínima",
				"No se requiere estatura máxima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("Tazitas", "Infantil", 5000, "No se requiere estatura mínima",
				"No se requiere estatura máxima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("El Gusanito", "Infantil", 5000, "No se requiere estatura mínima",
				"No se requiere estatura máxima");
		lista_atracciones.add(infantil);
		infantil = new Infantil("Mini-Me", "Infantil", 5000, "No se requiere estatura mínima",
				"No se requiere estatura máxima");
		lista_atracciones.add(infantil);

		terror = new Terror("El Tío Frank", "Terror", 12000, "La estatura mínima es 140 cm",
				"No se requiere estatura máxima");
		lista_atracciones.add(terror);
		terror = new Terror("La Entrada al Averno", "Terror", 12000, "La estatura mínima es 140 cm",
				"No se requiere estatura máxima");
		lista_atracciones.add(terror);

		acuatico = new Acuatico("El Chorro", "Acuatico", 8000, "La estatura mínima es 130 cm",
				"La estatura máxima es 190 cm");
		lista_atracciones.add(acuatico);
		acuatico = new Acuatico("H20", "Acuatico", 8000, "La estatura mínima es 130 cm",
				"La estatura máxima es 190 cm");
		lista_atracciones.add(acuatico);
		acuatico = new Acuatico("Angel's Fall", "Acuatico", 8000, "La estatura mínima es 130 cm",
				"La estatura máxima es 190 cm");
		lista_atracciones.add(acuatico);
		acuatico = new Acuatico("La Anaconda", "Acuatico", 8000, "La estatura mínima es 130 cm",
				"La estatura máxima es 190 cm");
		lista_atracciones.add(acuatico);
		
		//vnt_pasaporte = new VentanaPasaportes(this);

		//Inicializacion arraylist de pasaportes
		lista_pasaportes = new ArrayList<Pasaporte>();

		lista_pasaportes.add(0, new Pasaporte("John 'Johanna' Romo", "216651616", 5, 110, "Vendido", "Bronze", 5));
		lista_pasaportes.add(1, new Pasaporte("Julian", "21563333", 24, 190, "en elaboracion", "Oro", 15));

		//Imagen fondo
		img = new ImageIcon("./Imagenes/powerslave.jpg");
		icono = new ImageIcon(img.getImage().getScaledInstance(1100, 750, Image.SCALE_DEFAULT));
		vnt_principal.pnl_principal.fondo.setIcon(icono);

		vnt_principal.pnl_principal.boton_verTodos.addActionListener(this);
		vnt_principal.pnl_principal.boton_crear.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Ver todos los pasaportes")) {
			vnt_principal.setVisible(false);
			vnt_pasaporte = new VentanaPasaportes(this);
			vnt_pasaporte.boton_regresar.addActionListener(this);
			vnt_pasaporte.boton_eliminar.addActionListener(this);

		}

		if (e.getActionCommand().equals("Crear pasaporte")) {
			vnt_crear_p = new VentanaCrearP();
			vnt_principal.setVisible(false);
			vnt_principal.pnl_principal.setVisible(false);
			vnt_crear_p.p1.validar2.addActionListener(this);

			// Estado pasaporte con un booleano y un if --> Si se crea con exito el
			// pasaporte el estado pasa a completo.
//			lista_pasaportes.add(new Pasaporte(vnt_crear_p.nombre.getText(), vnt_crear_p.cedula.getText(),
//					vnt_crear_p.edad.getText(), vnt_crear_p.estatura.getText(), pEstado_Pasaporte, vnt_crear_p.p1.categoria.getSelectedItem(),
//					pNumero_atracciones));

		}

		if (e.getActionCommand().equals("Validar")) {
			vnt_crear_p.panel_checkbox.setVisible(true);
		}
		
		if (e.getActionCommand().equals("Regresar")) {
			vnt_principal.setVisible(true);
			vnt_pasaporte.setVisible(false);
		}

	}

}
