package guia6.service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import guia6.entidades.Cadena_08;

public class CadenaService_08 {

	static Scanner sc = new Scanner(System.in);

	public Cadena_08 crearCadena() {
		Cadena_08 c = new Cadena_08();

		System.out.println("------------------");
		System.out.println("    ADD PHRASE");
		System.out.println("------------------");

		System.out.print("Enter a phrase: ");
		c.setPhrase(sc.nextLine().toUpperCase());

//		Save string length
		c.setLengthPhrase(c.getPhrase().length());

		return c;
	}

//	a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase 
//	ingresada.
	public void showVowels(Cadena_08 c) {
		String cade = c.getPhrase();
		Matcher mat = Pattern.compile(String.valueOf("[AEIOU]")).matcher(cade);

		int counter = 0;
		while (mat.find()) {
			counter++;
		}
		System.out.println("------------------");
		System.out.println("     VOWELS");
		System.out.println("------------------");

		System.out.println("**Your phrase has " + counter + " vowels.");
	}

//	b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
//	ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
	public void reversePhrase(Cadena_08 c) {
		String cade = c.getPhrase();
		StringBuilder reverse = new StringBuilder(cade);

		System.out.println("----------------------");
		System.out.println("     REVERSE PHRASE");
		System.out.println("----------------------");

		System.out.println("Original phrase: " + cade);
		System.out.println("Reverse phrase: " + reverse.reverse().toString());
	}

//	c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
//	contabilizar cuántas veces se repite el carácter en la frase.

	public void timesRepeted(Cadena_08 c) {

		String letterUser = "";
		String letterPhrase = c.getPhrase().toUpperCase();

		System.out.println("------------------");
		System.out.println("  TIMES REPETED");
		System.out.println("------------------");
		System.out.print("Enter the word to search: ");

		if (sc.hasNext()) {
			letterUser = sc.next().toUpperCase();
		}

		Matcher matcher = Pattern.compile(String.valueOf(letterUser)).matcher(letterPhrase);

		int counter = 0;
		while (matcher.find()) {
			counter++;
		}

		System.out.println("**The letter: " + letterUser + " is repeted " + counter + " times");
	}

//	e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
//	compone la clase con otra nueva frase ingresada por el usuario.

	public void compareLength(Cadena_08 c) {

		System.out.println("------------------");
		System.out.println("  COMPARE LENGTH");
		System.out.println("------------------");

		String newCade = "";

		System.out.print("Enter the new phrase: ");

		if (sc.hasNext()) {
			newCade = sc.nextLine();
		}

		int leng = c.getLengthPhrase();

		System.out.println("The length of old phrase is: " + leng);
		System.out.println("The length of new phrase is: " + newCade.length());
	}

//	f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
//	una nueva frase ingresada por el usuario y mostrar la frase resultante.
	public void joinSentences(Cadena_08 c) {
		System.out.println("------------------");
		System.out.println("  JOIN SENTENCES");
		System.out.println("------------------");

		System.out.print("Enter the new phrase: ");

		String newCade = "";

		if (sc.hasNext()) {
			newCade = sc.nextLine().toUpperCase();
		}

		System.out.println("The phrases concatenated were");
		System.out.println(c.getPhrase().toUpperCase().concat(newCade));
	}

//	g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//	encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
//	frase resultante.
	public void remplaced(Cadena_08 c) {
		System.out.println("-----------------------");
		System.out.println("  REMPLACE CHARACTER");
		System.out.println("-----------------------");

		System.out.print("Enter a character to remplace the letter A");

		String character = sc.next().toUpperCase();

		Pattern pat = Pattern.compile("([A-Za-z0-9]){1}");
		Matcher mat = pat.matcher(character);
		boolean valida = mat.matches();

		if (valida) {
			System.out.println(c.getPhrase().replace("A", character));
		} else {
			System.out.println("You must enter a single character");
		}

	}

//	h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//	ingresa el usuario y devuelve verdadero si la contiene y falso si no.
	public void contains(Cadena_08 c) {
		System.out.println("-----------------------");
		System.out.println("       CONTAINS");
		System.out.println("-----------------------");

		System.out.print("Enter a character to search: ");

		String character = sc.next().toUpperCase();
		String cade = c.getPhrase().toUpperCase();

		Matcher mat = Pattern.compile(String.valueOf(character)).matcher(cade);

		System.out.println("The result of the search is: " + mat.find());

	}

}
