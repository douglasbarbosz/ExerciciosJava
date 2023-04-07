package aulas;

// Funções interessantes para String

public class aula14 {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase(); // deixa tudo minúsculo
		String s02 = original.toUpperCase(); // deixa tudo maiúsculo
		String s03 = original.trim(); // elimina espaços nos cantos da string
		String s04 = original.substring(2); // forma uma nova string formado por entre os parametros
		String s05 = original.replace('a', 'x'); // troca determinado caracter por outro

		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
	}

}
