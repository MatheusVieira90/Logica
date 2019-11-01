package br.com.vetores;

import java.util.Scanner;

public class Vetores_08 {

	/*
	 * Fa�a um programa que leia N n�meros inteiros e armazene-os em um vetor. Em
	 * seguida, mostre na tela: - todos os n�meros pares - a quantidade de n�meros
	 * pares
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] vet = new int[N];
		int cont = 0;

		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextInt();
			if (vet[i] % 2 == 0) {
				cont += 1;
				System.out.print(vet[i] + " ");
			}
		}
		System.out.println(" ");
		System.out.println(cont);

		sc.close();
	}
}
