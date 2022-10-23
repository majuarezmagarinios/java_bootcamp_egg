/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
*/

package intro;

import java.util.Arrays;

public class Ejercicio_15 {

	public static void main(String[] args) {
		fillAndOrderVector();
	}
	
	public static void fillAndOrderVector() {
		int[] vector = new int[100];
		int random;

		for (int i = 0; i < vector.length; i++) {
			random = (int) (Math.random() * 100 + 1);
			vector[i] = random;
		}
		
		Arrays.sort(vector);
		System.out.println(Arrays.toString(vector));
	}
}
