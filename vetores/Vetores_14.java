package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_14 {

	/*
	 * EZEQUIEL QUESTÃO 1 
	 * 
	 * Crie um programa que leia uma quantidade variável de matérias e suas notas e
	 * informe: obs: (considerar notas de 0 até 10)
	 *  
	 *  A) Nome do Aluno;
	 *  B) Nome e valor da nota maior; 
	 *  C) Nome e valor da menor nota; 
	 *  D) Média de todas as notas do aluno; 
	 *  E) Se uma ou mais notas principais menores que 6, informar que aluno foi 
	 *     reprovado, se todas as maiores ou iguais a 6, informar que aluno foi aprovado.
	 */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int QA = sc.nextInt();
		
		String[] nomes = new String [QA];
		for(int i=0; i<QA; i++) {
			nomes[i] = sc.next();
		}
		int cont = 0;
		String[] materias = new String[0];
		char R;
		
		
		do {
			System.out.println("Nome da Matéria:");
			materias[cont] = sc.next();
			System.out.println("Adicionar Matéria? s(sim)/n(não)");
			R = sc.next().charAt(0);
			cont += 1;
		} while (R != 'n');
		
		
		sc.close();

	}

}
