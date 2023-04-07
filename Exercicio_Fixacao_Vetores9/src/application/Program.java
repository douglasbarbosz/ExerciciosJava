package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		int maiorIdade = 0, pessoaMaisVelha = 0;
		String[] nome = new String[n];
		int[] idade = new int[n];
		
		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		for (int i = 0; i < nome.length; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				pessoaMaisVelha = i;
			}
		}
		System.out.printf("PESSOA MAIS VELHA: %s", nome[pessoaMaisVelha]);
		
		sc.close();
	}

}
