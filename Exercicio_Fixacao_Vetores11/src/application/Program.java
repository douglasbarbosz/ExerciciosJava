package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double[] alturas = new double[n];
		char[] sexos = new char[n];
		double maiorAltura, menorAltura, somaAlturaMulheres = 0.0, mediaAlturaMulheres;
		int nHomens = 0, nMulheres = 0;
		
		for (int i = 0; i < alturas.length; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			alturas[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa: ", i+1);
			sexos[i] = sc.next().charAt(0);
		}
		
		menorAltura = alturas[0];
		maiorAltura = alturas[0];
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		
		for (int i = 0; i < alturas.length; i++) {
			if (sexos[i] == 'F') {
				somaAlturaMulheres += alturas[i];
				nMulheres += 1;
			}
			else {
				nHomens += 1;
			}
		}
		mediaAlturaMulheres = somaAlturaMulheres / nMulheres;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.printf("Numero de homens = %d%n", nHomens);
		
		sc.close();
	}

}
