package br.com.repetitivas;

public class Repetitivas_15 {

	/*
	 * Escreva um aplicativo em Java mostra todos os n�meros PARES de 1 at� 100.
	 */

	public static void main(String[] args) {

		int x = 0;

		while (x < 100) {
			x += 1;
			if (x % 2 == 0) {
				System.out.println(x);
			}
		}

	}

}
