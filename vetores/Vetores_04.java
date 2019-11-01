package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_04 {

	/*
	 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
	 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
	 * média dos elementos do vetor
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double soma = 0.0;
		double media;
		
		double[] numeros = new double [N];
		
		for (int i=0; i<N; i++) {
			numeros[i] = sc.nextDouble();
			soma += numeros[i];
		}
		for (int i=0; i<N; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();
		
		media = soma / N;
		System.out.printf("%.2f\n", soma);
		System.out.printf("%.2f\n", media);
		
		sc.close();

	}

}
