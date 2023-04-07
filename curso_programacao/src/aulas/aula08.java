package aulas;

// Switch case

// Fazer um programa para ler um valor inteiro de 1 a 7 representando um
// dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
// Escrever na tela o dia da semana correspondente, conforme exemplos.

import java.util.Scanner;

public class aula08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String dia;
		
		switch (n) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6: 
			dia = "Sexta";
			break;
		case 7: 
			dia = "Sábado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();

	}

}
