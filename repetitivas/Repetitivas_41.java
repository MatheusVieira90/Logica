package br.com.repetitivas;

import java.util.Scanner;

public class Repetitivas_41 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int min;
		int max;

		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}
		
		for (int i = min; i < max; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.print(i);
			}
		}

		sc.close();

	}
}
