package br.com.vetores;

import java.util.Scanner;

public class Vetores_20 {

	/*
	 * EZEQUIEL QUESTÃO 3
	 * 
	 * Leia um conjunto de valores inteiros e em seguida exiba-os na ordem inversa
	 * do que foram digitados;
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números vai digitar?");
		int N = sc.nextInt(); // Especifique o tamanho do vetor

		int[] vet = new int[N];

		for (int iCont = 0; iCont < N; iCont++) {
			vet[iCont] = sc.nextInt();
		}
		System.out.println("Números Digitados:");
		for (int iCont = 0; iCont < N; iCont++) {
			System.out.println(vet[iCont]);
		}
		System.out.println("Números Digitados em ordem Inversa:");
		for (int iCont = N; iCont > 0; iCont--) {
			System.out.println(vet[iCont - 1]);
		}

		sc.close();
	}

}
