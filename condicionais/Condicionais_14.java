package br.com.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Condicionais_14 {
	
	/*Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. 
	  Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
	 
      Perimetro = XX.X
       
      Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
       
      Area = XX.X
     */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		if (B - C < A && A < B + C && A - C < B && B < A + C && A - B < C && C < A + B) {
			double perimetro = A + B +C;
			System.out.printf("Perimetro = %.1f\n", perimetro);
		}else {
			double area = (A + B) * C / 2;
			System.out.printf("Area = %.1f\n", area);
		}
		
		sc.close();
	}

}
