package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		int quantidadePares = 0;
		System.out.println("NÚMEROS PARES: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%d  ", vect[i]);
				quantidadePares += 1;
			}
		}
		System.out.printf("\nQUANTIDADE DE PARES = %d%n", quantidadePares);
		
		sc.close();
	}

}
