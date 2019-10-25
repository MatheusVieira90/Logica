package br.com.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repetitivas_36 {

	/*
	 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
	 * em Fahrenheit e em Kelvin. Perguntar se o usuário deseja repetir (s/n). Caso
	 * o usuário digite "s", repetir o programa.
	 * 
	 * Use a estrutura de repetição DO-WHILE!
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char R;

		do {

			System.out.println("Digite a temperatura em Celsius:");

			double C = sc.nextDouble();
			double F = 9.0 * C / 5 + 32.0;
			double K = C + 273.15;

			System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
			System.out.printf("Equivalente em Kelvin: %.2f\n", K);
			System.out.println("Deseja repetir (s/n)?");
			R = sc.next().charAt(0);

		} while (R != 'n');

		sc.close();
	}

}
