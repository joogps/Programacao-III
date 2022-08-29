package exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Integer[] lista = new Integer[10];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < lista.length; i++) {
			lista[i] = Integer.valueOf(scanner.nextLine());
		}
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
		
	}
	
}
