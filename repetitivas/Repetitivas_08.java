package br.com.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repetitivas_08 {

	/*
	 * Faça um programa que leia as notas referentes às duas avaliações de um aluno.
	 * Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas
	 * válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve
	 * ser validada separadamente.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		
		while (nota1 < 0.0 || nota1 > 10.0) {
			System.out.println("nota invalida");
			nota1 = sc.nextDouble();
		}
		
		double nota2 = sc.nextDouble();
		
		while (nota2 < 0.0 || nota2 > 10.0) {
			System.out.println("nota invalida");
			nota2 = sc.nextDouble();
		}
		
		double media = (nota1 + nota2) / 2.0;
		System.out.printf("media = %.2f\n", media);
		
		sc.close();
	}

}
