package co.edu.unbosque.Model;

public class Terror extends Atraccion {

	public Pasaporte pasaporte;
	public String estatura_minima;
	public String estatura_maxima;

	public Terror(String pNombre, String pTipo_atracciones, double pPrecio, String pEstatura_Minima, String pEstatura_Maxima) {

		super(pNombre, pTipo_atracciones, pPrecio);
		estatura_maxima = pEstatura_Maxima;
		estatura_minima = pEstatura_Minima;
	}

	@Override
	public double calcularPrecio() {

		double precio = 12000;

		if (pasaporte.getEstatura() >= 140) {

			if (pasaporte.getCategoria() == "Oro") {
				precio += precio * 0.05;

			} else if (pasaporte.getCategoria() == "Plata") {
				precio += precio * 0.1;

			} else if (pasaporte.getCategoria() == "Bronze") {
				precio += precio * 0.2;

			}
		}
		return precio;
	}

}
