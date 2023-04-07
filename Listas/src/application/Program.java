package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria"); // adiciona na lista
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		list.add(2, "Marco"); // adiciona no index desejado
		System.out.println(list.size()); // mostra o tamanho da lista
		
		for (String nome : list) {
			System.out.println(nome);
		}
		
		list.remove("Anna"); // remove um dado por comparação
		list.remove(1); // remove por posição
		list.removeIf(x -> x.charAt(0) == 'M'); // remove por predicado
		
		for (String nome : list) {
			System.out.println(nome);
		}
		
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // encontra o index com procura
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String nome : result) {
			System.out.println(nome);
		}
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println();
	}

}
