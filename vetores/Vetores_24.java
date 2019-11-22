package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_24 {

	/*
	 * Solicite uma relação de pessoas, cada uma com o seu nome e a idade. A
	 * quantidade de pessoas também será solicitada pelo usuário. Ao término da
	 * entrada de dados, por exemplo: o nome da pessoa mais velha, a média das
	 * idades, a quantidade de pessoas com idade entre 18 e 60 anos (incluindo 18 e
	 * 60).
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUANTIDADE DE PESSOAS:");
		int quantidadeDePessoas = sc.nextInt(); //Defina a quantidade de pessoas que o conjunto terá
		
		String[] nomes = new String[quantidadeDePessoas]; //Arranjo para armazenar o nome das pessoas
		int[] idade = new int[quantidadeDePessoas]; //Arranjo para armazenar a idade das pessoas
		
		for (int cont = 0; cont < quantidadeDePessoas; cont++) {
			System.out.print("Pessoa " + (cont + 1) + ": ");
			nomes[cont] = sc.next(); //Informe o nome da pessoa
		}
		for (int cont = 0; cont < quantidadeDePessoas; cont++) {
			System.out.print("QUAL A IDADE DE " + nomes[cont] + ": ");
			idade[cont] = sc.nextInt(); //Informe a idade da pessoa
		}
		String pessoaMaisVelha = null; //Variável para guardar o nome da pessoa mais velha
		int maiorIdade = 0; //Variável para guardar a idade da pessoa mais velha
		for (int cont = 0; cont < quantidadeDePessoas; cont++) {
			if (idade[cont] > maiorIdade) {
				maiorIdade = idade[cont];
				pessoaMaisVelha = nomes[cont];
			}
		}
		System.out.println(" ");
		System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha); 
		
		int soma = 0; //Variável para guardar e somar as idades das pessoas para posteriormente calcular a média 
		for (int cont = 0; cont < quantidadeDePessoas; cont++) {
			soma += idade[cont]; //Soma as idades das pessoas
		}
		double media = (double) soma / quantidadeDePessoas; //Obtém a média das idades
		System.out.printf("MÉDIA DAS IDADES: %.1f\n ", media);
		
		int pessoasEntre18E60 = 0; //Variável que aramazena a quantidade de pessoas entre 18 e 60 anos
		for (int cont = 0; cont < quantidadeDePessoas; cont++) {
			if (idade[cont] >= 18 && idade[cont] <= 60) {
				pessoasEntre18E60++; //Realiza a contagem da quantidade de pessoas entre 18 e 60 anos
			}
		}
		System.out.println("QUANTIDADE DE PESSOAS ENTRE 18 E 60 ANOS: " + pessoasEntre18E60);
		
		sc.close();
	}

}
