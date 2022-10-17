package ifsc;

public class MainPessoa {

	public static void main(String[] args) {
		Professor bruna = new Professor();
		bruna.setNome("Bruna");
		bruna.setCpf("1234");
		bruna.setSiape(1234);
		
		Aluno joao = new Aluno();
		joao.setNome("João");
		joao.setCpf("1234");
		joao.setMatricula(1234);

		System.out.println(bruna.getNome());
		System.out.println(bruna.getCpf());
		System.out.println(bruna.getSiape());
		
		System.out.println(joao.getNome());
		System.out.println(joao.getCpf());
		System.out.println(joao.getMatricula());
	}

}
