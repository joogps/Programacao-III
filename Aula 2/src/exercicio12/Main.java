package exercicio12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			nomes.add(scanner.nextLine());
		}
		
		nomes.set(7, "João");
		
		for (String string : nomes) {
			System.out.println(string);
		}
	}
	
}
