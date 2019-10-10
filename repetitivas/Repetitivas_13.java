package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_13 {

	/*
	 * Xuxa, a rainha dos baixinhos, criou uma m�sica que tem o segunte formato:
	 * 
	 * n patinhos foram passear Al�m das montanhas Para brincar A mam�e gritou: Qu�,
	 * qu�, qu�, qu� Mas s� n-1 patinhos voltaram de l�.
	 * 
	 * Que se repete at� nenhum patinho voltar de l�. Ao final, todos os patinhos
	 * voltam:
	 * 
	 * A mam�e patinha foi procurar Al�m das montanhas Na beira do mar A mam�e
	 * gritou: Qu�, qu�, qu�, qu� E os n patinhos voltaram de l�.
	 * 
	 * Crie um programa em Java que recebe um inteiro positivo do usu�rio e exibe a
	 * m�sica inteira na tela, onde o inteiro recebido representa o n�mero inicial n
	 * de patinhos que foram passear. 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int contador = 0;

		while (x > 0) {
			if (x == 1) {
				System.out.println(x + " patinho foi passear");
				System.out.println("Al�m das montanhas");
				System.out.println("Para brincar");
				System.out.println("A mam�e gritou: Qu� qu� qu� qu�");
			} else {
				System.out.println(x + " patinhos foram passear");
				System.out.println("Al�m das montanhas");
				System.out.println("Para brincar");
				System.out.println("A mam�e gritou: Qu� qu� qu� qu�");
			}
			x = x - 1;

			if (x == 1) {
				System.out.println("Mas s� " + x + " patinho voltou de l�");
			} else if (x == 0) {
				System.out.println("Mas nenhum patinho voltou de l�");
			} else {
				System.out.println("Mas s� " + x + " patinhos voltaram de l�");
			}

			System.out.println();
			contador += 1;
		}

		System.out.println("A mam�e patinha foi procurar");
		System.out.println("Al�m das montanhas");
		System.out.println("Na beira do mar");
		System.out.println("A mam�e gritou: Qu� qu� qu� qu�");
		System.out.println("E os " + contador + " patinhos voltaram de l�");

		sc.close();

	}

}
