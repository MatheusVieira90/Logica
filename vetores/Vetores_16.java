package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_16 {

	/*
	 * Tem-se um conjunto de dados contendo a altura e o sexo (M, F) de N pessoas.
	 * Fazer um programa que calcule e escreva:
	 * 
	 * A) A maior e a menor altura do grupo B) A média de altura das mulheres C) O
	 * número de homens
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		char[] sexo = new char[N];
		double[] altura = new double[N];

		int contF = 0;
		int contM = 0;
		double soma = 0;
		double maiorAltura = 0.0;
		double menorAltura = Double.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}
		for (int i = 1; i < N; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		for (int i = 0; i < N; i++) {
			if (sexo[i] == 'F') {
				contF++;
				soma += altura[i];
			}
			if (sexo[i] == 'M') {
				contM++;
			}
		}

		double media = soma / contF;
		System.out.printf("Menor altura = %.2f\n", menorAltura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Média das alturas da mulheres = %.2f\n", media);
		System.out.println("Número de homens = " + contM);

		sc.close();
	}

}
