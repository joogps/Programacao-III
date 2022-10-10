package ifsc;

public class ContaCorrente {
	public String nome;
	public Long cpf;
	public Long numero;
	public Double saldo;
	
	void sacar(Double valor) {
		if (saldo >= valor) {
			saldo-= valor;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
	
	void depositar(Double valor) {
		saldo+= valor;
	}
	
	void mostrarDados() {
		System.out.println("Nome: "+nome);
		
		String cpfPattern = "(\\d{3})(\\d{3})(\\d{3})(\\d{2})";
		String parsedCpf = String.valueOf(cpf).replaceAll(cpfPattern, "$1.$2.$3-$4");
		System.out.println("CPF: "+parsedCpf);
		
		String numeroPattern = "(\\d{6})(\\d{1})";
		String parsedNumero = String.valueOf(numero).replaceAll(numeroPattern, "$1-$2");
		System.out.println("Número de conta: "+parsedNumero);
		
		System.out.println("Saldo: R$ "+saldo);
	}
}
