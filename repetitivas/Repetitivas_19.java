package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_19 {

	/* Determine quantos números serão computados e faça a soma deles */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int soma = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);

		sc.close();
	}

}
