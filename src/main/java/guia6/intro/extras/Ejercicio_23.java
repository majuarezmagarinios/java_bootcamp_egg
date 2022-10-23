/*
	Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
	que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
	20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
	será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
	rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
	por pantalla la sopa de letras creada.
	Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
	de Java substring(), Length() y Math.random().
 */

package extras;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio_23 {

	public static void main(String[] args) {
// requests the words and adds them to the array.
		String[][] wordsSoap = userWords();
// show the chosen words and fills the empty fields whit numbers from 0 to 9.
		showSoap(wordsSoap);

	}

	public static String[][] userWords() {
		int rand;
		String[][] wordsSoap = new String[20][20];
		String word;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 words with minimum of 3 and a maximum of 5 characters");

		for (int i = 0; i < 5; i++) {
			System.out.print("Word number " + (i + 1) + ": ");
			word = sc.next();

			// Call the method validatorWords
			boolean exit = validatorWords(word);

			while (!exit) {
				System.out.println("ATTENTION!! Your word length should be 3-5 characters");
				System.out.println();
				System.out.println("*** Try again");
				System.out.print("Word number " + (i + 1) + ": ");
				word = sc.next();
				exit = validatorWords(word);
			}

			int a = 0;
			rand = (int) (Math.random() * 20);

			for (int j = 0; j < word.length(); j++) {
				a++;

				if (wordsSoap[rand][j] == null) {
					wordsSoap[rand][j] = word.substring(j, a);

				}
			}
		}
		sc.close();

		return wordsSoap;

	}

//This method check if the chosen words are letters and have 3 to 5 characters
	public static boolean validatorWords(String word) {
		Pattern pat = Pattern.compile("[A-Za-z]{3,5}");
		Matcher mat = pat.matcher(word);
		boolean valida = mat.matches();

		return valida;
	}

	public static void showSoap(String[][] wordsSoap) {
		System.out.println();
		System.out.println();

		for (int i = 0; i < wordsSoap.length; i++) {
			for (int j = 0; j < wordsSoap.length; j++) {
				int rand2 = (int) (Math.random() * 10);
				if (wordsSoap[i][j] == null) {
					wordsSoap[i][j] = String.valueOf(rand2);
				}
				System.out.print(wordsSoap[i][j] + "  ");
			}
			System.out.println();
		}
	}
}
