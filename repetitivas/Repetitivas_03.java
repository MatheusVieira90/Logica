package br.com.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repetitivas_03 {
	/*
	  Faça um programa para ler um número indeterminado de dados, contendo cada um,
	  a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém
	  um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
	  indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a
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



