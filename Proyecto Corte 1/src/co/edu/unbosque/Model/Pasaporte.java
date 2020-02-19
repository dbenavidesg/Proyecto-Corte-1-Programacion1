package co.edu.unbosque.Model;

public abstract class Pasaporte {

	public String nombre_dueño;
	public String cedula;
	public int edad;
	public int estatura;
	public String estado_pasaporte;
	public String categoria;
	public int numero_atracciones;

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
