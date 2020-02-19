package co.edu.unbosque.Controller;

import java.util.ArrayList;

import co.edu.unbosque.Model.Acuatico;
import co.edu.unbosque.Model.Atraccion;
import co.edu.unbosque.Model.Infantil;
import co.edu.unbosque.Model.Pasaporte;
import co.edu.unbosque.Model.Terror;
import co.edu.unbosque.Model.Velocidad;

public class Control {

	public Pasaporte modelo_pasaporte;
	public Velocidad velocidad;
	public ArrayList<Atraccion> lista_atracciones;

	public Control() {

		lista_atracciones = new ArrayList<Atraccion>();

		lista_atracciones.add(new Velocidad("Terminator", "Velocidad", velocidad.calcularPrecio(),
				"La estatura m�nima es 130 cm", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Velocidad("El Tornado", "Velocidad", velocidad.calcularPrecio(),
				"La estatura m�nima es 130 cm", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Velocidad("El Salto del �ngel", "Velocidad", velocidad.calcularPrecio(),
				"La estatura m�nima es 130 cm", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Velocidad("El Crater", "Velocidad", velocidad.calcularPrecio(),
				"La estatura m�nima es 130 cm", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Velocidad("Fire Hole", "Velocidad", velocidad.calcularPrecio(),
				"La estatura m�nima es 130 cm", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Velocidad("Brain Crush", "Velocidad", velocidad.calcularPrecio(),
				"La estatura m�nima es 130 cm", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Velocidad("El Revoltoso", "Velocidad", velocidad.calcularPrecio(),
				"La estatura m�nima es 130 cm", "No se requiere estatura m�xima"));

		lista_atracciones.add(new Infantil("Mundo Maravilloso", "Infantil", velocidad.calcularPrecio(),
				"No se requiere estatura m�nima", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Infantil("La Casa de Dulces", "Infantil", velocidad.calcularPrecio(),
				"No se requiere estatura m�nima", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Infantil("La Casa de los Espejos", "Infantil", velocidad.calcularPrecio(),
				"No se requiere estatura m�nima", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Infantil("Conociendo la Naturaleza", "Infantil", velocidad.calcularPrecio(),
				"No se requiere estatura m�nima", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Infantil("Tazitas", "Infantil", velocidad.calcularPrecio(),
				"No se requiere estatura m�nima", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Infantil("El Gusanito", "Infantil", velocidad.calcularPrecio(),
				"No se requiere estatura m�nima", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Infantil("Mini-Me", "Infantil", velocidad.calcularPrecio(),
				"No se requiere estatura m�nima", "No se requiere estatura m�xima"));

		lista_atracciones.add(new Terror("El T�o Frank", "Terror", velocidad.calcularPrecio(),
				"La estatura m�nima es 140 cm", "No se requiere estatura m�xima"));
		lista_atracciones.add(new Terror("La Entrada al Averno", "Terror", velocidad.calcularPrecio(),
				"La estatura m�nima es 140 cm", "No se requiere estatura m�xima"));

		lista_atracciones.add(new Acuatico("El Chorro", "Acuatico", velocidad.calcularPrecio(),
				"La estatura m�nima es 130 cm", "La estatura m�xima es 190 cm"));
		lista_atracciones.add(new Acuatico("H20", "Acuatico", velocidad.calcularPrecio(),
				"La estatura m�nima es 130 cm", "La estatura m�xima es 190 cm"));
		lista_atracciones.add(new Acuatico("Angel's Fall", "Acuatico", velocidad.calcularPrecio(),
				"La estatura m�nima es 130 cm", "La estatura m�xima es 190 cm"));
		lista_atracciones.add(new Acuatico("La Anaconda", "Acuatico", velocidad.calcularPrecio(),
				"La estatura m�nima es 130 cm", "La estatura m�xima es 190 cm"));

	}
}
