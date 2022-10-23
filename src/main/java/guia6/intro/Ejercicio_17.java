/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */

package intro;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		fillVector();
	}

	public static void fillVector() {
		System.out.println("How many numbers do you want the vector to have?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int[] vector = new int[n];

		for (int i = 0; i < vector.length; i++) {
			int rand = (int) (Math.random() * n * 100);
			vector[i] = rand;
		}
		System.out.println(Arrays.toString(vector));
		digitsOfNumbers(vector);
	}

	public static void digitsOfNumbers(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println(
					"POSICION " + (i + 1) + ": " + Math.floor(Math.log10(Math.abs(vector[i])) + 1) + " digits");

		}

	}

}
