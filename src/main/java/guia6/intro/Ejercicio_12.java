/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */

package intro;

import java.util.Scanner;

public class Ejercicio_12 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce una cadena con el siguiente formato: ");
		System.out.println("Máximo de 5 caracteres, el primero tiene que ser X y el último tiene que ser una O");

		String cadena = sc.next().toUpperCase();
		controlCadena(cadena);

	}

	public static void controlCadena(String cadena) {
		String exit = "&&&&&";
		int countRight = 0;
		int countIncorrect = 0;

		while (!exit.equals(cadena)) {

			String firstCarac = cadena.substring(0, 1);
			String lastCarac = cadena.substring(cadena.length() - 1);

			if (firstCarac.equals("X") && lastCarac.equals("O") && cadena.length() <= 5 && cadena.length() > 1) {
				countRight++;
				System.out.println("\"" + cadena + "\"" + " es una cadena válida");
				System.out.println();
				System.out.println("Ingresa una nueva cadena: ");
				cadena = sc.next().toUpperCase();
				System.out.println();
			} else {
				countIncorrect++;
				System.out.println("Ingresaste: " + cadena);
				System.out.println("Error: debe comenzar con X, finalizar con O y un máximo de 5 caracteres");
				System.out.print("Ingresa una nueva cadena: ");
				cadena = sc.next().toUpperCase();
				System.out.println();
			}
		}
		sc.close();
		System.out.println("cantidad de lecturas correctas: " + countRight);
		System.out.println("cantidad de lecturas incorrectas: " + countIncorrect);
		System.out.println("Adiós!!!");
	}

}
