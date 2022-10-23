/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package intro;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		int num1, num2, op;

		Scanner sc = new Scanner(System.in);
		System.out.println("Add a first positive integer number");
		num1 = sc.nextInt();
		System.out.println("Add a second positive integer number");
		num2 = sc.nextInt();

		System.out.println("");

		String confirm = "";
		boolean exit = false;

		while (!exit) {
			System.out.format("MENU\n 1.Sum\n 2.Substract\n 3.Multiply\n 4.Split\n 5.Exit");
			System.out.println("");
			System.out.println("");
			System.out.print("**Choose an option: ");
			op = sc.nextInt();
			System.out.println("");

			switch (op) {
			case 1:
				System.out.println("SUM: " + num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case 2:
				System.out.println("Substract: " + num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiply: " + num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case 4:
				System.out.println("Split: " + num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			case 5:
				System.out.println("Are you sure want to you go out? yes(S) / no(N)");
				confirm = sc.next().toUpperCase();
				if (confirm.equals("S")) {
					exit = true;
				}
				break;
			default:
				throw new AssertionError();
			}
		}
	    sc.close();

	}
	
}
