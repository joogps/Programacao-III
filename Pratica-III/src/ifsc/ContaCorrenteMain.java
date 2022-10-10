package ifsc;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.nome = "João Gabriel";
		conta.cpf = Long.parseLong("12345678900");
		conta.numero = Long.parseLong("1234560");
		conta.saldo = 1000.0;
		
		conta.depositar(200.0);
		conta.sacar(400.0);
		
		conta.mostrarDados();
	}

}
