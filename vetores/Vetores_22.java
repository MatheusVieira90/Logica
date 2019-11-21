package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_22 {

	/*
	 * EZEQUIEL QUEST�O 5
	 * 
	 * Faca um programa que leia a dist�ncia de um percurso (KMs), o nome e a
	 * velocidade de um grupo de motoristas e informe:
	 * 
	 * A) Nome, velocidade e tempo que cada um deles concluiu o percurso; B) Nome e
	 * velocidade m�dia do motorista mais r�pido; C) nome e velocidade m�dia do
	 * motorista mais lento; D) Crie a velocidade m�xima permitida em uma era de
	 * 80kms / h, informe quais motoristas ultrapassaram o limite de velocidade.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a dist�ncia do percurso?");
		double distanciaDoPercurso = sc.nextDouble();
		System.out.println("Qual o n�mero de motoristas? ");
		int numeroDeMotoristas = sc.nextInt();

		String[] nomes = new String[numeroDeMotoristas];
		System.out.println("INFORME O NOME DOS " + numeroDeMotoristas + " MOTORISTAS: ");
		for (int cont = 0; cont < numeroDeMotoristas; cont++) {
			nomes[cont] = sc.next();
		}
		double[] velocidade = new double[numeroDeMotoristas];
		for (int cont = 0; cont < numeroDeMotoristas; cont++) {
			System.out.println("Informe a velocidade que " + nomes[cont] + " concluiu o percurso: ");
			velocidade[cont] = sc.nextDouble();
		}
		double[] tempo = new double[numeroDeMotoristas];
		for (int cont = 0; cont < numeroDeMotoristas; cont++) {
			System.out.println("Informe o TEMPO que " + nomes[cont] + " concluiu o percurso: ");
			tempo[cont] = sc.nextDouble();
			System.out.println(" ");
		}
		for (int cont = 0; cont < numeroDeMotoristas; cont++) {
			System.out.println("MOTORISTA: " + nomes[cont]);
			System.out.printf("VELOCIDADE DE CONCLUS�O DO PERCURSO: %.1f KM/H \n", velocidade[cont]);
			System.out.printf("TEMPO DE CONCLUS�O DO PERCURSO: %.1f HS \n", tempo[cont]);
			System.out.println(" ");
		}

		double menorTempo = 0;
		double velocidadeMedia = 0;
		String motoristaMaisRapido = null;
		for (int cont = 0; cont < numeroDeMotoristas; cont++) {
			if (tempo[cont] > menorTempo) {
				menorTempo = velocidade[cont];
				motoristaMaisRapido = nomes[cont];
				velocidadeMedia = distanciaDoPercurso / tempo[cont];
			}
		}

		System.out.println("MOTORISTA MAIS R�PIDO: " + motoristaMaisRapido);
		System.out.println(" ");
		System.out.printf("VELOCIDADE M�DIA: %.1f KM/H \n", velocidadeMedia);
		System.out.println(" ");

		double maiorTempo = Double.MAX_VALUE;
		String motoristaMaisLento = null;
		for (int cont = 0; cont < numeroDeMotoristas; cont++) {
			if (tempo[cont] < maiorTempo) {
				maiorTempo = velocidade[cont];
				motoristaMaisLento = nomes[cont];
				velocidadeMedia = distanciaDoPercurso / tempo[cont];
			}
		}
		System.out.println("MOTORISTA MAIS LENTO: " + motoristaMaisLento);
		System.out.println(" ");
		System.out.printf("VELOCIDADE M�DIA: %.1f KM/H \n ", velocidadeMedia);
		System.out.println(" ");

		for (int cont = 0; cont < numeroDeMotoristas; cont++) {
			if (velocidade[cont] > 80.0) {
				System.out.println(" ");
				System.out.println(
						"Lista com o(s) nome(s) de todos os motorista que excederam a velocidade m�nina de 80 km/h");
				System.out.println(nomes[cont]);
			}
		}
		sc.close();
	}

}
