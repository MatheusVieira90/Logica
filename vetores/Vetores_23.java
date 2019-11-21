package br.com.vetores;

import java.util.Scanner;

public class Vetores_23 {

	/*
	 * Leia um conjunto de nomes e exiba como uma lista, atribuindo um número para
	 * cada nome. Depois exiba a lista na ordem digitada e também na ordem inversa
	 * e também encontre o nome de um usuário pelo número cadastrado
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos usuários a lista terá?");
		int quantidadeDePessoas = sc.nextInt();

		String[] nomes = new String[quantidadeDePessoas];

		for (int iCont = 0; iCont < quantidadeDePessoas; iCont++) {
			System.out.println("USUÁRIO " + (iCont + 1) + ": ");
			nomes[iCont] = sc.next();
		}
		System.out.println("Informar os nomes das pessoas na lista:");
		for (int iCont = 0; iCont < quantidadeDePessoas; iCont++) {
			System.out.println((iCont + 1) + "- " + nomes[iCont]);
		}
		System.out.println(" ");
		System.out.println("Informar os nomes das pessoas na lista em ordem inversa:");
		for (int iCont = quantidadeDePessoas; iCont > 0; iCont--) {
			System.out.println((iCont) + "- " + nomes[iCont - 1]);
		}
		
		int numeroDasPessoas;
		System.out.println("Digite um número para localizar-mos a pessoa correspondente: ");
		numeroDasPessoas = sc.nextInt();
		
		if (numeroDasPessoas == 0 || numeroDasPessoas > quantidadeDePessoas) {
			System.out.println("CONSULTA INVÁLIDA. NÚMERO NÃO CADASTRADO!");
		} else {
			System.out.println("A pessoa é:");
			System.out.println(numeroDasPessoas + "- " + nomes[numeroDasPessoas - 1]);
		}

		sc.close();

	}

}
