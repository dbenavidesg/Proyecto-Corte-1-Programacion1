package co.edu.unbosque.Model;

public class Acuatico extends Atraccion {

	public Pasaporte pasaporte;
	public String estatura_minima;
	public String estatura_maxima;

	public Acuatico(String pNombre, String pTipo_atracciones, double pPrecio, String pEstatura_Minima, String pEstatura_Maxima) {

		super(pNombre, pTipo_atracciones, pPrecio);
		estatura_maxima = pEstatura_Maxima;
		estatura_minima = pEstatura_Minima;
		
	}

	@Override
	public double calcularPrecio() {

		double precio = 8000;

		if (pasaporte.getEstatura() >= 130 && pasaporte.getEstatura() <= 190) {

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
