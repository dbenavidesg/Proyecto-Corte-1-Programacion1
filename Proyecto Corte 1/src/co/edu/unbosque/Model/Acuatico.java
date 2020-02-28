package co.edu.unbosque.Model;

public class Acuatico extends Atraccion {

	public Pasaporte pasaporte;
	public String estatura_minima;
	public String estatura_maxima;

	/**
	 * Este método generara los datos de la atracción acuático con sus restricciones
	 * <b>pre</b> la lista atracciones debe estar inicializada (no es null). <br>
	 * <b>post</b> se crea una atracción acuática con los datos dados.<br>
	 * 
	 * @param pNombre          es el nombre de la atraccion pNombre != null,
	 *                         pNombre!= “ “
	 * @param pTipo_atraccion  indica el tipo de atracción que es pTipo_atraccion !=
	 *                         null, pTipo_atraccion != “ “
	 * @param pPrecio          es el precio que tendrán este tipo de atraccion
	 *                         pPrecio != null, pPrecio != “ “
	 * @param pEstatura_Minima es la estatura minima que tendran este tipo de
	 *                         atracciones pEstatura_Minima !=, pEstatura_Minimia !=
	 *                         “ “
	 * @param pEstatura_Maxima es la estatura maxima que tendran este tipo de
	 *                         atracciones pEstatura_Maxima !=, pEstatura_Maxima !=
	 *                         “ “
	 */

	public Acuatico(String pNombre, String pTipo_atracciones, double pPrecio, String pEstatura_Minima,
			String pEstatura_Maxima) {

		super(pNombre, pTipo_atracciones, pPrecio);
		estatura_maxima = pEstatura_Maxima;
		estatura_minima = pEstatura_Minima;

	}

	/**
	 * Este método calculara el precio que tendrá este tipo de atracción con los
	 * respectivo beneficios de cata categoría. <b>post</b> da el precio de las
	 * atracciones según la categoria del pasaporte.<br>
	 * 
	 * @param precio es el precio que tendrá la atracción según la categoria !=
	 *               null, precio!= “ “
	 * @return
	 */

	@Override
	public double calcularPrecio() {

		double precio = 8000;

		if (pasaporte.getEstatura() >= 130 && pasaporte.getEstatura() <= 190) {

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
