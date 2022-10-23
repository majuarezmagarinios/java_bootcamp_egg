/*
 	Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
 0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
 Ejemplo:
 0-0-0
 0-0-1
 0-0-2
 0-0-E
 0-0-4
 0-1-2
 0-1-E
 Nota: investigar función equals() y como convertir números a String.
*/

package extras;

public class Ejercicio_12 {

	public static void main(String[] args) {
		counter();
	}

	public static void counter() {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				for (int x = 1; x < 10; x++) {
					if (i == 3) {
						System.out.println("E" + "-" + j + "-" + x);
					} else if (j == 3) {
						System.out.println(i + "-" + "E" + "-" + x);
					} else if (x == 3) {
						System.out.println(i + "-" + j + "-" + "E");
					} else {
						System.out.println(i + "-" + j + "-" + x);
					}
				}
			}
		}
	}

}
