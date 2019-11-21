package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_22 {

	/*
	 * EZEQUIEL QUESTÃO 5
	 * 
	 * Faca um programa que leia a distância de um percurso (KMs), o nome e a
	 * velocidade de um grupo de motoristas e informe:
	 * 
	 * A) Nome, velocidade e tempo que cada um deles concluiu o percurso; B) Nome e
	 * velocidade média do motorista mais rápido; C) nome e velocidade média do
	 * motorista mais lento; D) Crie a velocidade máxima permitida em uma era de
	 * 80kms / h, informe quais motoristas ultrapassaram o limite de velocidade.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a distância do percurso?");
		double distanciaDoPercurso = sc.nextDouble();
		System.out.println("Qual o número de motoristas? ");
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
			System.out.printf("VELOCIDADE DE CONCLUSÃO DO PERCURSO: %.1f KM/H \n", velocidade[cont]);
			System.out.printf("TEMPO DE CONCLUSÃO DO PERCURSO: %.1f HS \n", tempo[cont]);
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

		System.out.println("MOTORISTA MAIS RÁPIDO: " + motoristaMaisRapido);
		System.out.println(" ");
		System.out.printf("VELOCIDADE MÉDIA: %.1f KM/H \n", velocidadeMedia);
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
		System.out.printf("VELOCIDADE MÉDIA: %.1f KM/H \n ", velocidadeMedia);
		System.out.println(" ");

		for (int cont = 0; cont < numeroDeMotoristas; cont++) {
			if (velocidade[cont] > 80.0) {
				System.out.println(" ");
				System.out.println(
						"Lista com o(s) nome(s) de todos os motorista que excederam a velocidade mínina de 80 km/h");
				System.out.println(nomes[cont]);
			}
		}
		sc.close();
	}

}
