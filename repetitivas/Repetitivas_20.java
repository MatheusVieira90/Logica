package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_20 {

	/*
	 * Fa�a um programa que simule uma tabuada que mostra a multiplica��o de
	 * qualquer n�mero que for solicitado
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int produto;
		
		for (int i = 1; i <= 10; i++) {
			produto = x * i;
			System.out.println(x + " x " + i + " = " + produto);
		}
		
		
		sc.close();
	}

}
