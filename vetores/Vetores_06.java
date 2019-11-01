package br.com.vetores;

import java.util.Scanner;

public class Vetores_06 {

	/*
	 * Usando a sintaxe opcional "FOR IT", faça um programa para ler um valor N e
	 * depois o nome de N pessoas. Em seguida, mostrar os nomes lidos.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nomes = new String[N];

		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
		}

		System.out.println("Nomes lidos:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		sc.close();

	}

}
