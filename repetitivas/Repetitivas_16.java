package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_16 {

	/*
	 * Exercício: Algorítmo que verifica se o numero é Par ou Ímpar
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x != 0) {
			if (x % 2 == 0) {
				System.out.println(x + " é PAR");
			} else {
				System.out.println(x + " é ÍMPAR");
			}
			x = sc.nextInt();
		}
		if (x == 0) {
			System.out.println("PROGRAMA ENCERRADO!");
		}

		sc.close();
	}

}
