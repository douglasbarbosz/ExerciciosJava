package ExerciciosFor;

import java.util.Locale;
// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
// segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0.0) {
				System.out.println("divisão impossivel");
			}
			else {
				double divisao = a / b;
				System.out.printf("%.1f%n", divisao);
			}
		}
		sc.close();
	}
}
