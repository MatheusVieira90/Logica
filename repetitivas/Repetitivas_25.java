package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_25 {

	/*
	 * Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram
	 * pares, quantos valores digitados foram ímpares, quantos valores digitados
	 * foram positivos e quantos valores digitados foram negativos.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		
		int pares = 0;
		int impares = 0;
		int positivos = 0;
		int negativos = 0;

		for (int i = 0; i < 5; i++) {
			x = sc.nextInt();

			if (x % 2 == 0) {
				pares++;

			} else {
				impares++;

			}

			if (x > 0) {
				positivos++;

			} else if (x < 0) {
				negativos++;
			}

		}
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");

		sc.close();

	}

}
