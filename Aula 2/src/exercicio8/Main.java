package exercicio8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] lista = new String[5];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = scanner.nextLine();
		}
		
		for (String string : lista) {
			System.out.println(string);
		}
		
		System.out.println(lista.length);
		System.out.println(lista[lista.length-1]);
	}
	
}
