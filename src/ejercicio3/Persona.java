/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 06 de abril de 2022
 * Fecha de actualización: 06 de abril de 2022
 * Descripción: Creamos variables que guarden los datos de una persona
 * 				como nombre, dirección y numero de telefono 
 */
package ejercicio3;

public class Persona {
	private String nombre = "Oscar Fuentes";
	private String direccion="Miahuatlán Oaxaca";
	private long telefono=1511930751;

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}