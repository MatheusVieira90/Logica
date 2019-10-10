package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_12 {

	/*
	 * escolher a quantidade de números a ser digitada. depois mostrar a soma deles.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {

			soma = soma + x;
			x = sc.nextInt();
		}

		System.out.println("A soma dos números digitados foi: " + soma);

		sc.close();
	}

}
