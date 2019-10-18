package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_20 {

	/*
	 * Faça um programa que simule uma tabuada que mostra a multiplicação de
	 * qualquer número que for solicitado
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
