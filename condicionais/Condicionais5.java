package br.com.condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Condicionais5 {
	
	/*
	 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
	                             
	 *                               Salário	         Percentual de Reajuste
	 *                            
	 *                              0 - 400.00                  15%
     *                             400.01 - 800.00              12%
     *                            800.01 - 1200.00              10%
     *                           1200.01 - 2000.00               7%
     *                            Acima de 2000.00               4%
                                
     * Leia o salário do funcionário e calcule e mostre o novo salário, 
     * bem como o valor de reajuste ganho e o índice reajustado, em percentual.                            
	*/
	
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double porcentagem;
		
		if (salario <= 400.00) {
		    porcentagem = 15;
		}
		else if (salario <= 800.00) {
			porcentagem = 12;
		}
		else if (salario <= 1200.00) {
			porcentagem = 10;
		}
		else if (salario <= 2000.00) {
			porcentagem = 7;
		}
		else {
			porcentagem = 4;
		}
		double novoSalario = (porcentagem * salario) / 100 + salario;
	    double reajuste = novoSalario - salario;
	    System.out.printf("Novo salario: %.2f\n", novoSalario);
	    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
	    System.out.printf("Em percentual: %.0f %%\n", porcentagem);
		
	    sc.close();
	}   
}
