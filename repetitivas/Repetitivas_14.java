package br.com.repetitivas;

public class Repetitivas_14 {

	/*
	 * Escreva um aplicativo em Java mostra todos os n�meros �MPARES de 1 at� 100.
	 */

	public static void main(String[] args) {

		int x = 0;

		while (x < 100) {
			x += 1;
			if (x % 2 == 1) {
				System.out.println(x);
			}
		}

	}

}
