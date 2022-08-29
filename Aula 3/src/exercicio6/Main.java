package exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] lista = new Integer[10];
		Integer menor = 0, maior = 0;
		
		for(int i = 0; i < lista.length; i++) {
			lista[i] = Integer.valueOf(scanner.nextLine());
			if (i == 0) {
				menor = lista[i];
				maior = lista[i];
			} else {
				if(lista[i] < menor) menor = lista[i];
				if(lista[i] > maior) maior = lista[i];
			}
		}
		
		System.out.println(menor);
		System.out.println(maior);
	}

}
