package guia6;

import java.text.ParseException;

import guia6.service.DatePersonaService_12;

public class DatePersona_12 {

	public static void main(String[] args) throws ParseException {
		DatePersonaService_12 ejS = new DatePersonaService_12();
		guia6.entidades.DatePersona_12 p1 = ejS.createPerson();// Create a person 1
		ejS.calcAge(p1);// Calculates a person's age in years, months and days
		
		System.out.println();
		System.out.println();
		
		System.out.println("--------------------------");
		guia6.entidades.DatePersona_12 p2 = ejS.createPerson();// Create a person 2
		boolean smallerAge = ejS.smallerThan(p1, p2);// Returns boolean value indicate who is older 
		System.out.println();
		
		ejS.showPerson(p1, p2, smallerAge);//Show person 2 and inicate who is older
	}

}
