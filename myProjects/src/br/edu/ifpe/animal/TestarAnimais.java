package br.edu.ifpe.animal;

public class TestarAnimais {

	public static void main(String[] args) {
		Mamifero camelo = new Mamifero("Camelo", 150, 4, "Amarelo", "Terra", 2.0, "vegetais");
		
		camelo.dadosMamifero();
		
		Peixe tubarao = new Peixe("Tubaraão", 300, 0, "Cinzento", "Mar", 1.5, "Barbatanas e cauda");
		
		tubarao.dadosPeixe();
	}

}
