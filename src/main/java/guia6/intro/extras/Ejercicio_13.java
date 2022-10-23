/*
 	Crear un programa que dibuje una escalera de números, donde cada línea de números
 comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
 usuario al comenzar. Ejemplo: si se ingresa el número 3:
 1
 12
 123
*/

package extras;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		int n = ladderSize();
		showLadder(n);

	}

	public static int ladderSize() {

		boolean exit = true;
		int n = 0;

		while (exit) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the size of the ladder: ");
			
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				exit = false;
				sc.close();
			} else {
				System.out.println();
				System.out.println("You must enter a number");
				System.out.println("Try again \n");
			}
		}
		

		return n;
	}

	public static void showLadder(int n) {
		int[] ladder = new int[n];

		System.out.println();

		for (int i = 2; i <= ladder.length + 1; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
