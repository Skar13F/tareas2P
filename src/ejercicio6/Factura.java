/* Autor: Oscar Fuentes Alvarado
 * Fecha de creación: 06 de abril de 2022
 * Fecha de actualización: 06 de abril de 2022
 * Descripción: Calcula el el iva en una factura y lo suma para obtener el total a pagar 
 */
package ejercicio6;

public class Factura {
	private float subtotal = 200.0f;
	private float iva = 0.16f;

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public float Total() {
		return subtotal + (subtotal * iva);
	}

}