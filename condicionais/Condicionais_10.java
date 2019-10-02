package br.com.condicionais;

import java.util.Scanner;

public class Condicionais_10 {

	/*
	 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
	 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
	 * custa R$ 2.00. Faça um programa para ler a quantidade de minutos que uma
	 * pessoa consumiu, daí mostrar o valor a ser pago.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double consumo = sc.nextDouble();

		double minutosDoPlano = 100.0;
		double valorDoPlano = 50.0;

		double valorFinal;

		if (consumo <= minutosDoPlano) {
			valorFinal = valorDoPlano;
			System.out.printf("Valor a pagar: R$ %.2f\n", valorFinal);
		} else {
			valorFinal = (consumo - minutosDoPlano) * 2 + valorDoPlano;
			System.out.printf("Valor a pagar: R$ %.2f\n", valorFinal);
		}

		sc.close();
	}

}
