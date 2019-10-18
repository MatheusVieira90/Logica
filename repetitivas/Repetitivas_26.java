package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_26 {

	/*
	 * Leia um valor inteiro. Em seguida mostre os ímpares de 1
	 * até X, um valor por linha, inclusive o X, se for o caso.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int impar;

		System.out.println("1");

		for (int i = 1; i < x - 1; i += 2) {
			impar = i + 2;
			System.out.println(impar);
		}

		sc.close();
	}
}
