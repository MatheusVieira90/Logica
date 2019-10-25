package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_38 {

	/*
	 * Escreva um algoritmo que leia 2 n�meros e imprima o resultado da divis�o do
	 * primeiro pelo segundo. Caso n�o for poss�vel mostre a mensagem �divisao
	 * impossivel� para os valores em quest�o.
	 * 
	 * Entrada A entrada cont�m um n�mero inteiro N. Este N ser� a quantidade de
	 * pares de valores inteiros (X e Y) que ser�o lidos em seguida.
	 * 
	 * Sa�da Para cada caso mostre o resultado da divis�o com um d�gito ap�s o ponto
	 * decimal, ou �divisao impossivel� caso n�o seja poss�vel efetuar o c�lculo.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else if (y != 0) {
				double divisao = (double) x / y;
				System.out.printf("%.1f\n", divisao);
			}

		}

		sc.close();

	}

}
