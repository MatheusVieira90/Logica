package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_02 {
	/*
	 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
	 * Escreva para cada X e Y uma mensagem que indique se estes valores foram
	 * digitados em ordem crescente ou decrescente.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int soma = 0;
		while (x != y) {
			if (x > y) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}
			soma = soma + x + y;
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("Soma= " + soma);

		sc.close();
	}

}


