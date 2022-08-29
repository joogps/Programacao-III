package exercicio9;

public class Main {
	
	public Double calcularAbastecimento(Double precoLitro, Double quantidadeLitros) {
		if (precoLitro == null) {
			System.out.print("O preço não pode ser zero.");
			return 0.0;
		}
		if (quantidadeLitros == null) {
			System.out.print("A quantidade de litros não pode ser zero.");
			return 0.0;
		}
		Double valor = precoLitro*quantidadeLitros;
		return valor;
	}
	
}
