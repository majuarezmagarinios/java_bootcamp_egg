package guia6;

import java.util.Random;
import java.util.Scanner;

public class SecretMonth_05 {

	public static void main(String[] args) {
		// Create a class in Java where you declare a variable of type array of Strings
		// containing the twelve months of the year, in lowercase.
		String[] month = { "january", "february", "march", "april", "may", "june", "july", "august", "september",
				"october", "november", "december" };

		// Next, declare a variable SecretMonth of type String, and make it the same
		// to an element of the array
		Random r = new Random();
		int n = r.nextInt(month.length);
		String secretMonth = month[n].toUpperCase();

		System.out.println("SECRET MONTH: " + secretMonth + "\n \n");

		// Program should ask the user to guess the secret month
		Scanner sc = new Scanner(System.in);
		String userMonth;
		boolean exit = true;

		do {
			System.out.print("Guess the secret month: ");
			userMonth = sc.next().toUpperCase();

			if (userMonth.equals(secretMonth)) {
				// If the user succeeds show a message
				System.out.println();
				System.out.println("Congratulations!! You guessed the secret month :)");
				exit = false;
				sc.close();
			} else {
				// And if it doesn't, ask it to try again to guess the secret month
				System.out.println("try again");
				System.out.println();
			}

		} while (exit);
	}

}
