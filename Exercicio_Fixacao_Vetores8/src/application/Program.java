package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int qntdPares = 0;
		int[] vect = new int[n];
		double media, soma;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		soma = 0.0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				qntdPares += 1;
			}
		}
		media = soma / qntdPares;
		if (qntdPares != 0) {
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR!");
		}
		
		sc.close();
	}
}
