/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 06 de abril de 2022
 * Fecha de actualización: 06 de abril de 2022
 * Descripción: Creamos un objeto de tipo nombre, obtenemos el nombre con el método get
 * 				y lo imprimimos en pantalla.
 */
package ejercicio2;

public class Principal {
	static Nombre nom;

	public static void main(String[] args) {
		nom = new Nombre();
		System.out.println("Hola mi nombre es: " + nom.getNombre());

	}

}
