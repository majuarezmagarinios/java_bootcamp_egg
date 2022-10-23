/*
	Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */

package intro;

import java.util.Scanner;

public class Ejercicio_20 {

	public static int[][] fillSquare() {
		int[][] matrix = new int[3][3];
		int num;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Add numbers we will validate if it is a magic square");
		System.out.println();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.println("Add the number to row " + (i + 1) + " column: " + (j + 1));

				if (sc.hasNextInt()) {
					num = sc.nextInt();

					while (num < 0 || num > 9) {
						System.out.println("The number is incorrect");
						num = sc.nextInt();
					}
					matrix[i][j] = num;
				} else {
					break;
				}
			}
		}
		sc.close();
		System.out.println();

		return (matrix);

	}

	public static void showMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void validatorSquareMagic(int[][] matrix) {
		int sum1 = 0, sum2 = 0, sum3 = 0;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {

				if (i == 0) {
					sum1 += matrix[i][j];
				}

				if (i == 0 && j == 0) {
					sum2 += matrix[i][j];
				} else if (i == 1 && j == 1) {
					sum2 += matrix[i][j];
				} else if (i == 2 && j == 2) {
					sum2 += matrix[i][j];
				}

				if (i == 2) {
					sum3 += matrix[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("Sum row one: " + sum1);
		System.out.println("Suma diagonal: " + sum2);
		System.out.println("Sum row one: " + sum3);
		System.out.println();

		if (sum1 == sum2 && sum2 == sum3) {
			System.out.println("The square is magical!!");
		} else {
			System.out.println("The square is not magical :(");
		}

	}

	public static void main(String[] args) {
		int[][] matrix = Ejercicio_20.fillSquare();
		showMatrix(matrix);
		validatorSquareMagic(matrix);
	}

}
