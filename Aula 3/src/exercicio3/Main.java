package exercicio3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Integer numero = Integer.valueOf(scanner.nextLine());
		
		System.out.println(numero % 2 == 0 ? "O número é par." : "O número é ímpar.");
	}
	
}
