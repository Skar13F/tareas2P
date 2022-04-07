/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 06 de abril de 2022
 * Fecha de actualización: 06 de abril de 2022
 * Descripción: Creamos una clase extendida de la clase Operaciones, obtenemos
 * 				obtenemos los valores de cada dato, dividimos el primero entre el segundo
 * 				y lo regresamos como resultado.
 */
package ejercicio1;

public class Division extends Operaciones{
	@Override
	public float obtenerResultado() {
		return getX()/getY();
	}

}
