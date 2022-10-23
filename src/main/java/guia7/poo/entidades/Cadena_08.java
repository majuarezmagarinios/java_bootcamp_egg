package guia6.entidades;

public class Cadena_08 {
	private String phrase;
	private int lengthPhrase;

	public Cadena_08() {
	}

	public Cadena_08(String phrase, int lengthPhrase) {
		this.phrase = phrase;
		this.lengthPhrase = lengthPhrase;
	}

	public String getPhrase() {
		return phrase;
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}

	public int getLengthPhrase() {
		return lengthPhrase;
	}

	public void setLengthPhrase(int lengthPhrase) {
		this.lengthPhrase = lengthPhrase;
	}

	@Override
	public String toString() {
		return "Cadena [phrase=" + phrase + ", lengthPhrase=" + lengthPhrase + "]";
	}

}
