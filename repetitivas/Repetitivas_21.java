package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_21 {

	/*
	 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números
	 * impares entre eles.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int min, max;

		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}
		int soma = 0;
		for (int i = min + 1; i < max; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		System.out.println(soma);

		sc.close();
	}

}
