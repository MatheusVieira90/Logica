package br.com.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repetitivas_10 {
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int contador = 0;
		int somaDasIdades = 0;
		
		while (idade > 0) {
			somaDasIdades += idade;
			contador += 1;
			idade = sc.nextInt();
		}
		double mediaDasIdades = (double) somaDasIdades / contador;
		System.out.printf("%.2f\n", mediaDasIdades);
		
		sc.close();
	}

}
