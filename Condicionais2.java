package br.com.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Condicionais2 {
	
	/*
	 * Com base na tabela abaixo, escreva um programa que leia o c�digo de um item 
	 * e a quantidade deste item. 
	 * A seguir, calcule e mostre o valor da conta a pagar.
	 
	 *       C�DIGO       ITEM           PRE�O
	 *         1        SANDU�CHE       R$ 4.00
	 *         2        SANDU�CHE       R$ 4.50
	 *         3        SANDU�CHE       R$ 5.00
	 *         4        SANDU�CHE       R$ 2.00
	 *         5        SANDU�CHE       R$ 1.50
	  
	 * O arquivo de entrada cont�m dois valores inteiros correspondentes ao c�digo
	 *  e � quantidade de um item conforme tabela acima.
     */          


    public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total;
		
		if (codigo == 1) {
			total = quantidade * 4.0;
		}
		else if (codigo == 2) {
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		}
		else {
			total = quantidade * 1.5;
		}
		System.out.printf("Total: R$ %.2f\n", total);
	 
	    sc.close();	
	}
}
