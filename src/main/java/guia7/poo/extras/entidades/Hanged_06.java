package guia6.entidades;

public class Hanged_06 {

	private String[] words = { "dog", "house", "car", "hello", "mouse", "place" };
	private String secretWord;
	private int longWord;
	private int manyGames;

	public Hanged_06() {
	}

	public Hanged_06(String[] words, String secretWord, int longWord, int manyGames) {
		this.words = words;
		this.secretWord = secretWord;
		this.longWord = longWord;
		this.manyGames = manyGames;
	}

	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public String getSecretWord() {
		return secretWord;
	}

	public void setSecretWord(String secretWord) {
		this.secretWord = secretWord;
	}

	public int getLongWord() {
		return longWord;
	}

	public void setLongWord(int longWord) {
		this.longWord = longWord;
	}

	public int getManyGames() {
		return manyGames;
	}

	public void setManyGames(int manyGames) {
		this.manyGames = manyGames;
	}
	
}