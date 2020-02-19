package co.edu.unbosque.Model;

public class Velocidad extends Atraccion {

	public Pasaporte pasaporte;
	public String estatura_minima;
	public String estatura_maxima;
	
	public Velocidad(String pNombre, String pTipo_atracciones, double pPrecio, String pEstatura_Minima, String pEstatura_Maxima) {

		super(pNombre, pTipo_atracciones, pPrecio);
		estatura_minima = pEstatura_Minima;
		estatura_maxima = pEstatura_Maxima;

	}

	@Override
	public double calcularPrecio() {

		double precio = 12000;

		if (pasaporte.getEstatura() >= 130) {

			if (pasaporte.getCategoria() == "oro") {
				precio += precio * 0.05;

			} else if (pasaporte.getCategoria() == "plata") {
				precio += precio * 0.1;

			} else if (pasaporte.getCategoria() == "bronze") {
				precio += precio * 0.2;

			}
		}
		return precio;
	}

}
