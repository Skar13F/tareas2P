/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Definimos 2 variables de tipo double
 * 				creamos un metodo convert, realizamos la multiplicacion y luego imprimimos
 *				el valor.
 */
package ejercicio5;

public class PesoaDolar {
	private double dollar = 0.0504795558;
	private double pesos = 1000.0;

	public double getDollar() {
		return dollar;
	}

	public void setDollar(double dollar) {
		this.dollar = dollar;
	}

	public double getPesos() {
		return pesos;
	}

	public void setPesos(double pesos) {
		this.pesos = pesos;
	}

	public void Convert() {
		double convert = dollar * pesos;
		System.out.println("La cantidad en pesos es de: " + convert);
	}

}