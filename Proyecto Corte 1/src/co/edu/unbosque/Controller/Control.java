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

		lista_atracciones.add(new Velocidad("Terminator", "Velocidad", velocidad.calcularPrecio()));
		lista_atracciones.add(new Velocidad("El Tornado", "Velocidad", velocidad.calcularPrecio()));
		lista_atracciones.add(new Velocidad("El Salto del Ángel", "Velocidad", velocidad.calcularPrecio()));
		lista_atracciones.add(new Velocidad("El Crater", "Velocidad", velocidad.calcularPrecio()));
		lista_atracciones.add(new Velocidad("Fire Hole", "Velocidad", velocidad.calcularPrecio()));
		lista_atracciones.add(new Velocidad("Brain Crush", "Velocidad", velocidad.calcularPrecio()));
		lista_atracciones.add(new Velocidad("El Revoltoso", "Velocidad", velocidad.calcularPrecio()));

		lista_atracciones.add(new Infantil("Mundo Maravilloso", "Infantil", velocidad.calcularPrecio()));
		lista_atracciones.add(new Infantil("La Casa de Dulces", "Infantil", velocidad.calcularPrecio()));
		lista_atracciones.add(new Infantil("La Casa de los Espejos", "Infantil", velocidad.calcularPrecio()));
		lista_atracciones.add(new Infantil("Conociendo la Naturaleza", "Infantil", velocidad.calcularPrecio()));
		lista_atracciones.add(new Infantil("Tazitas", "Infantil", velocidad.calcularPrecio()));
		lista_atracciones.add(new Infantil("El Gusanito", "Infantil", velocidad.calcularPrecio()));
		lista_atracciones.add(new Infantil("Mini-Me", "Infantil", velocidad.calcularPrecio()));

		lista_atracciones.add(new Terror("El Tío Frank", "Terror", velocidad.calcularPrecio()));
		lista_atracciones.add(new Terror("La Entrada al Averno", "Terror", velocidad.calcularPrecio()));

		lista_atracciones.add(new Acuatico("El Chorro", "Acuatico", velocidad.calcularPrecio()));
		lista_atracciones.add(new Acuatico("H20", "Acuatico", velocidad.calcularPrecio()));
		lista_atracciones.add(new Acuatico("Angel's Fall", "Acuatico", velocidad.calcularPrecio()));
		lista_atracciones.add(new Acuatico("La Anaconda", "Acuatico", velocidad.calcularPrecio()));

	}
}
