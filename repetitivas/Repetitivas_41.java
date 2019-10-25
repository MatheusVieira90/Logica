package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_41 {

	/*
	 * Escreva um programa que leia 2 valores X e Y e que imprima todos os valores
	 * entre eles cujo resto da divis�o dele por 5 for igual a 2 ou igual a 3.
	 * 
	 * Entrada O arquivo de entrada cont�m 2 valores positivos inteiros quaisquer,
	 * n�o necessariamente em ordem crescente.
	 * 
	 * Sa�da Imprima todos os valores conforme exemplo abaixo, sempre em ordem
	 * crescente.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int min;
		int max;

		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}

		for (int i = min; i < max; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}

		sc.close();

	}
}
