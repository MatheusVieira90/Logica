package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_18 {

	/*
	 * Escreva um programa em Java que solicita 10 números ao usuário, através de um
	 * laço while, e ao final mostre qual destes números é o maior.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int maior = 0;
		int contador = 2;

		while (contador < 10) {
			if (x > maior) {
				maior = x;
			} 
			
			contador ++;
			x = sc.nextInt();
		}
		System.out.println("O maior número foi " + maior);
		
		sc.close();
	}

}
