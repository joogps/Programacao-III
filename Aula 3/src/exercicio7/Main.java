package exercicio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] lista = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
		
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
		System.out.println(lista.length);
		System.out.println(lista[lista.length-1]);
	}

}
