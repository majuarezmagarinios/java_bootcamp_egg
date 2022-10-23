package guia6;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Dates_11 {

//	Deberemos instanciar en el main, una fecha usando la clase Date crear 3 variables, dia, 
//	mes y anio que se le pedirán al	usuario para poner el constructor del objeto
	public static void main(String[] args) {
		int day = 0;
		int month = 0;
		int year = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a date, we'll tell you how long it's been until today");
		System.out.println();

		System.out.print("Add day: ");
		day = sc.nextInt();
		System.out.print("Add month: ");
		month = sc.nextInt();
		System.out.print("Add year: ");
		year = sc.nextInt();
		System.out.println();

		// User date
		LocalDate userDate = LocalDate.of(year, month, day);

		// Function Call
		findDifference(userDate);
		sc.close();
	}

	// Function to print difference in
	// time start_date and end_date
	static void findDifference(LocalDate userDate) {

		// Actual date
		LocalDate actualDate = LocalDate.now();

		// find the period between the start and end date
		Period diff = Period.between(userDate, actualDate);

		// Print the date difference in years, months, and days
		System.out.println("The difference between the current date and your date is: ");

		// Print the result
		System.out.printf("%d years, %d months" + " and %d days ", diff.getYears(), diff.getMonths(), diff.getDays());
	}

}
