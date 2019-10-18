package br.com.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repetitivas_22 {

	/*
	 * Faça um programa que leia 6 valores. Estes valores serão somente negativos ou
	 * positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de
	 * valores positivos digitados.
	 */

		public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x;
		double positivos = 0;

		for (int i = 0; i < 6; i++) {
			x = sc.nextDouble();
			
			if (x > 0) {
			 positivos++;
			}
		}
		System.out.printf("%.0f valores positivos", positivos);
		sc.close();
	}

}
