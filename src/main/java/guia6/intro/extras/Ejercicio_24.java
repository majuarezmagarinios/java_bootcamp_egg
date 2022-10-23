/*
 Realizar un programa que complete un vector con los N primeros números de la sucesión
de Fibonacci. Recordar que la sucesión de Fibonacci es la sucesión de los siguientes
números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente...
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba
como parámetro el valor de “n” y que calcule la serie hasta llegar a ese valor.
 */

package extras;

import java.util.Scanner;

public class Ejercicio_24 {

	public static void main(String[] args) {
		int f = numUser();
		System.out.println(numFibonacci(f));
	
	}
	
	public static int numUser() {
		boolean exit = true;
		int n = 0;

		while (exit) {
			System.out.println("How many numbers of the Fibonacci sequence do you want to show?");
			Scanner sc = new Scanner(System.in);
			if (sc.hasNextInt()) {
				n = sc.nextInt();
				sc.close();
				exit = false;
			} else {
				System.out.println("Error: the value entered is not a number, please try again");
				System.out.println();
			}
		}
		
		return n;
	}

	public static int numFibonacci(int n) {
		int x = 0;

		if (n == 1 || n == 2) {
			x = 1;
		} else {
			x = numFibonacci(n - 1) + numFibonacci(n - 2);
		}

		return x;
	}
}
