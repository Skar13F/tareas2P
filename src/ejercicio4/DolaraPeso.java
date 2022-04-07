/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 05 de abril de 2022
 * Fecha de actualización: 05 de abril
 * Descripción: Definimos dos variables y las inicializamos,
 * 				creamos un método que convierte la cantidad de dolares
 * 				a pesos y lo imprime.
 */
package ejercicio4;

public class DolaraPeso {
	private float dollar=25;
	private float pesos = 19.81f;

	public float getDollar() {
		return dollar;
	}

	public void setDollar(float dollar) {
		this.dollar = dollar;
	}

	public float getPesos() {
		return pesos;
	}

	public void setPesos(float pesos) {
		this.pesos = pesos;
	}

	public void Convert() {
		float convert = dollar * pesos;
		System.out.println("La cantidad en pesos es de: " + convert);
	}

}