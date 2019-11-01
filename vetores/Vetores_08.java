package br.com.vetores;

import java.util.Scanner;

public class Vetores_08 {

	/*
	 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
	 * seguida, mostre na tela: - todos os números pares - a quantidade de números
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
