package co.edu.unbosque.Controller;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import co.edu.unbosque.Model.Atraccion;
import co.edu.unbosque.Model.Pasaporte;
import co.edu.unbosque.Model.Velocidad;
import co.edu.unbosque.View.VentanaCrearP;
import co.edu.unbosque.View.VentanaPasaportes;
import co.edu.unbosque.View.VentanaPrincipal;

public class Control implements ActionListener {

	public Pasaporte modelo_pasaporte;
	public Velocidad velocidad;
	public ArrayList<Atraccion> lista_atracciones;
	public ArrayList<Pasaporte> lista_pasaportes;

	public VentanaPrincipal vnt_principal;
	public ImageIcon img;
	public Icon icono;

	public VentanaPasaportes vnt_pasaporte;
	public VentanaCrearP vnt_crear_p;

	public Control() {

		vnt_principal = new VentanaPrincipal();

		img = new ImageIcon("/co.edu.unbosque.Image/powerslave.jpg");
		icono = new ImageIcon(img.getImage().getScaledInstance(1000, 1000, Image.SCALE_DEFAULT));
		vnt_principal.imagen_fondo.fondo.setIcon(icono);

		vnt_principal.boton_verTodos.addActionListener(this);
		vnt_principal.boton_crear.addActionListener(this);

//		lista_atracciones = new ArrayList<Atraccion>();

//		lista_atracciones.add(new Velocidad("Terminator", "Velocidad", velocidad.calcularPrecio(),
//				"La estatura mínima es 130 cm", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Velocidad("El Tornado", "Velocidad", velocidad.calcularPrecio(),
//				"La estatura mínima es 130 cm", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Velocidad("El Salto del Ángel", "Velocidad", velocidad.calcularPrecio(),
//				"La estatura mínima es 130 cm", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Velocidad("Iron Maiden", "Velocidad", velocidad.calcularPrecio(),
//				"La estatura mínima es 130 cm", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Velocidad("Fire Hole", "Velocidad", velocidad.calcularPrecio(),
//				"La estatura mínima es 130 cm", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Velocidad("Brain Crush", "Velocidad", velocidad.calcularPrecio(),
//				"La estatura mínima es 130 cm", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Velocidad("El Revoltoso", "Velocidad", velocidad.calcularPrecio(),
//				"La estatura mínima es 130 cm", "No se requiere estatura máxima"));
//
//		lista_atracciones.add(new Infantil("Mundo Maravilloso", "Infantil", velocidad.calcularPrecio(),
//				"No se requiere estatura mínima", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Infantil("La Casa de Dulces", "Infantil", velocidad.calcularPrecio(),
//				"No se requiere estatura mínima", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Infantil("La Casa de los Espejos", "Infantil", velocidad.calcularPrecio(),
//				"No se requiere estatura mínima", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Infantil("Conociendo la Naturaleza", "Infantil", velocidad.calcularPrecio(),
//				"No se requiere estatura mínima", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Infantil("Tazitas", "Infantil", velocidad.calcularPrecio(),
//				"No se requiere estatura mínima", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Infantil("El Gusanito", "Infantil", velocidad.calcularPrecio(),
//				"No se requiere estatura mínima", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Infantil("Mini-Me", "Infantil", velocidad.calcularPrecio(),
//				"No se requiere estatura mínima", "No se requiere estatura máxima"));
//
//		lista_atracciones.add(new Terror("El Tío Frank", "Terror", velocidad.calcularPrecio(),
//				"La estatura mínima es 140 cm", "No se requiere estatura máxima"));
//		lista_atracciones.add(new Terror("La Entrada al Averno", "Terror", velocidad.calcularPrecio(),
//				"La estatura mínima es 140 cm", "No se requiere estatura máxima"));
//
//		lista_atracciones.add(new Acuatico("El Chorro", "Acuatico", velocidad.calcularPrecio(),
//				"La estatura mínima es 130 cm", "La estatura máxima es 190 cm"));
//		lista_atracciones.add(new Acuatico("H20", "Acuatico", velocidad.calcularPrecio(),
//				"La estatura mínima es 130 cm", "La estatura máxima es 190 cm"));
//		lista_atracciones.add(new Acuatico("Angel's Fall", "Acuatico", velocidad.calcularPrecio(),
//				"La estatura mínima es 130 cm", "La estatura máxima es 190 cm"));
//		lista_atracciones.add(new Acuatico("La Anaconda", "Acuatico", velocidad.calcularPrecio(),
//				"La estatura mínima es 130 cm", "La estatura máxima es 190 cm"));

		lista_pasaportes = new ArrayList<Pasaporte>();

		lista_pasaportes.add(0, new Pasaporte("John 'Johanna' Romo", "216651616", 5, 110, "Vendido", "Bronze", 5));
//		for (int i = 0; i < lista_pasaportes.size(); i++) {
//			System.out.println(lista_pasaportes.get(i).getNombre_dueño());
//		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Ver todos los pasaportes")) {
			vnt_principal.setVisible(false);
			vnt_pasaporte = new VentanaPasaportes();

		}

		if (e.getActionCommand().equals("Crear pasaporte")) {
			vnt_crear_p = new VentanaCrearP();
			vnt_principal.setVisible(false);
			vnt_crear_p.p1.validar2.addActionListener(this);
			
			//Estado pasaporte con un booleano y un if --> Si se crea con exito el pasaporte el estado pasa a completo.
//			lista_pasaportes.add(new Pasaporte(vnt_crear_p.nombre.getText(), vnt_crear_p.cedula.getText(),
//					vnt_crear_p.edad.getText(), vnt_crear_p.estatura.getText(), pEstado_Pasaporte, vnt_crear_p.p1.categoria.getSelectedItem(),
//					pNumero_atracciones));

		}

	}

}
