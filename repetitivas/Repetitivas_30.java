package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_30 {

	/*
	 * Leia um valor inteiro N. Apresente todos os n�meros entre 1 e 10000 que
	 * divididos por N d�o resto igual a 2.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= 10000; i++) {
			if (i % n == 2) {
				System.out.println(i);
			}
		}

		sc.close();
	}

}
