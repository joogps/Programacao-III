package exercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Double[] notas = new Double[3];
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = Double.valueOf(scanner.nextLine());
		}
		
		Double media = calcularMedia(notas);
		String situacao;
		if (media >= 6) {
			situacao = "Aprovado(a)";
		} else if (media >= 4) {
			situacao = "Em recuperação";
		} else {
			situacao = "Reprovado";
		}
		
		System.out.println(situacao);
	}
	
	static Double calcularMedia(Double valores[]) {
		Double soma = 0.0;
		for(int i = 0; i < valores.length; i++) {
			soma+= valores[i];
		}
		Double media = soma/valores.length;
		return media;
	}
}
