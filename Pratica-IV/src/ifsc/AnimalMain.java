package ifsc;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		ArrayList<Cachorro> doguinhos = new ArrayList<>();
		ArrayList<Gato> gatinhos = new ArrayList<>();
		
		// Doguinhos
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("Dora");
		cachorro1.setRaca("Vira-lata");
		cachorro1.setComprimento(20.0f);
		cachorro1.setNumeroDePatas(4);
		cachorro1.setCor("Bege");
		cachorro1.setEcossistema("Casa");
		doguinhos.add(cachorro1);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setNome("Paulo");
		cachorro2.setRaca("Golden retriever");
		cachorro2.setComprimento(30.0f);
		cachorro2.setNumeroDePatas(4);
		cachorro2.setCor("Bege");
		cachorro2.setEcossistema("Casa");
		doguinhos.add(cachorro2);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.setNome("Claudia");
		cachorro3.setRaca("Poodle");
		cachorro3.setComprimento(18.0f);
		cachorro3.setNumeroDePatas(4);
		cachorro3.setCor("Branco");
		cachorro3.setEcossistema("Rua");
		doguinhos.add(cachorro3);

		// Gatinhos
		Gato gato1 = new Gato();
		gato1.setNome("Marcos");
		gato1.setRaca("Persa");
		gato1.setComprimento(20.0f);
		gato1.setNumeroDePatas(4);
		gato1.setCor("Preto");
		gato1.setEcossistema("Casa");
		gatinhos.add(gato1);
		
		Gato gato2 = new Gato();
		gato2.setNome("Claudio");
		gato2.setRaca("Siamês");
		gato2.setComprimento(22.0f);
		gato2.setNumeroDePatas(4);
		gato2.setCor("Bege");
		gato2.setEcossistema("Floresta");
		gatinhos.add(gato2);
		
		Gato gato3 = new Gato();
		gato3.setNome("Sandy");
		gato3.setRaca("Persa");
		gato3.setComprimento(16.0f);
		gato3.setNumeroDePatas(4);
		gato3.setCor("Branco");
		gato3.setEcossistema("Casa");
		gatinhos.add(gato3);
		
		// Barulho
		System.out.println("Doguinhos\n");
		for (Cachorro doguinho: doguinhos) {
			doguinho.late();
			System.out.println(doguinho.getRaca());
			System.out.println(doguinho.getComprimento());
			System.out.println(doguinho.getNumeroDePatas());
			System.out.println(doguinho.getCor());
			System.out.println(doguinho.getEcossistema());
			doguinho.caminha();
			System.out.println("");
		}

		System.out.println("Gatinhos\n");
		for (Gato gatinho: gatinhos) {
			gatinho.mia();
			System.out.println(gatinho.getRaca());
			System.out.println(gatinho.getComprimento());
			System.out.println(gatinho.getNumeroDePatas());
			System.out.println(gatinho.getCor());
			System.out.println(gatinho.getEcossistema());
			gatinho.caminha();
			System.out.println("");
		}
	}

}
