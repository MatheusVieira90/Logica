package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_19 {

	/*
	 * EZEQUIEL QUESTÃO 2
	 * 
	 * Crie um programa que leia o nome de 5 matérias e faça anotações e informe:
	 * 
	 * A) Nome do Aluno; 
	 * B) Se todas as notas maiores ou iguais a 6, informar a mensagem: Aluno "Fulano de tal" foi aprovado; 
	 * C) Se 3 ou mais notas principais menores que 6, informar a mensagem: Aluno "Fulano de tal"
	 * foi reprovado; 
	 * D) Se houver até 2 matérias com nota menor que 6, informe a mensagem: Aluno "Fulano de tal" 
	 * foi aprovado, mas possuipendências de material (s): Nome das matérias;
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos alunos vamos avaliar?");
		int QA = sc.nextInt();
		String[] nomes = new String[QA];
		for (int i = 0; i < QA; i++) {
			System.out.println("Qual o nome do aluno(a)");
			nomes[i] = sc.next();

			int QM = 5;
			String[] materias = new String[QM];
			for (int a = 0; a < QM; a++) {
				System.out.println("MATÉRIA " + (a + 1) + ": ");
				materias[a] = sc.next();
			}

			double[] notas = new double[QM];
			for (int a = 0; a < QM; a++) {
				System.out.println("Quanto " + nomes[i] + " tirou em " + materias[a] + "? ");
				notas[a] = sc.nextDouble();
			}

			int NI = 0;

			for (int a = 0; a < QM; a++) {
				if (notas[a] < 6.0) {

					NI++;
				}
			}

			if (NI >= 3) {
				System.out.println("Aluno(a) " + nomes[i] + " foi: REPROVADO(A) ");
			
			} else if (NI >= 1) {
				System.out.println("Aluno(a) " + nomes[i] + " foi aprovado(a), mas possui PENDÊNCIA(S) DE MATÉRIA(S): ");
				for (int a = 0; a < QM; a++) {
					if (notas[a] < 6.0) {
						System.out.println(materias[a]);
					}
				}
			} else {
				System.out.println("Aluno " + nomes[i] + " foi APROVADO ");
			}
			System.out.println(" ");

		}

		sc.close();
	}

}
