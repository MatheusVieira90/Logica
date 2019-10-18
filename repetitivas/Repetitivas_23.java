package br.com.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repetitivas_23 {

	/*
	 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram
	 * positivos. Na pr�xima linha, deve-se mostrar a m�dia de todos os valores
	 * positivos digitados, com um d�gito ap�s o ponto decimal.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x;
		
		int positivos = 0;
		
		double soma = 0;
		double media;
		
		for (int i = 1; i <= 6; i++) {
			x = sc.nextDouble();
			
			if (x > 0) {
				soma = soma + x;
				positivos++;
			}
		}
		System.out.println(positivos + " valores positivos");
		media = (double) soma / positivos;
		System.out.printf("%.1f\n", media);
		sc.close();

	}

}
