package br.com.vetores;

import java.util.Scanner;

public class Vetores_21 {

	/*
	 * EZEQUIEL QUESTÃO 4
	 * 
	 * Faça um programa de consulta pela posição numérica da pessoa: leia nomes de
	 * pessoas, sendo uma quantidade mínima pelo usuário. Logo após a entrada,
	 * pergunte ao usuário o número do nome que ele gostaria de consultar. Após sua
	 * resposta, exiba ou nome que fica na posição informada. Chame a atenção do
	 * usuário no caso de uma consulta inválida, ou seja, com números menores ou
	 * iguais a zero, ou maiores do que o montante cadastrado.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("A lista possui quantos usuários? ");
		int N = sc.nextInt();

		String[] nomes = new String[N];

		for (int iCont = 0; iCont < N; iCont++) {
			System.out.println("Usuário " + (iCont + 1) + ": ");
			nomes[iCont] = sc.next();
		}
		int numeroDaPessoa;
		System.out.println("Qual número do nome do usuário deseja consultar? ");
		numeroDaPessoa = sc.nextInt();

		if (numeroDaPessoa == 0 || numeroDaPessoa > N) {
			System.out.println("CONSULTA INVÁLIDA. NÚMERO NÃO CADASTRADO!");
		} else {
			System.out.println("A pessoa é " + nomes[numeroDaPessoa - 1]);

		}

		
		sc.close();
	}

}
