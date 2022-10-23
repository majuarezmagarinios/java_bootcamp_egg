/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:

* * * *
*     *
*     *
* * * *

*/

package intro;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) {
		System.out.println("Add the number of sides of the square");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		draw(num);
	}

	public static void draw(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 || j == num || i == num) {
					System.out.print("* ");
				} else if (j == 1 || j == num) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
