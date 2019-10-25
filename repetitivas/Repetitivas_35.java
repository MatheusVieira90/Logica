package br.com.repetitivas;

public class Repetitivas_35 {

	/*
	 * Você deve fazer um programa que apresente a sequencia conforme o exemplo
	 * abaixo.
	 * 
	 * I=1 J=7 
	 * I=1 J=6 
	 * I=1 J=5 
	 * I=3 J=7 
	 * I=3 J=6 
	 * I=3 J=5 
	 * ... 
	 * I=9 J=7 
	 * I=9 J=6 
	 * I=9 J=5
	 */

	public static void main(String[] args) {

		int J = 7;

		for (int i = 1; J >= 5; i = 1) {

			System.out.println("I=" + i + " J=" + J);

			J -= 1;

			if (J == 4) {
				J += 3;
				i += 2;

				while (J >= 5) {

					System.out.println("I=" + i + " J=" + J);

					J -= 1;
					i = 3;
				}

				if (J == 4) {
					J += 3;
					i += 3;

					while (J >= 5) {

						System.out.println("I=" + i + " J=" + J);

						J -= 1;
						i = 6;
					}

					if (J == 4) {
						J += 3;
						i += 3;

						while (J >= 5) {

							System.out.println("I=" + i + " J=" + J);

							J -= 1;
							i = 9;
						}
					}

				}

			}
		}
	}
}
