/*
	Realice un programa para que el usuario adivine el resultado de una multiplicación entre
	dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
	si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
	al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
	utilizar la función Math.random() de Java.
 */

package extras;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		numbers();
	}

	public static void numbers() {
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		int num3 = (num1 * num2);

//		System.out.println("Enter the result of the multiplication");
//		System.out.print(num1 + " x " + num2 + " = ");

		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		int resultUser = 0;

		while (exit) {
			System.out.println("Enter the result of the multiplication");
			System.out.print(num1 + " x " + num2 + " = ");
			if (sc.hasNextInt()) {
				resultUser = sc.nextInt();

				if (resultUser == num3) {
					System.out.println();
					System.out.println("Congratulation got it right!!");
					System.out.println("The result is: " + num3);
					exit = false;
				} else {
					System.out.println();
					System.out.println("Sorry you didn´t get ir right");
					System.out.println("-------------------------------");
					System.out.println();
					System.out.println("Try again!");
				}
			} else {
				System.out.println();
				System.out.println("ERROR: You did not enter a number.");
				System.out.println("Bye!");
				break;
			}
		}
		sc.close();
	}

}
