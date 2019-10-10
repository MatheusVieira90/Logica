package br.com.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repetitivas_17 {

	/*
	 * Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
	 * Em seguida, através de um laço while, pede ao usuário para que entre com as
	 * notas de todos os alunos da sala, um por vez.
	 * 
	 * Por fim, o programa mostra a média, aritmética, da turma.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int quantidadeDeAlunos;
		System.out.println("Quantos alunos tem na sua sala?");
		quantidadeDeAlunos = sc.nextInt();

		int contador = 1;
		double nota;
		double soma = 0;
		double media;

		while (contador <= quantidadeDeAlunos) {
			System.out.println("Nota do " + contador + "° aluno? ");
			nota = sc.nextDouble();
			soma += nota;
			contador += 1;
		}
		media = soma / (contador - 1);
		System.out.printf("A média da turma é %.1f\n ", media);

		sc.close();
	}

}
