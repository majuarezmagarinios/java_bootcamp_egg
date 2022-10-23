/*
 Realizar un programa que complete un vector con los N primeros n�meros de la sucesi�n
de Fibonacci. Recordar que la sucesi�n de Fibonacci es la sucesi�n de los siguientes
n�meros:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los n�meros se calcula sumando los dos anteriores a �l. Por ejemplo:
La sucesi�n del n�mero 2 se calcula sumando (1+1)
An�logamente, la sucesi�n del n�mero 3 es (1+2),
Y la del 5 es (2+3),
Y as� sucesivamente...
La sucesi�n de Fibonacci se puede formalizar de acuerdo a la siguiente f�rmula:
Fibonaccin = Fibonaccin-1 + Fibonaccin-2 para todo n>1
Fibonaccin = 1 para todo n<=1
Por lo tanto, si queremos calcular el t�rmino �n� debemos escribir una funci�n que reciba
como par�metro el valor de �n� y que calcule la serie hasta llegar a ese valor.
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
