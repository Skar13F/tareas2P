/*Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 06 de abril de 2022
 * Fecha de actualización: 06 de abril
 * Descripción: Imprime el total de la factura a pagar
 */
package ejercicio6;

public class Principal {
	static Factura fact;

	public static void main(String[] args) {
		fact = new Factura();
		System.out
				.println("Subtotal:	" + fact.getSubtotal() + "\nIVA:		16.0%" + "\nTotal:		" + fact.Total());

	}

}