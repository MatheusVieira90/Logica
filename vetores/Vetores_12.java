package br.com.vetores;

import java.util.Scanner;

public class Vetores_12 {
	
	/*
	 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
	 * idades. Depois, mostrar na tela o nome da pessoa mais velha.
	 */


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		int[] idade = new int [N];
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
			idade[i] = sc.nextInt();
		}
		
		int maiorIdade = idade[0];
		int posicaoMaiorIdade = 0;
		
		for (int i=1; i<N; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicaoMaiorIdade = i;
			}
		}
		System.out.println("Pessoa mais velha: " + nomes[posicaoMaiorIdade]);
		
		sc.close();
		
	}

}
