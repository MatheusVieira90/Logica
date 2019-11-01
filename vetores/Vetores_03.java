package br.com.vetores;

import java.util.Scanner;

public class Vetores_03 {

	/*
	 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
	 * seguida, mostrar na tela todos os números negativos lidos.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] vet = new int [N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
		}
		
		for (int i=0; i<N; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}

}
