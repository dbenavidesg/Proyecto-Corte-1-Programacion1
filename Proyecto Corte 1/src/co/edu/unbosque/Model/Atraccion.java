package co.edu.unbosque.Model;

public abstract class Atraccion {

	public String nombre;
	public String tipo_atracciones;
	public double precio;

	/**
	 * El método constructor de la clase Atraccion corresponde a igualar los
	 * atributos de esta clase a los parametros que seran heredados.
	 * 
	 * @param pNombre           Corresponde al nombre de la atraccion.
	 * @param pTipo_atracciones Corresponde al tipo de la atraccion, ya sea
	 *                          velocidad, terror, acuatico o infantil.
	 * @param pPrecio           Corresponde al precio de cada atracción
	 */

	public Atraccion(String pNombre, String pTipo_atracciones, double pPrecio) {

		nombre = pNombre;
		tipo_atracciones = pTipo_atracciones;
		precio = pPrecio;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo_atracciones() {
		return tipo_atracciones;
	}

	public void setTipo_atracciones(String tipo_atracciones) {
		this.tipo_atracciones = tipo_atracciones;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public abstract double calcularPrecio();

}
