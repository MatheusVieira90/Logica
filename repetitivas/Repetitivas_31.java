package br.com.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repetitivas_31 {

	/*
	 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
	 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
	 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
	 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
	 * o terceiro valor tem peso 5.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double nota1;
		double nota2;
		double nota3;

		for (int i = 0; i < n; i++) {
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();

			double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
			System.out.printf("%.1f\n", media);
		}

		sc.close();

	}

}
