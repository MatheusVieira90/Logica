package br.com.vetores;

import java.util.Scanner;

public class Vetores_02 {

	/*
	 * TESTE! 
	 * 
	 * Execute o programa a baixo usando a fun��o "Debug As" do Eclipse.
	 * Avan�e passo a passo observando como os vetores funcionam. Se quiser
	 * modifique o programa e veja como s�o executadas as suas altera��es.
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
