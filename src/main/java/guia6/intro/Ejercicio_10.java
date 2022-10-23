/*
    Escriba un programa en el cual se ingrese un valor límite positivo,
    y a continuación solicite números al usuario hasta que la suma de los 
    números introducidos supere el límite inicial.
 */
package intro;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        int limit, num, sum;
        sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Adds a positive integer limit number");
        limit = sc.nextInt();

        while (sum < limit) {
            System.out.println("Adds a positive integer");
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("Limit => " + limit);
        System.out.println("Total sum => " + sum);
        sc.close();
    }

}
