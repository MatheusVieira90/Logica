package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_17 {

	/*
	 * Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele
	 * comercializa. Para isto, mandou digitar um conjunto de N mercadorias, cada
	 * uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um
	 * programa que leia tais dados e determine e escreva quantas mercadorias
	 * proporcionaram:
	 * 
	 * A) lucro < 10% B) 10% <= lucro <= 20% C) lucro > 20%
	 * 
	 * Determine e escreva também o valor total de compra e de venda de todas as
	 * mercadorias, assim como o lucro total.
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		String[] nome = new String[N];
		double[] precoDeCompra = new double[N];
		double[] precoDeVenda = new double[N];

		for (int i = 0; i < N; i++) {
			//Aqui entramos com os dados
			nome[i] = sc.next();
			precoDeCompra[i] = sc.nextDouble();
			precoDeVenda[i] = sc.nextDouble();
		}

		int lucroAbaixoDe10 = 0;
		int lucroEntre10E20 = 0;
		int lucroAcimaDe10 = 0;

		for (int i = 0; i < N; i++) {
			//Aqui vamos calcular o lucro e sua porcentagem em relação a cada produto
			double lucro = precoDeVenda[i] - precoDeCompra[i];
			double porcentagemDeLucro = lucro / precoDeCompra[i] * 100;

			if (porcentagemDeLucro < 10.0) {
				lucroAbaixoDe10++;
			} else if (porcentagemDeLucro <= 20.0) {
				lucroEntre10E20++;
			} else {
				lucroAcimaDe10++;
			}

		}

		System.out.println("Lucro abaixo de 10%: " + lucroAbaixoDe10);
		System.out.println("Lucro entre 10% e 20%: " + lucroEntre10E20);
		System.out.println("Lucro acima de 20%: " + lucroAcimaDe10);

		double totalDeCompra = 0.0;
		double totalDeVenda = 0.0;
		double lucroTotal = 0.0;

		for (int i = 0; i < N; i++) {
			//Aqui calculamos os valores totais
			totalDeCompra += precoDeCompra[i];

			totalDeVenda += precoDeVenda[i];

		}
		// Aqui calculamos o lucro total
		lucroTotal = totalDeVenda - totalDeCompra;

		System.out.printf("Valor total de compra: %.2f\n", totalDeCompra);
		System.out.printf("Valor total de venda: %.2f\n", totalDeVenda);
		System.out.printf("Lucro total: %.2f\n", lucroTotal);

		sc.close();
	}

}
