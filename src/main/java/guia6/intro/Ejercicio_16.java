/*
	Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */

package intro;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_16 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		fillVector();

	}

	public static void fillVector() {
		System.out.print("Ingrese el tamaño del vector: ");

		int n = sc.nextInt();
		System.out.println();

		int[] vector = new int[n];

		for (int i = 0; i < vector.length; i++) {
			int rand = (int) (Math.random() * n + 1);
			vector[i] = rand;
		}
		System.out.print("Vector numbers: ");
		System.out.println(Arrays.toString(vector));
		searchNum(vector);

	}

	public static void searchNum(int[] vector) {
		System.out.print("Add a number to search: ");
		int numToSearch = sc.nextInt();
		System.out.println();

		int count = 0;

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == numToSearch) {
				System.out.print("* The number " + numToSearch + " is found in position: " + (i + 1) + ".");
				System.out.println();
				count++;
			}
		}
		System.out.println();
		System.out.println("* Your number was repeted " + count + " times.");
		sc.close();
	}

}
