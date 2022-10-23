package guia6;

import guia6.service.PersonaService_07;

public class Persona_07 {

	public static void main(String[] args) {
		PersonaService_07 sp = new PersonaService_07();

//		Persona 1
		guia6.entidades.Persona_07 p1 = sp.crearPersona();
		sp.calcularIMC(p1);
		sp.esMayorDeEdad(p1);
		float imcP1 = sp.calcularIMC(p1);
		boolean ageP1 = sp.esMayorDeEdad(p1);
		System.out.println(p1 + "\n" + "IMC: " + imcP1 + "\n" + "Age: " + ageP1);
		System.out.println();
		System.out.println();

//		Persona 2
		guia6.entidades.Persona_07 p2 = sp.crearPersona();
		float imcP2 = sp.calcularIMC(p2);
		boolean ageP2 = sp.esMayorDeEdad(p2);
		System.out.println(p2 + "\n" + "IMC: " + imcP2 + "\n" + "Age: " + ageP2);
		System.out.println();
		System.out.println();

//		Persona 3
		guia6.entidades.Persona_07 p3 = sp.crearPersona();
		float imcP3 = sp.calcularIMC(p3);
		boolean ageP3 = sp.esMayorDeEdad(p3);
		System.out.println(p3 + "\n" + "IMC: " + imcP3 + "\n" + "Age: " + ageP3);
		System.out.println();
		System.out.println();

//		Persona 4
		guia6.entidades.Persona_07 p4 = sp.crearPersona();
		float imcP4 = sp.calcularIMC(p4);
		
		boolean ageP4 = sp.esMayorDeEdad(p4);
		
		System.out.println(p4 + "\n" + "IMC: " + imcP4 + "\n" + "Age: " + ageP4);
		System.out.println();
		System.out.println();
		
		
		
		/*
		 * Por último, guardaremos los resultados de los métodos calcularIMC y
		 * esMayorDeEdad en distintas variables, para después en el main, calcular un
		 * porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en
		 * su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de
		 * cuantos son mayores de edad y cuantos menores.
		 */
		
	}

	
}
