package guia6;

import guia6.service.HangedService_06;

public class Hanged_06 {

	public static void main(String[] args) {
		HangedService_06 hService = new HangedService_06();
		guia6.entidades.Hanged_06 h1 = hService.createGame();
		hService.howManyGames(h1);
		hService.getSecretWord(h1);
		hService.userLetters(h1);
		
	}

}
