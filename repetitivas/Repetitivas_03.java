package br.com.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repetitivas_03 {
	/*
	  Fa�a um programa para ler um n�mero indeterminado de dados, contendo cada um,
	  a idade de um indiv�duo. O �ltimo dado, que n�o entrar� nos c�lculos, cont�m
	  um valor de idade negativa. Calcular e imprimir a idade m�dia deste grupo de
	  indiv�duos. Se for entrado um valor negativo na primeira vez, mostrar a
	  mensagem "impossivel calcular".
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int idade = sc.nextInt();
		int somaDasIdades = 0;
		int contador = 0;

		while (idade >= 0) {
			somaDasIdades = somaDasIdades + idade;
			contador = contador + 1;
			idade = sc.nextInt();
		}
		if (contador > 0) {
			double media = (double) somaDasIdades / contador;
			System.out.printf("%.2f\n", media);
		} else {
			System.out.println("impossivel calcular");
		}

		sc.close();
	}

}



