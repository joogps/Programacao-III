package ifsc;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {
		ArrayList<Gato> gatinhos = new ArrayList<>();
		ArrayList<Cachorro> doguinhos = new ArrayList<>();
		
		// Gatinhos
		Gato gato1 = new Gato();
		gato1.setNome("Marcos");
		gato1.setNumeroDePatas(4);
		gato1.setEcossistema("Casa");
		gato1.setCor("Preto");
		gato1.setRaca("Persa");
		gato1.setComprimento(20.0f);
		gatinhos.add(gato1);
		
		Gato gato2 = new Gato();
		gato2.setNome("Claudio");
		gato2.setNumeroDePatas(4);
		gato2.setEcossistema("Floresta");
		gato2.setCor("Bege");
		gato2.setRaca("Siamês");
		gato2.setComprimento(22.0f);
		gatinhos.add(gato2);
		
		Gato gato3 = new Gato();
		gato3.setNome("Sandy");
		gato3.setNumeroDePatas(4);
		gato3.setEcossistema("Casa");
		gato3.setCor("Branco");
		gato3.setRaca("Persa");
		gato3.setComprimento(16.0f);
		gatinhos.add(gato3);
		
		// Doguinhos
		Cachorro cachorro1 = new Cachorro();
		cachorro1.setNome("Dora");
		cachorro1.setNumeroDePatas(4);
		cachorro1.setEcossistema("Casa");
		cachorro1.setCor("Bege");
		cachorro1.setRaca("Vira-lata");
		cachorro1.setComprimento(20.0f);
		doguinhos.add(cachorro1);
		
		Cachorro cachorro2 = new Cachorro();
		cachorro2.setNome("Paulo");
		cachorro2.setNumeroDePatas(4);
		cachorro2.setEcossistema("Casa");
		cachorro2.setCor("Bege");
		cachorro2.setRaca("Golden retriever");
		cachorro2.setComprimento(30.0f);
		doguinhos.add(cachorro2);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.setNome("Claudia");
		cachorro3.setNumeroDePatas(4);
		cachorro3.setEcossistema("Rua");
		cachorro3.setCor("Branco");
		cachorro3.setRaca("Poodle");
		cachorro3.setComprimento(18.0f);
		doguinhos.add(cachorro3);
		
		// Barulho
		for (int i = 0; i < doguinhos.size(); i++) {
			doguinhos.get(i).late();
		}
		for (int i = 0; i < gatinhos.size(); i++) {
			gatinhos.get(i).mia();
		}
	}

}
