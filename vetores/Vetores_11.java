package br.com.vetores;

import java.util.Scanner;

public class Vetores_11 {

	/*
	 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
	 * mostrar na tela a média aritmética somente dos números pares lidos.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] vet = new int[N];

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextInt();
		}

		int soma = 0;
		int pares = 0;
		for (int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				pares += 1;
				soma += vet[i];
			}
		}

		if (pares == 0) {
			System.out.println("Não havia nenhum número par");
		} else {
			double media = (double) soma / pares;
			System.out.printf("%.1f\n", media);
		}

		sc.close();
	}

}
