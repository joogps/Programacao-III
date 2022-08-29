package exercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			lista.add(String.valueOf(i));
		}
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println(lista.size());
		System.out.println(lista.get(lista.size()-1));
	}
	
}
