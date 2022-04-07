/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 06 de abril de 2022
 * Fecha de actualización: 06 de abril de 2022
 * Descripción: Creamos un objeto de la clase Persona, obtenemos los datos alacenados
 * 				con el método get y los imprimimos en pantalla.
 */
package ejercicio3;

public class Principal {
	static Persona pers;

	public static void main(String[] args) {
		pers = new Persona();
		System.out.println("Datos almacenados");
		System.out.println("Nombre:		" + pers.getNombre());
		System.out.println("Dirección:	" + pers.getDireccion());
		System.out.println("Teléfono:	" + pers.getTelefono());

	}

}