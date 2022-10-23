package guia6.service;

import java.util.Scanner;

import guia6.entidades.Persona_07;

public class PersonaService_07 {

	int n = 1;
	float underWe = 0, normalWe = 0, overwe = 0;

	public Persona_07 crearPersona() {

		Persona_07 p = new Persona_07();
		Scanner sc = new Scanner(System.in);

		System.out.println("------------------------------------");
		System.out.println("            Person " + n);
		System.out.println("------------------------------------");

		System.out.print("Enter your name: ");
		p.setName(sc.next());

		System.out.print("Enter your age: ");
		p.setAge(sc.nextInt());

		boolean exit = true;
		String sex;

		do {
			System.out.print("Enter your sex men(m) women(w) other(o): ");
			sex = sc.next().toLowerCase();

			if ((sex.equals("m")) || (sex.equals("w")) || (sex.equals("o"))) {
				p.setSex(sex);
				exit = false;
			} else {
				System.out.println("You must enter the correct letter");
				System.out.println("Try again");
			}
		} while (exit);

		System.out.print("Enter your weight: ");
		p.setWeight(sc.nextFloat());

		System.out.print("Enter your height: ");
		p.setHeight(sc.nextFloat());
		System.out.println();

//		Increase the value of the person number in the title
		n++;
		
		return p;
	}

	public float calcularIMC(Persona_07 p) {
//		(peso en kg/(altura^2 en mt2)).
		float res = (p.getWeight() / p.getHeight());
		float imc = 0;

		if (res < 20) {
			imc = -1;
		} else if (res >= 20 || res <= 25) {
			imc = 0;
		} else {
			imc = 1;
		}
		return imc;
	}

	public boolean esMayorDeEdad(Persona_07 p) {
		boolean ag = false;

		if (p.getAge() > 18) {
			ag = true;
		}
		return ag;
	}

	public void resultIMC(float imc) {
		if (imc == -1) {
			underWe++;
		} else if (imc == 0) {
			normalWe++;
		} else {
			overwe++;
		}
//		return (underWe, normalWe, overwe);
	}
	
}
