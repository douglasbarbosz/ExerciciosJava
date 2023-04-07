package aulas;

// Expressão Condicional Ternária
// Sintaxe:
// ( condição ) ? valor_se_verdadeiro : valor_se_falso

public class aula09 {

	public static void main(String[] args) {
		
		// demo
		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		System.out.println(desconto);
		
		// com ternária
		double preco2 = 34.5;
		double desconto2 = (preco2 < 20.0) ? preco2* 0.1 : preco * 0.05;

		System.out.println(desconto2);
	}

}
