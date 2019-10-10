package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_13 {

	/*
	 * Xuxa, a rainha dos baixinhos, criou uma música que tem o segunte formato:
	 * 
	 * n patinhos foram passear Além das montanhas Para brincar A mamãe gritou: Quá,
	 * quá, quá, quá Mas só n-1 patinhos voltaram de lá.
	 * 
	 * Que se repete até nenhum patinho voltar de lá. Ao final, todos os patinhos
	 * voltam:
	 * 
	 * A mamãe patinha foi procurar Além das montanhas Na beira do mar A mamãe
	 * gritou: Quá, quá, quá, quá E os n patinhos voltaram de lá.
	 * 
	 * Crie um programa em Java que recebe um inteiro positivo do usuário e exibe a
	 * música inteira na tela, onde o inteiro recebido representa o número inicial n
	 * de patinhos que foram passear. 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int contador = 0;

		while (x > 0) {
			if (x == 1) {
				System.out.println(x + " patinho foi passear");
				System.out.println("Além das montanhas");
				System.out.println("Para brincar");
				System.out.println("A mamãe gritou: Quá quá quá quá");
			} else {
				System.out.println(x + " patinhos foram passear");
				System.out.println("Além das montanhas");
				System.out.println("Para brincar");
				System.out.println("A mamãe gritou: Quá quá quá quá");
			}
			x = x - 1;

			if (x == 1) {
				System.out.println("Mas só " + x + " patinho voltou de lá");
			} else if (x == 0) {
				System.out.println("Mas nenhum patinho voltou de lá");
			} else {
				System.out.println("Mas só " + x + " patinhos voltaram de lá");
			}

			System.out.println();
			contador += 1;
		}

		System.out.println("A mamãe patinha foi procurar");
		System.out.println("Além das montanhas");
		System.out.println("Na beira do mar");
		System.out.println("A mamãe gritou: Quá quá quá quá");
		System.out.println("E os " + contador + " patinhos voltaram de lá");

		sc.close();

	}

}
