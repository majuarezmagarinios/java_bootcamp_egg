package guia6.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

import guia6.entidades.DatePersona_12;

public class DatePersonaService_12 {
	// Agregar un método de creación del objeto que respete la siguiente firma:
	// crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
	// usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
	// fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

	public DatePersona_12 createPerson() {
		Scanner sc = new Scanner(System.in);
		
		DatePersona_12 p = new DatePersona_12();
		int day, month, year;

		System.out.print("Enter your name: ");
		p.setName(sc.next()); // Saved the value in the person attribute

		System.out.print("Day of birth: ");
		day = sc.nextInt(); // Get the day of birth

		System.out.print("Month of birth (use two numbers): ");
		month = sc.nextInt(); // Get the month of birth

		System.out.print("Year of birth: ");
		year = sc.nextInt(); // // Get the year of birth
		System.out.println();

		LocalDate userDate = LocalDate.of(year, month, day); // Convert to LocalDate objet
		p.setDateBirth(userDate); // Set the date in the person's date of birth argument
		
		return p;
	}

	//	Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
	//	en cuenta que para conocer la edad de la persona también se debe conocer la fecha
	//	actual.
	public void calcAge(DatePersona_12 p) {
		LocalDate userDate = p.getDateBirth(); //Get the person's date of birth
		
		Period diff = Period.between(userDate, LocalDate.now()); // Compare dates;

		System.out.println("You have: " + 
				String.format("%d years, %d month y %d days", 
						diff.getYears(), 
						diff.getMonths(), 
						diff.getDays()
						)
				); // It show age with days, months and years
		
		}

	//	Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
	//	edad y retorna true en caso de que el receptor tenga menor edad que la persona que
	//	se recibe como parámetro, o false en caso contrario.	
	public boolean smallerThan(DatePersona_12 p1, DatePersona_12 p2 ) {
		
		int yearsP1 = p1.getDateBirth().getYear(); //Get the person's1 date of birth
		int yearsP2 = p2.getDateBirth().getYear(); //Get the person's2 date of birth
		
		int diffP1 = (LocalDate.now().getYear() - yearsP1); //Get difference with age 1
		int diffP2 = (LocalDate.now().getYear() - yearsP2);//Get difference with age 2
		
		boolean samallerAge = diffP1 > diffP2 ? true : false; //Returns true if age 1 is greater than age 2
		
		return samallerAge;
		
		}
		
	//	Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
	public void showPerson(DatePersona_12 p1, DatePersona_12 p2, boolean smallerAge) {
		System.out.println("Name : " + p2.getName() + "\n" + "Age : " + p2.getDateBirth());
		
		System.out.println();
		System.out.println("Who is the greatest?");
		
		if(smallerAge) {
			System.out.println(p1.getName().toUpperCase() + " is bigger than " + p2.getName());
		}else {
			System.out.println(p2.getName().toUpperCase() + " is bigger than " + p1.getName());
		}
	}
	
}
	

