package guia6.service;

import guia6.entidades.Matematica_09;

public class MatematicaService_09 {
	static int num1;
	static int num2;

	public Matematica_09 startNewOperation() {
		Matematica_09 ej = new Matematica_09();
//		Usará el Math.random para generar los dos números y se guardaran en el objeto con su
//		respectivos set.		
		ej.setN1((int) (Math.round(((Math.random() * 100)) * 100d) / 100d));
		ej.setN2((int) (Math.round(((Math.random() * 100)) * 100d) / 100d));

		num1 = ej.getN1();
		num2 = ej.getN2();

		return ej;
	}

//		a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
	public void showEldest() {
		System.out.println("------------------");
		System.out.println("    SHOW ELDEST");
		System.out.println("------------------");

		System.out.println("N1: " + num1);
		System.out.println("N2: " + num2);

		if (num1 > num2) {
			System.out.println("The largest number is: " + num1);
		} else {
			System.out.println("The largest number is: " + num2);
		}
	}

//	b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
//	al menor número. Previamente se deben redondear ambos valores.
	public void calcPower() {
		System.out.println("---------------------");
		System.out.println("    CALULATE POWER");
		System.out.println("---------------------");

		if (num1 > num2) {
			int pow = (int) Math.pow(num1, num2);
			System.out.println(num1 + " raised to the " + num2 + " is: " + pow);
		} else {
			int pow = (int) Math.pow(num2, num1);
			System.out.println(num2 + " raised to the " + num1 + " is: " + pow);
		}

	}

//	c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//	Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
	public void calcRoot(Matematica_09 ej) {
		System.out.println("---------------------");
		System.out.println("    CALULATE ROOT");
		System.out.println("---------------------");

		if (num1 < num2) {
			ej.setN1((int) Math.abs(num1));
			System.out.println(num1 + " raised to the " + num2 + " is: " + Math.sqrt(num1));
		} else {
			ej.setN2((int) Math.abs(num2));
			System.out.println(num2 + " raised to the " + num1 + " is: " + Math.sqrt(num2));
		}
	}
}
