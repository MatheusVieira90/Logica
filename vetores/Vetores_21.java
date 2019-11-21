package br.com.vetores;

import java.util.Scanner;

public class Vetores_21 {

	/*
	 * EZEQUIEL QUEST�O 4
	 * 
	 * Fa�a um programa de consulta pela posi��o num�rica da pessoa: leia nomes de
	 * pessoas, sendo uma quantidade m�nima pelo usu�rio. Logo ap�s a entrada,
	 * pergunte ao usu�rio o n�mero do nome que ele gostaria de consultar. Ap�s sua
	 * resposta, exiba ou nome que fica na posi��o informada. Chame a aten��o do
	 * usu�rio no caso de uma consulta inv�lida, ou seja, com n�meros menores ou
	 * iguais a zero, ou maiores do que o montante cadastrado.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("A lista possui quantos usu�rios? ");
		int N = sc.nextInt();

		String[] nomes = new String[N];

		for (int iCont = 0; iCont < N; iCont++) {
			System.out.println("Usu�rio " + (iCont + 1) + ": ");
			nomes[iCont] = sc.next();
		}
		int numeroDaPessoa;
		System.out.println("Qual n�mero do nome do usu�rio deseja consultar? ");
		numeroDaPessoa = sc.nextInt();

		if (numeroDaPessoa == 0 || numeroDaPessoa > N) {
			System.out.println("CONSULTA INV�LIDA. N�MERO N�O CADASTRADO!");
		} else {
			System.out.println("A pessoa � " + nomes[numeroDaPessoa - 1]);

		}

		
		sc.close();
	}

}
