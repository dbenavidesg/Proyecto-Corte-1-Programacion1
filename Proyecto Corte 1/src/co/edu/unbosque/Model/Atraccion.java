package co.edu.unbosque.Model;

public abstract class Atraccion {

	public String nombre;
	public String tipo_atracciones;
	public double precio;

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
