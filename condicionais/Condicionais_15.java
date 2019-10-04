package br.com.condicionais;

import java.util.Scanner;

public class Condicionais_15 {
	
	/*
	  Leia um número inteiro que representa um código de DDD para discagem interurbana. 
	  Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
	
	                     _____________________________________
	                    |   DDD     |       Destino           |
	                    |-----------|-------------------------|    
	                    |   61      |       Brasilia          |
	                    |   71      |       Salvador          |
	                    |   11      |       Sao Paulo         |
	                    |   21      |       Rio de Janeiro    |
	                    |   32      |       Juiz de Fora      |
	                    |   19      |       Campinas          |
	                    |   27      |       Vitoria           |
	                    |   31      |       Belo Horizonte    |
	                    |   88      |       Orós              |
	                    |   85      |       Fortaleza         | 
	                    |___________|_________________________|
	
	 Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, 
	 o programa deverá informar: DDD nao cadastrado
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int DDD = sc.nextInt();

		switch (DDD) {

		case 61:
			System.out.println("Brasilia");
			break;

		case 71:
			System.out.println("Salvador");
			break;

		case 11:
			System.out.println("Sao Paulo");
			break;

		case 21:
			System.out.println("Rio de Janeiro");
			break;

		case 32:
			System.out.println("Juiz de Fora");
			break;

		case 19:
			System.out.println("Campinas");
			break;

		case 27:
			System.out.println("Vitoria");
			break;

		case 31:
			System.out.println("Belo Horizonte");
			break;
			
		case 88:
			System.out.println("Orós");
			break;
			
		case 85:
			System.out.println("Fortaleza");
			break;

		default:
			System.out.println("DDD invalido");
			break;

		}
		sc.close();
	}

}
