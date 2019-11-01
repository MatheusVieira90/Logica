package br.com.vetores;

import java.util.Scanner;

public class Vetores_07 {

	/*
	 * Fa�a um programa que leia N n�meros reais e armazene-os em um vetor. Em
	 * seguida, mostrar na tela o maior n�mero do vetor (supor n�o haver empates).
	 * Mostrar tamb�m a posi��o do maior elemento.
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vet = new double [N];
		
		for (int i=0; i<N; i++) {
			vet[i] = sc.nextInt();
		}
		
		double maior = vet[0];
		int posicaoMaior = 0;
		
		for (int i=1; i<N; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
				posicaoMaior = i;
			}	
		}
		
		System.out.printf("%.1f\n", maior);
		System.out.println(posicaoMaior);
		
		sc.close();
	}

}
