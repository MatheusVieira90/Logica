package br.com.repetitivas;

public class Repetitivas_34 {

	/*
	 * Você deve fazer um programa que apresente a sequencia conforme o exemplo
	 * abaixo.
	 * 
	 * I=1 J=60 
	 * I=4 J=55 
	 * I=7 J=50 
	 * ... 
	 * I=? J=0
	 */

	public static void main(String[] args) {

		int J = 60;

		for (int i = 1; J >= 0; i += 3) {

			System.out.println("I=" + i + " J=" + J);

			J -= 5;

		}

	}

}
