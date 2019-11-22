package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_25 {

	/*
	 * Leia um conjunto de 10 notas. Em seguida, exiba todas as que são maiores que
	 * a média do conjunto.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] notas = new double[10];

		System.out.println("QUAIS AS NOTAS? ");
		for (int cont = 0; cont < 10; cont++) {
			notas[cont] = sc.nextDouble();
		}
		double soma = 0.0;
		for (int cont = 0; cont < 10; cont++) {
			soma += notas[cont];
		}
		double media = soma / 10;
		System.out.printf("A média do conjunto é %.1f\n", media);
		System.out.println(" ");
		
		System.out.println("As notas maiores do que a média do conjunto foram: ");
		for (int cont = 0; cont < 10; cont++) {
			if (notas[cont] > media) {
				System.out.println(notas[cont]);
			}
		}
		System.out.println(" ");
		System.out.println("As notas menores do que a média do conjunto foram: ");
		for (int cont = 0; cont < 10; cont++) {
			if (notas[cont] < media) {
				System.out.println(notas[cont]);
			}
		}
		sc.close();
	}

}
