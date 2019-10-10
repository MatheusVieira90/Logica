package br.com.repetitivas;

public class Repetitivas_05 {
	
	//Faça um programa que mostre os números pares entre 1 e 100, inclusive.

	public static void main(String[] args) {
		
		int contador = 2;
		
		while (contador <= 100) {
			if (contador % 2 == 0) {
				System.out.println(contador);
			}
			
			contador += 1;
		}
	}
}
