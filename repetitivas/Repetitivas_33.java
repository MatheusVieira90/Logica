package br.com.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repetitivas_33 {

	/*
	 * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e
	 * precisa de sua ajuda para organizar os experimentos de um laboratório o qual
	 * ela é responsável. Ela quer saber no final do ano, quantas cobaias foram
	 * utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
	 * 
	 * Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e
	 * coelhos. Para obter estas informações, ela sabe exatamente o número de
	 * experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade
	 * de cobaias utilizadas em cada experimento.
	 * 
	 * Entrada: A primeira linha de entrada contém um valor inteiro N que indica os
	 * vários casos de teste que vem a seguir. Cada caso de teste contém um inteiro
	 * Quantia (1 <= Quantia <= 15) que representa a quantidade de cobaias utilizadas
	 * e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato
	 * S:Sapo C:Coelho).
	 * 
	 * Saída: Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia
	 * utilizada e o percentual de cada uma em relação ao total de cobaias
	 * utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após
	 * o ponto.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int totalCoelhos = 0;
		int totalRatos = 0;
		int totalSapos = 0;
		int totalDeCobaias = 0;

		for (int i = 0; i < N; i++) {

			int quantia = sc.nextInt();
			char tipo = sc.next().charAt(0);

			switch (tipo) {
			case 'C':
				totalCoelhos += quantia;
				break;
			case 'R':
				totalRatos += quantia;
				break;
			case 'S':
				totalSapos += quantia;
				break;
			}

			totalDeCobaias += quantia;
		}

		double percentualCoelhos = (double) totalCoelhos / totalDeCobaias * 100;
		double percentualRatos = (double) totalRatos / totalDeCobaias * 100;
		double percentualSapos = (double) totalSapos / totalDeCobaias * 100;

		System.out.println("Total: " + totalDeCobaias + " cobaias");
		System.out.println("Total de coelhos: " + totalCoelhos);
		System.out.println("Total de ratos: " + totalRatos);
		System.out.println("Total de sapos: " + totalSapos);

		System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
		System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);

		sc.close();
	}

}
