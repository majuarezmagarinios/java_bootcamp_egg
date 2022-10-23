package guia6;

public class Arreglos_10 {
//		creen dos arreglos: el primero será un arreglo A de 50 números reales, 
//		y el segundo B, un arreglo de 20 números, también reales.

	private static double[] a = new double[50];
	private static double[] b = new double[20];

	public static void main(String[] args) {
		System.out.println();
		initShowArrayA();
		orderArrays();
		System.out.println();
		System.out.println();
		copyArray();
		System.out.println();
		showArrays();

	}

//	El programa deberá inicializar el arreglo A con números aleatorios
	public static void initShowArrayA() {

		for (int i = 0; i < a.length; i++) {
			a[i] = (Math.random() * 10) + 1;
			a[i] = Math.round(a[i] * 100.0) / 100.0;
		}

//	Mostrarlo por pantalla.
		System.out.println("INITIALIZE ARRAY A: ");
		for (double e : a) {
			System.out.print(" " + e + " ");
		}
	}

	public static void orderArrays() {
		double aux;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				aux = a[i];
				if (a[i] > a[j]) {
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}

	}

//	Copiar los primeros 10 números ordenados al arreglo B de 20 elementos
	public static void copyArray() {
		for (int i = 0; i < 10; i++) {
			b[i] = a[i];
		}

//	Rellenar los 10 últimos elementos con el valor 0.5.
		for (int i = 9; i <= 19; i++) {
			b[i] = 0.5;
		}

	}

//	Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el
//	combinado de 20.
	public static void showArrays() {

		System.out.println("ARRAY A ORDER: ");
		for (double e : a) {
			System.out.print(" " + e + " ");
		}

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("ARRAY B: ");
		for (double e : b) {
			System.out.print(" " + e + " ");
		}
	}

}
