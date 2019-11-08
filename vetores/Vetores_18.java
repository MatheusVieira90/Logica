package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_18 {

	/*
	 * EZEQUIEL QUESTÃO 1
	 * 
	 * Crie um programa que leia uma quantidade variável de matérias e suas notas e
	 * informe: obs: (considerar notas de 0 até 10)
	 * 
	 * A) Nome do Aluno; 
	 * B) Nome e valor da nota maior; 
	 * C) Nome e valor da menor nota; 
	 * D) Média de todas as notas do aluno; 
	 * E) Se uma ou mais notas principais menores que 6, informar que aluno foi reprovado, 
	 * se todas as maiores ou iguais a 6, informar que aluno foi aprovado.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos você vai avaliar?");
		int QA = sc.nextInt(); // QA = Qantidade de Alunos
		System.out.println("Em quantas matérias o(s) aluno(s) será(ão) avaliado(s)?");
		int QM = sc.nextInt(); // QM = Quantidade de Matérias

		String[] nomes = new String[QA];
		String[] materias = new String[QM];
		double[] notas = new double[QM];

		for (int i = 0; i < QA; i++) {

			System.out.println("Qual o nome do(a) aluno(a)?");
			nomes[i] = sc.next();

			for (int a = 0; a < QM; a++) {
				System.out.println(" ");
				System.out.println("MATÉRIA " + (a + 1) + ":");
				materias[a] = sc.next(); // Nome da matéria que o aluno será avaliado
			}
			double notaMaior = 0.0;
			String materiaNotaMaior = null;
			double notaMenor = 10.0;
			String materiaNotaMenor = null;

			for (int a = 0; a < QM; a++) {
				System.out.println("Quanto " + nomes[i] + " tirou em " + materias[a] + "?");
				notas[a] = sc.nextDouble(); // Nota que o aluno tirou na matéria

				if (notas[a] > notaMaior) {
					notaMaior = notas[a];
					materiaNotaMaior = materias[a];
				}
				if (notas[a] <= notaMenor) {
					notaMenor = notas[a];
					materiaNotaMenor = materias[a];
				}
			}
			double soma = 0.0; // Soma de todas as notas do aluno para se obter a media do aluno posteriormente

			for (int a = 0; a < QM; a++) {
				soma += notas[a];
			}
			double notaInferior = 6.0;

			for (int a = 0; a < QM; a++) {
				if (notas[a] < 6.0) {
					notaInferior = notas[a];
				}
			}

			double media = soma / QM;

			System.out.println("=============================================================");
			System.out.println(" ");
			System.out.println("-----------------------------------------------------------");
			System.out.println("ALUNO(A): " + nomes[i]);
			System.out.println("-----------------------------------------------------------");
			System.out.println("NOTA MAIOR: " + materiaNotaMaior + " " + notaMaior);
			System.out.println("-----------------------------------------------------------");
			System.out.println("NOTA MENOR: " + materiaNotaMenor + " " + notaMenor);
			System.out.println("-----------------------------------------------------------");
			System.out.printf("Média de %s: %.2f\n ", nomes[i], media);
			System.out.println("-----------------------------------------------------------");

			if (notaInferior < 6.0) {
				System.out.println("ALUNO(A) REPROVADO(A)");
			} else {
				System.out.println("ALUNO(A) APROVADO(A)");
			}
			System.out.println(" ");
			System.out.println("=============================================================");
			System.out.println(" ");
			System.out.println(" ");

		}
		sc.close();
	}

}
