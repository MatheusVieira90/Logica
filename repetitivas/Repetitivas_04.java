package br.com.repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Repetitivas_04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nota = sc.nextInt();
		int somaDasNotas = 0;
		int contador = 0;

		while (nota >= 0) {
			somaDasNotas = somaDasNotas + nota;
			contador = contador + 1;
			nota = sc.nextInt();
		}

		if (contador > 0) {
			double media = (double) somaDasNotas / contador;
			if (media >= 70.0) {
				System.out.printf("A média do(a) aluno(a) foi %.2f\n", media);
				System.out.println("Aluno(a) APROVADO(A).");
			} else if (media >= 50.0) {
				System.out.printf("A média do(a) aluno(a) foi %.2f\n", media);
				System.out.println("Aluno(a) em RECUPERAÇÃO.");
				System.out.println("Qual a nota da recuperação?");
				double NR = sc.nextDouble();
				double mediaFinal = NR + media / 2;
				if (mediaFinal >= 70.0) {
					System.out.printf("A média do(a) aluno(a) foi %.2f\n", mediaFinal);
					System.out.println("Aluno(a) APROVADO(A).");
				} else {
					System.out.printf("A média do(a) aluno(a) foi %.2f\n", mediaFinal);
					System.out.println("Aluno(a) REPROVADO(A).");
				}
			} else {
				System.out.printf("A média do(a) aluno(a) foi %.2f\n", media);
				System.out.println("Aluno(a) REPROVADO(A).");
			}

		} else {
			System.out.println("impossivel calcular");
		}
		sc.close();
	}

}
