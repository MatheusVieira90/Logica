package br.com.vetores;

import java.util.Scanner;

public class Vetores_09 {

	/*
	 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
	 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
	 * elementos correspondentes de A e B. Imprima o vetor C gerado.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] A = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}

		int[] B = new int[N];

		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		int[] C = new int[N];

		for (int i = 0; i < N; i++) {
			int soma = A[i] + B[i];
			C[i] = soma;
			System.out.print(soma + " ");
		}

		sc.close();
	}

}
