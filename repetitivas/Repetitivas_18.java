package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_18 {

	/*
	 * Escreva um programa em Java que solicita 10 n�meros ao usu�rio, atrav�s de um
	 * la�o while, e ao final mostre qual destes n�meros � o maior.
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
		System.out.println("O maior n�mero foi " + maior);
		
		sc.close();
	}

}
