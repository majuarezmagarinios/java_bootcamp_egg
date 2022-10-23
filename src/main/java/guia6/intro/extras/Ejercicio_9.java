package extras;

import java.util.Scanner;

public class Ejercicio_9 {
	public static void main(String[] args) {
		int[] numbers = numbersToDivide();
		division(numbers);
	}

	public static int[] numbersToDivide() {
		int[] numbers = new int[2];
		boolean exit = true;

		System.out.println("I WILL DIVIDE YOUR TWO NUMBERS USING ONLY THE SUBTRACTION");
		System.out.println();
		System.out.println(" Enter two numbers, both must be greater than one");
		System.out.println();

		while (exit) {
			Scanner sc = new Scanner(System.in);
			System.out.print("* Number 1: ");

			if (sc.hasNextInt()) {
				System.out.print("* Number 2: ");
				for (int i = 0; i < numbers.length; i++) {
					numbers[i] = sc.nextInt();
				}

				if (numbers[0] > 1 && numbers[1] > 1) {
					exit = false;
					sc.close();
				} else {
					System.out.println();
					System.out.println("ERROR: Remember that the number must be greater than 1");
					System.out.println("Try again!");
					System.out.println();
					System.out.println();
					System.out.println();
				}
			} else {
				System.out.println();
				System.out.println("ERROR: you must add a number");
				System.out.println("Try again!");
				System.out.println();
				System.out.println();
				System.out.println();
			}
		}

		return numbers;
	}

	public static void division(int[] numbers) {
		int num1, num2, aux = 0, count = 0;

		num1 = numbers[0];
		num2 = numbers[1];

		if (num1 > num2) {
			aux = num1 - num2;
			count++;
			while (aux > num2) {
				aux = aux - num2;
				count++;
			}
		}
		System.out.println();
		System.out.println("The residue is: " + aux);
		System.out.println("The quotient is: " + count);

	}
}
