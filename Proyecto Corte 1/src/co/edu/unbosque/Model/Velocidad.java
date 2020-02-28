package co.edu.unbosque.Model;

import co.edu.unbosque.Controller.Control;

public class Velocidad extends Atraccion {

	public String estatura_minima;
	public String estatura_maxima;
	public Control control;

	/**
	 * Este m�todo generara los datos de la atracci�n velocidad con sus
	 * restricciones <b>pre</b> la lista atracciones debe estar inicializada (no es
	 * null). <br>
	 * <b>post</b> se crea una atracci�n acu�tica con los datos dados.<br>
	 * 
	 * @param pNombre          es el nombre de la atraccion pNombre != null,
	 *                         pNombre!= � �
	 * @param pTipo_atraccion  indica el tipo de atracci�n que es pTipo_atraccion !=
	 *                         null, pTipo_atraccion != � �
	 * @param pPrecio          es el precio que tendr�n este tipo de atraccion
	 *                         pPrecio != null, pPrecio != � �
	 * @param pEstatura_Minima es la estatura minima que tendran este tipo de
	 *                         atracciones pEstatura_Minima !=, pEstatura_Minimia !=
	 *                         � �
	 * @param pEstatura_Maxima es la estatura maxima que tendran este tipo de
	 *                         atracciones pEstatura_Maxima !=, pEstatura_Maxima !=
	 *                         � �
	 */

	public Velocidad(String pNombre, String pTipo_atracciones, double pPrecio, String pEstatura_Minima,
			String pEstatura_Maxima) {

		super(pNombre, pTipo_atracciones, pPrecio);
		estatura_minima = pEstatura_Minima;
		estatura_maxima = pEstatura_Maxima;

	}

	/**
	 * Este m�todo calculara el precio que tendr� este tipo de atracci�n con los
	 * respectivo beneficios de cata categor�a. <b>post</b> da el precio de las
	 * atracciones seg�n la categoria del pasaporte.<br>
	 * 
	 * @param precio es el precio que tendr� la atracci�n seg�n la categoria !=
	 *               null, precio!= � �
	 * @return
	 */

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
