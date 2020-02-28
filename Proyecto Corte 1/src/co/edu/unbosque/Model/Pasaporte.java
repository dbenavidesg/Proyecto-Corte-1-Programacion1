package co.edu.unbosque.Model;

public class Pasaporte {

	public String nombre_dueño;
	public String cedula;
	public int edad;
	public int estatura;
	public String estado_pasaporte;
	public String categoria;
	public int numero_atracciones;

	/**
	 * Este método crea el pasaporte <b>pre</b> la lista pasaporte debe estar
	 * inicializada (no es null). <br>
	 * <b>post</b> se crea el pasaporte con sus respectivas características.<br>
	 * 
	 * @param pNombre             es el nombre de la persona que hace el pasaporte
	 *                            pNombre _dueño¡= null, pNombre_dueño ¡= “ “
	 * @param pCedula             es la de la persona que hace el pasaporte pCedula
	 *                            != null, pCedula != “ “
	 * @param pEdad               es la edad de la persona que hace el pasaporte
	 *                            pEdad != null, pEdad != “ “
	 * @param pEstatura           es la estatura de la persona que hace el pasaporte
	 *                            pEstatura != null, pEstatura != “ “
	 * @param pEstado_pasaporte   es el estado que tendre el pasaporte (vendido o en
	 *                            elaboración) pEstado_pasaporte != null,
	 *                            pEStado_pasaporte != “ “
	 * @param pCategoria          es la categoría que tendrá el pasaporte(oro,plata
	 *                            o bronze) pCategoria != null, pCategoria != “ “
	 * @param pNumero_atracciones son la cantidad de atracciones que tendrá el
	 *                            pasaporte pNumero_atracciones != null,
	 *                            pNumero_atracciones != “ “
	 */

	public Pasaporte(String pNombre_dueño, String pCedula, int pEdad, int pEstatura, String pEstado_Pasaporte,
			String pCategoria, int pNumero_atracciones) {

		nombre_dueño = pNombre_dueño;
		cedula = pCedula;
		edad = pEdad;
		estatura = pEstatura;
		estado_pasaporte = pEstado_Pasaporte;
		categoria = pCategoria;
		numero_atracciones = pNumero_atracciones;
	}

	public String getNombre_dueño() {
		return nombre_dueño;
	}

	public void setNombre_dueño(String nombre_dueño) {
		this.nombre_dueño = nombre_dueño;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public String getEstado_pasaporte() {
		return estado_pasaporte;
	}

	public void setEstado_pasaporte(String estado_pasaporte) {
		this.estado_pasaporte = estado_pasaporte;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumero_atracciones() {
		return numero_atracciones;
	}

	public void setNumero_atracciones(int numero_atracciones) {
		this.numero_atracciones = numero_atracciones;
	}

}
