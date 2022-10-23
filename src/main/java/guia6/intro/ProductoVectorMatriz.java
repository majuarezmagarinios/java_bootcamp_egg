/*
 	Crea un vector de dos valores, solicita al usuario el valor para cada uno y luego lo multiplica
 contra una matrix de 2 filas y tres columnas con valores aleatorios. 
 */

package intro;

import java.util.Scanner;

public class ProductoVectorMatriz {

    public static void main(String[] args) {
        int[] vector = new int[2];
        int[] producto = new int[3];
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};

        Scanner sc = new Scanner(System.in);

        System.out.println("Multiplicaremos los 2 valores que ingrese por una matriz");
        System.out.println("Ingrese los valores para el vector ");
        System.out.println();

        for (int i = 0; i < vector.length; i++) {
            System.out.print("v[" + i + "]: ");
            vector[i] = sc.nextInt();
        }
        sc.close();

        int suma;
        for (int i = 0; i < matriz[0].length; i++) {
            suma = 0;
            for (int j = 0; j < vector.length; j++) {
                suma += vector[j] * matriz[j][i];
            }
            producto[i] = suma;
        }

        String aux = "";

        for (int elemento : vector) {
            aux = aux + " " + elemento;
        }
        System.out.println("");
        System.out.print("* Vector:");
        System.out.println(aux);

        System.out.println("");
        System.out.println("* Matriz");
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux = aux + " " + elemento;
            }
            System.out.println(aux);
        }

        aux = "";
        for (int elemento : producto) {
            aux = aux + " " + elemento;
        }
        System.out.println("");
        System.out.println("* Vector x Matriz");
        System.out.println(aux);
    }

}
