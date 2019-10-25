package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_39 {

	/*
	 * A Federação Gaúcha de Futebol contratou você para escrever um programa para
	 * fazer uma estatística do resultado de vários GRENAIS. Escreva um programa
	 * para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL.
	 * Logo após escrever a mensagem "Novo grenal (1-sim 2-nao)" e solicitar uma
	 * resposta. Se a resposta for 1, o algoritmo deve ser executado novamente
	 * solicitando o número de gols marcados pelos times em uma nova partida, caso
	 * contrário deve ser encerrado imprimindo:
	 * 
	 * - Quantos GRENAIS fizeram parte da estatística. - O número de vitórias do
	 * Inter. - O número de vitórias do Grêmio. - O número de Empates. - Uma
	 * mensagem indicando qual o time que venceu o maior número de GRENAIS (ou
	 * "Nao houve vencedor", caso termine empatado).
	 * 
	 * Entrada O arquivo de entrada contém 2 valores inteiros, correspondentes aos
	 * gols marcados pelo Inter e pelo Grêmio respectivamente. Em seguida háverá um
	 * inteiro (1 ou 2), correspondente à repetição do programa.
	 * 
	 * Saída Após cada leitura dos gols, deve ser impressa a mensagem
	 * "Novo grenal (1-sim 2-nao)". Quando o algoritmo for encerrado devem ser
	 * mostradas as estatísticas conforme a descrição apresentada acima.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char choice;

		int grenais = 0;
		int totalGremio = 0;
		int totalInter = 0;
		int empates = 0;

		do {

			int inter = sc.nextInt();
			int gremio = sc.nextInt();

			if (gremio > inter) {
				totalGremio++;
			} else if (inter > gremio) {
				totalInter++;
			} else {
				empates++;
			}

			grenais++;

			System.out.println("Novo grenal (1-sim 2-nao)");
			choice = sc.next().charAt(0);

		} while (choice != '2');

		System.out.println(grenais + " grenais");
		System.out.println("Inter:" + totalInter);
		System.out.println("Gremio:" + totalGremio);
		System.out.println("Empates:" + empates);

		if (totalInter > totalGremio) {
			System.out.println("Inter venceu mais");
		} else if (totalGremio > totalInter) {
			System.out.println("Gremio venceu mais");
		} else {
			System.out.println("Nao houve vencedor");
		}

		sc.close();

	}

}
