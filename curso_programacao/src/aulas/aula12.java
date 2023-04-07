package aulas;

// Estrutura repetitiva "para" (for)
// Mais usado quando se sabe a quantidade de repetições
// for (início ; condição ; incremento) {
//		comando 1
//		comando 2
// }
import java.util.Scanner;

public class aula12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println(soma);
		
		sc.close();
	}
}