package guia6.service;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import guia6.entidades.Hanged_06;

public class HangedService_06 {

	static Scanner sc = new Scanner(System.in);

//	Create objet 
	public Hanged_06 createGame() {
		Hanged_06 h = new Hanged_06();

		return h;
	}

	public Hanged_06 getSecretWord(Hanged_06 h) {
		String[] word = h.getWords();
		Random r = new Random();

		// Amount of numbers that random will use is limited to the number of secret
		// words
		int n = r.nextInt(word.length);

		String choseWord = word[n];// Choose a word from the array "words" using the random number as an index
		System.out.println("SECRET WORD: " + choseWord);

		h.setSecretWord(choseWord); // Chosen word was set in the "secret word" parameter ENTITY
		h.setLongWord(choseWord.length()); // Length of the word is loaded into the length parameter ENTITY

		return h;
	}

	public Hanged_06 howManyGames(Hanged_06 h) {
		boolean exit = true;

		// Request maximum number of games
		do {

			System.out.print("How many games can they play? ");

			// "hasNextInt" validate that the input is an integer.
			if (sc.hasNextInt()) {
				exit = false;
				h.setManyGames(sc.nextInt());// Set how many games you can play
			} else {
				System.out.println();
				System.out.println("ERROR!!! The value must be a number");
				System.out.println("Try again \n \n");
			}

		} while (exit);

		return h;
	}

	public Hanged_06 userLetters(Hanged_06 h) {
		// I charge to the new array the number of hyphens of the word
		char[] hyphensOfTheWord = new char[h.getLongWord()];

		System.out.println();
		for (int i = 0; i <= (h.getLongWord() - 1); i++) {
			hyphensOfTheWord[i] = '_';
		}

		System.out.println();

		boolean endGame = false;
		int attempts = h.getManyGames();

		do {
			System.out.println();
			System.out.println();
			System.out.println("Number of attempts: " + attempts);
			System.out.println(Arrays.toString(hyphensOfTheWord));

			System.out.println();
			System.out.print("Enter a letter: ");
			char letter = Character.toLowerCase(sc.next().charAt(0));

			boolean guessWord = false;

			// Compares the user's letter with the letter of the secret word
			for (int i = 0; i < h.getLongWord(); i++) {
				if (h.getSecretWord().charAt(i) == letter) {
					hyphensOfTheWord[i] = letter;
					guessWord = true;
				}

			}

			if (!guessWord) {
				System.out.println("**You didn't guess");
				attempts--;// Subtract the attempts

				if (attempts == 0) {
					System.out.println("**You exhausted the attempts, you lost the game :(");
					endGame = true;
				}
			} else {
				// check if there are no underscores left, if so, you won
				boolean gameWin = !validateHypens(hyphensOfTheWord);

				if (gameWin) {
					System.out.println();
					System.out.println("**You won the game!!!!!  :) ");
					System.out.println(Arrays.toString(hyphensOfTheWord));
					endGame = true;
				}
			}

		} while (!endGame);

		sc.close();

		return h;
	}

	// Validates if there are underscores left
	public boolean validateHypens(char[] c) {
		for (char e : c) {
			if (e == '_') {
				return true;
			}
		}
		return false;
	}

}
