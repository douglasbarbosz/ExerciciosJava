package aulas;

// Main

import java.util.Locale;

public class aula01 {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.8912;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.3f%n", x);
		System.out.println("Bom dia!");
		Locale.setDefault(Locale.US);
		
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
	}
}
