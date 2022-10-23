package guia6;

import guia6.service.MatematicaService_09;

public class Matematica_09 {

	public static void main(String[] args) {
		MatematicaService_09 ejServ = new MatematicaService_09();
		
		guia6.entidades.Matematica_09 e1 = ejServ.startNewOperation();
		ejServ.showEldest();
		System.out.println();
		System.out.println();
		ejServ.calcPower();
		System.out.println();
		System.out.println();
		ejServ.calcRoot(e1);
		
	}
}
