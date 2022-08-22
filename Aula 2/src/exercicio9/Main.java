package exercicio9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			lista.add(scanner.nextLine());
		}
		
		for (String string : lista) {
			System.out.println(string);
		}
		
		System.out.println(lista.size());
		System.out.println(lista.isEmpty());
		System.out.println(lista.get(lista.size()-1));
	}
	
}
