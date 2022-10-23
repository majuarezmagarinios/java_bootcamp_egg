/*
	Escribir un programa que lea un número entero y devuelva el número de dígitos que
	componen ese número. Por ejemplo, si introducimos el número 12345, el programa
	deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
	de división. Nota: recordar que las variables de tipo entero truncan los números o
	resultados.
 */

package extras;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		int num = numberInput();
		digits(num);
	}

	public static int numberInput() {
		System.out.print("Enter a number: ");

		Scanner sc = new Scanner(System.in);
		int num = 0;

		if (sc.hasNextInt()) {
			num = sc.nextInt();
		} else {
			System.out.println("You must enter a number");
			System.out.println("Bye!");
		}
		sc.close();

		return num;
	}

	public static void digits(int num) {
		int cifras = 0;

		if (num == 0) {
			System.out.println();
			System.out.println("The number has " + cifras + " digits.");
		} else {
			while (num != 0) {
				num = num / 10;
				cifras++;
			}
			System.out.println();
			System.out.println("The number has " + cifras + " digits.");
		}

	}
}
