package br.com.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetores_24 {

	/*
	 * Solicite uma rela��o de pessoas, cada uma com o seu nome e a idade. A
	 * quantidade de pessoas tamb�m ser� solicitada pelo usu�rio. Ao t�rmino da
	 * entrada de dados, por exemplo: o nome da pessoa mais velha, a m�dia das
	 * idades, a quantidade de pessoas com idade entre 18 e 60 anos (incluindo 18 e
	 * 60).
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUANTIDADE DE PESSOAS:");
		int quantidadeDePessoas = sc.nextInt(); //Defina a quantidade de pessoas que o conjunto ter�
		
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
		String pessoaMaisVelha = null; //Vari�vel para guardar o nome da pessoa mais velha
		int maiorIdade = 0; //Vari�vel para guardar a idade da pessoa mais velha
		for (int cont = 0; cont < quantidadeDePessoas; cont++) {
			if (idade[cont] > maiorIdade) {
				maiorIdade = idade[cont];
				pessoaMaisVelha = nomes[cont];
			}
		}
		System.out.println(" ");
		System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha); 
		
		int soma = 0; //Vari�vel para guardar e somar as idades das pessoas para posteriormente calcular a m�dia 
		for (int cont = 0; cont < quantidadeDePessoas; cont++) {
			soma += idade[cont]; //Soma as idades das pessoas
		}
		double media = (double) soma / quantidadeDePessoas; //Obt�m a m�dia das idades
		System.out.printf("M�DIA DAS IDADES: %.1f\n ", media);
		
		int pessoasEntre18E60 = 0; //Vari�vel que aramazena a quantidade de pessoas entre 18 e 60 anos
		for (int cont = 0; cont < quantidadeDePessoas; cont++) {
			if (idade[cont] >= 18 && idade[cont] <= 60) {
				pessoasEntre18E60++; //Realiza a contagem da quantidade de pessoas entre 18 e 60 anos
			}
		}
		System.out.println("QUANTIDADE DE PESSOAS ENTRE 18 E 60 ANOS: " + pessoasEntre18E60);
		
		sc.close();
	}

}
