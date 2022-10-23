package guia6;

import guia6.service.CadenaService_08;

public class Cadena_08 {

	public static void main(String[] args) {
		CadenaService_08 cs = new CadenaService_08();
		
		guia6.entidades.Cadena_08 c = cs.crearCadena();
		System.out.println();
		System.out.println();
		cs.showVowels(c);
		System.out.println();
		System.out.println();
		cs.reversePhrase(c);
		System.out.println();
		System.out.println();
		cs.timesRepeted(c);
		System.out.println();
		System.out.println();
		cs.compareLength(c);
		System.out.println();
		System.out.println();
		cs.joinSentences(c);
		System.out.println();
		System.out.println();
		cs.remplaced(c);
		System.out.println();
		System.out.println();
		cs.contains(c);
	}

}
