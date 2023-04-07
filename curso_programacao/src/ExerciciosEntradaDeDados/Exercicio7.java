package ExerciciosEntradaDeDados;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, numPecas1, numPecas2;
		double valorPeca1, valorPeca2, total;

		cod1 = sc.nextInt();
		numPecas1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();

		cod2 = sc.nextInt();
		numPecas2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();

		total = numPecas1 * valorPeca1 + numPecas2 * valorPeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

		sc.close();
	}
}