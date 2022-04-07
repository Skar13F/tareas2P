/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 06 de abril de 2022
 * Fecha de actualización: 06 de abril de 2022
 * Descripción: Aquí creamos objetos de cada tipo de clase (operación)
 * 				solo mandamos a llamar a los métodos para imprimir
 * 				el resultado de las operaciones.
 */
package ejercicio1;

public class Principal {
	static Operaciones op;
	static Suma suma;
	static Resta resta;
	static Multiplicacion mult;
	static Division div;

	public static void main(String[] args) {
		op = new Operaciones();
		suma = new Suma();
		resta = new Resta();
		mult = new Multiplicacion();
		div = new Division();

		System.out.println("El resultado de la operación 	" + op.getX() + " + " + op.getY() + " 	es: "
				+ suma.obtenerResultado());
		System.out.println("El resultado de la operación 	" + op.getX() + " - " + op.getY() + " 	es: "
				+ resta.obtenerResultado());
		System.out.println("El resultado de la operación 	" + op.getX() + " * " + op.getY() + " 	es: "
				+ mult.obtenerResultado());
		System.out.println(
				"El resultado de la operación 	" + op.getX() + " / " + op.getY() + " 	es: " + div.obtenerResultado());

	}

}
