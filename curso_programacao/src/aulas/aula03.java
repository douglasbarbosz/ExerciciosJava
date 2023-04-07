package aulas;

// Entrada de Dados

import java.util.Scanner;
import java.util.Locale;

public class aula03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Você digitou:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();
	}
}
