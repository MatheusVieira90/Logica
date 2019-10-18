package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_27 {

	/*
	 * Leia um valor inteiro. Em seguida mostre os pares de 1
	 * até X, um valor por linha, inclusive o X, se for o caso.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int par;

		for (int i = 0; i < x - 1; i += 2) {
			par = i + 2;
			System.out.println(par);
		}

		sc.close();
	}

}
