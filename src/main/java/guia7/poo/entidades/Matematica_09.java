package guia6.entidades;

public class Matematica_09 {

// Realizar una clase llamada Matemática que tenga como atributos dos números reales con
// los cuales se realizarán diferentes operaciones matemáticas.

	private int n1;
	private int n2;

	public Matematica_09() {
	}

	public Matematica_09(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	@Override
	public String toString() {
		return "Ejercicio9 [n1=" + n1 + ", n2=" + n2 + "]";
	}

}
