package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_24 {

	/*
	 * Fa�a um programa que leia 5 valores inteiros. Conte quantos destes valores
	 * digitados s�o pares e mostre esta informa��o.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int pares = 0;

		for (int i = 0; i < 5; i++) {
			x = sc.nextInt();
			
			if (x % 2 == 0) {
				pares += 1;
			}
		}
		System.out.println(pares + " valores pares");

		sc.close();

	}

}
