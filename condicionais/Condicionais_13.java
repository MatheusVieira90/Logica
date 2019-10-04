package br.com.condicionais;

import java.util.Scanner;

public class Condicionais_13 {
	
	/*
	 * Leia 3 valores inteiros e ordene-os em ordem crescente. 
	 * No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, 
	 * os valores na sequência como foram lidos.
	 */

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int n1 = sc.nextInt();
	  int n2 = sc.nextInt();
	  int n3 = sc.nextInt();
	  
	  int v1;
	  int v2;
	  int v3;
	  
	  if (n1 < n2 && n1 < n3) {
		  v1 = n1;
		  if (n2 < n3) {
			  v2 = n2;
			  v3 = n3; 
		  }
		  else {
			  v2 = n3;
			  v3 = n2;  
		  }
	  }
	  else if (n2 < n1 && n2 < n3) {
		  v1 = n2;
		  if (n1 < n3) {
			  v2 = n1;
			  v3 = n3;
		  }
		  else {
			  v2 = n3;
			  v3 = n1;
		  }
	  }
	  else {
		  v1 = n3;
		  if (n1 < n2) {
			  v2 = n1;
			  v3 = n2;
		  }
		  else {
			  v2 = n2;
			  v3 = n1;
		  }
	  }
	  System.out.println(v1);
	  System.out.println(v2);
	  System.out.println(v3);
	  System.out.println();
	  System.out.println(n1);
	  System.out.println(n2);
	  System.out.println(n3);
	   
	  sc.close();
	}

}
