package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_29 {

	/*
	 * Leia um valor inteiro N. Este valor ser� a quantidade de valores que ser�o
	 * lidos em seguida. Para cada valor lido, mostre uma mensagem em ingl�s dizendo
	 * se este valor lido � par (EVEN), �mpar (ODD), positivo (POSITIVE) ou negativo
	 * (NEGATIVE). No caso do valor ser igual a zero (0), embora a descri��o correta
	 * seja (EVEN NULL), pois por defini��o zero � par, seu programa dever� imprimir
	 * apenas NULL.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x;

		for (int i = 0; i < n; i++) {
			x = sc.nextInt();

			if (x % 2 == 0 && x > 0) {
				System.out.println("EVEN POSITIVE");

			} else if (x % 2 == 0 && x < 0) {
				System.out.println("EVEN NEGATIVE");

			} else if (x % 2 != 0 && x > 0) {
				System.out.println("ODD POSITIVE");

			} else if (x % 2 != 0 && x < 0) {
				System.out.println("ODD NEGATIVE");

			} else {
				System.out.println("NULL");
			}
		}
		sc.close();
	}
}
