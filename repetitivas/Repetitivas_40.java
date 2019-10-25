package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_40 {

	/*
	 * Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos
	 * n�meros que n�o s�o m�ltiplos de 13 entre X e Y, incluindo ambos.
	 * 
	 * Entrada - O arquivo de entrada cont�m 2 valores inteiros quaisquer, n�o
	 * necessariamente em ordem crescente.
	 * 
	 * Sa�da - Imprima a soma de todos os valores n�o divis�veis por 13 entre os
	 * dois valores lidos na entrada, inclusive ambos se for o caso.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int soma = 0;

		int min, max;

		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}

		for (int i = min; i <= max; i++) {
			if (i % 13 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);

		sc.close();
	}

}
