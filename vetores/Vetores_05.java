package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_05 {

	/*
	 * Fazer um programa para ler um número N, depois nome (apenas uma palavra sem
	 * espaços), idade e altura de N pessoas. Depois, mostrar na
	 * tela a altura média das pessoas, e mostrar também a porcentagem de pessoas
	 * com menos de 16 anos.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nome = new String[N];
		int[] idade = new int[N];
		double[] altura = new double[N];

		for (int i = 0; i < N; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
			altura[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < N; i++) {
			soma += altura[i];
		}

		double mediaAltura = soma / N;
		double contador = 0;
		for (int i = 0; i < N; i++) {
			if (idade[i] < 16) {
				contador += 1;
			}
		}

		double porcentagem = contador / N * 100.0;

		System.out.printf("Altura média: %.2f\n", mediaAltura);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagem);

		sc.close();

	}

}
