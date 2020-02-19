package co.edu.unbosque.Model;

public class Infantil extends Atraccion {

	public Pasaporte pasaporte;

	public Infantil(String pNombre, String pTipo_atracciones, double pPrecio) {

		super(pNombre, pTipo_atracciones, pPrecio);

	}

	@Override
	public double calcularPrecio() {

		double precio = 5000;

		if (pasaporte.getEdad() <= 12) {

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
