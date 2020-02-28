package co.edu.unbosque.Model;

public class Infantil extends Atraccion {

	public Pasaporte pasaporte;
	public String estatura_minima;
	public String estatura_maxima;

	/**
	 * Este m�todo generara los datos de la atracci�n infantil con sus restricciones
	 * <b>pre</b> la lista atracciones debe estar inicializada (no es null). <br>
	 * <b>post</b> se crea una atracci�n acu�tica con los datos dados.<br>
	 * 
	 * @param pNombre         es el nombre de la atraccion pNombre != null,
	 *                        pNombre!= � �
	 * @param pTipo_atraccion indica el tipo de atracci�n que es pTipo_atraccion !=
	 *                        null, pTipo_atraccion != � �
	 * @param pPrecio         es el precio que tendr�n este tipo de atraccion
	 *                        pPrecio != null, pPrecio != � �
	 * @param pEdad_Maxima    es la edead m�xima permitidad para el ingreso a estas
	 *                        atracciones pEdad_Maxima !=, pEdad_Maxima != � �
	 * 
	 */

	public Infantil(String pNombre, String pTipo_atracciones, double pPrecio, String pEstatura_Minima,
			String pEstatura_Maxima) {

		super(pNombre, pTipo_atracciones, pPrecio);
		estatura_maxima = pEstatura_Maxima;
		estatura_minima = pEstatura_Minima;

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

		double precio = 5000;

		if (pasaporte.getEdad() <= 12) {

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
