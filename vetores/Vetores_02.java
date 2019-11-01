package br.com.vetores;

import java.util.Scanner;

public class Vetores_02 {

	/*
	 * TESTE! 
	 * 
	 * Execute o programa a baixo usando a função "Debug As" do Eclipse.
	 * Avançe passo a passo observando como os vetores funcionam. Se quiser
	 * modifique o programa e veja como são executadas as suas alterações.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] A;
		double[] B;
		String[] C;

		A = new int[10];
		B = new double[5];
		C = new String[8];

		A[3] = 10;

		for (int i = 0; i < 5; i++) {
			B[i] = i + 10;
		}
		C[1] = "Maria";

		sc.close();

	}

}
