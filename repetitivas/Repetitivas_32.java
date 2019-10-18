package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_32 {

	/*
	 * Leia 10 valores inteiros. Apresente então o maior valor lido e a posição
	 * dentre os 10 valores lidos.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int maior = 0;
		int posicao = 0;

		for (int i = 1; i < 10; i++) {
			if (x > maior) {
				maior = x;
				posicao = i;
			}
			x = sc.nextInt();
		}
		System.out.println(maior);
		System.out.println(posicao);

		sc.close();
	}
}
