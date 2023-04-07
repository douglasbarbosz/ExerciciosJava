package ExerciciosFor;

// Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
// Lembrando que, por definição, fatorial de 0 é 1.
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int fatorial = n;
		
		if (n == 0) {
			fatorial = 1;
		}
		
		for (int i = 1; i <= n; i++) {
			if (i != n) {
					fatorial *= n - i;
				}
		}
		System.out.println(fatorial);
		sc.close();
	}
}
