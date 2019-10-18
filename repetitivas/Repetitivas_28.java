package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_28 {

	/*
	 * Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares
	 * consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x % 2 == 0) {
			x++;
			System.out.println(x);
		} else {
			System.out.println(x);
		}

		for (int i = 1; i < 6; i++) {
			x = x + 2;
			System.out.println(x);
		}
		sc.close();
	}

}
