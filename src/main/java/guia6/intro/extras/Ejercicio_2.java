/*
	Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuaci�n, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar s�lo una variable auxiliar.
 */

package extras;

public class Ejercicio_2 {

	public static void main(String[] args) {
		int a = 0, b = 1, c = 2, d = 3, aux;
		
		System.out.println("Initial values");
		System.out.println("A= " + a + "  B= " + b + "  C= " + c + "  D= " + d);
		System.out.println();
		
		aux = b;
		b = c;
		c = a;
		a = d;
		d = aux;
		
		System.out.println("New values");
		System.out.println("A => D  B => C  C => A  D => B");
		System.out.println();
		System.out.println("A => " + a + "  B => " + b + "  C => " + c + "  D => " + d);
	}

}
