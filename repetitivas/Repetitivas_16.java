package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_16 {

	/*
	 * Exerc�cio: Algor�tmo que verifica se o numero � Par ou �mpar
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x != 0) {
			if (x % 2 == 0) {
				System.out.println(x + " � PAR");
			} else {
				System.out.println(x + " � �MPAR");
			}
			x = sc.nextInt();
		}
		if (x == 0) {
			System.out.println("PROGRAMA ENCERRADO!");
		}

		sc.close();
	}

}
