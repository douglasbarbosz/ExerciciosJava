package aulas;

// Estrutura repetitiva "enquanto" (while)
// Recomendada quando não se sabe a quantidade de repetições

import java.util.Scanner;

public class aula10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
		
	}

}
