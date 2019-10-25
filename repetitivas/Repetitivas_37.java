package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_37 {

	/*
	 * Escreva um programa que repita a leitura de uma senha até que ela seja
	 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
	 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
	 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
	 * correta é o valor 2002.
	 * 
	 * OBS: Use a estrutura Do-While
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();

		do {

			System.out.println("Senha Invalida");

			senha = sc.nextInt();

		} while (senha != 2002);

		System.out.println("Acesso Permitido");

		sc.close();
	}

}
