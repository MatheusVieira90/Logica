package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_15 {
	/*
	 * Exerc�cio:
	 * Crie uma aplica��o console que dever� ler 4 valores num�ricos e
	 * apresentar o maior e o menor.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valor[] = new double[4];
		double maior = valor [0];
		double menor = Double.MAX_VALUE;

		for (int i = 0; i < valor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "� valor: ");
			valor[i] = sc.nextDouble();
			if (valor[i] > maior) {
				maior = valor[i];
			}
		}
		for (int j = 0; j < valor.length; j++) {
			if (valor[j] <= menor) {
				menor = valor[j];
			}
		}
		System.out.println("Maior valor = " + maior);
		System.out.println("Menor valor = " + menor);

		sc.close();
	}


}
