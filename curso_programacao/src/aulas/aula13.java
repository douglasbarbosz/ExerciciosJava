package aulas;

import java.util.Locale;

// Estrutura repetitiva faça-enquanto (do-while)

// Problema exemplo:
// Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
// Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
// programa.
import java.util.Scanner;

public class aula13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double c = sc.nextDouble();
		char resposta;
		
		do {
			double f = 9.0 * c / 5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.println("Deseja repetir (s/n)?");
			resposta = sc.next().charAt(0);
			} while (resposta == 's');
		
		sc.close();
	}

}
