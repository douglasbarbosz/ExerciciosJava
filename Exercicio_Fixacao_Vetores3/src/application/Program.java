package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[n];
		
		for (int i = 0; i < pessoa.length; i++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: "); 
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			pessoa[i] = new Pessoa(nome, idade, altura);
		}
		
		double alturaTotal = 0.0;
		for (int i = 0; i < pessoa.length; i++) {
			alturaTotal += pessoa[i].getAltura();
		}
		double alturaMedia = alturaTotal / pessoa.length;
		
		int menos16Anos = 0;
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				menos16Anos += 1;
			}
		}
		double porcentagemIdade = ((double)menos16Anos / n) * 100.0;
		
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemIdade);
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
		}
		sc.close();
	}
}