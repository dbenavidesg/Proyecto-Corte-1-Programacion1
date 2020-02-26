package co.edu.unbosque.Model;

import co.edu.unbosque.Controller.Control;

public class Velocidad extends Atraccion {

	public String estatura_minima;
	public String estatura_maxima;
	public Control control;
	
	public Velocidad(String pNombre, String pTipo_atracciones, double pPrecio, String pEstatura_Minima, String pEstatura_Maxima) {

		super(pNombre, pTipo_atracciones, pPrecio);
		estatura_minima = pEstatura_Minima;
		estatura_maxima = pEstatura_Maxima;

	}

	@Override
	public double calcularPrecio() {

		double precio = 12000;
		
		for (int i = 0; i < control.lista_pasaportes.size(); i++) {
			
			if (control.lista_pasaportes.get(i).getEstatura() >= 130) {

				if (control.lista_pasaportes.get(i).getCategoria() == "Oro") {
					precio += precio * 0.05;

				} else if (control.lista_pasaportes.get(i).getCategoria() == "Plata") {
					precio += precio * 0.1;

				} else if (control.lista_pasaportes.get(i).getCategoria() == "Bronze") {
					precio += precio * 0.2;

				}
			}
		}

		return precio;
	}

}
