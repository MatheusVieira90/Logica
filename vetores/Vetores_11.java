package br.com.vetores;

import java.util.Scanner;

public class Vetores_11 {

	/*
	 * Fazer um programa para ler um vetor de N n�meros inteiros. Em seguida,
	 * mostrar na tela a m�dia aritm�tica somente dos n�meros pares lidos.
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
			System.out.println("N�o havia nenhum n�mero par");
		} else {
			double media = (double) soma / pares;
			System.out.printf("%.1f\n", media);
		}

		sc.close();
	}

}
