/*
	Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */

package intro;

public class Ejercicio_18 {

	public static void main(String[] args) {
		fillMatrix();

	}

	public static void fillMatrix() {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		System.out.println("Original matrix: ");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] < 10) {
					System.out.print(matrix[i][j] + "  ");
				} else {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		transMatrix(matrix);
	}

	public static void transMatrix(int[][] matrix) {
		
		System.out.println("Modified matrix: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] < 10) {
					System.out.print(matrix[j][i] + "  ");
				} else {
					System.out.print(matrix[j][i] + " ");
				}
			}
			System.out.println();
		}
	}

}
