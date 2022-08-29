package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome = scanner.nextLine();
		Integer idade = Integer.valueOf(scanner.nextLine());
		
		System.out.println(nome);
		System.out.println(idade);
	}
	
}
