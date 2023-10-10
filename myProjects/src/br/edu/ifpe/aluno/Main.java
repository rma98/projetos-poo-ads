package br.edu.ifpe.aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	
	static List<Aluno> turmas = new ArrayList<>();

	public static void main(String[] args) {
		String[] nomes = {"Alice", "Bob", "Carol", "David", "Eva", "Fernando", "Grace", "Hugo", "Isabel", "João"};
		
		Random random = new Random();
		
		for (int matricula = 1; matricula <= 10; matricula++) {
			String nomeAleatorio = nomes[random.nextInt(nomes.length)];
			double mediaAleatoria = 0.0 + random.nextDouble() * 5.0; // Gere uma média entre 5.0 e 10.0
			turmas.add(new Aluno(nomeAleatorio, matricula, mediaAleatoria));
		}
		
		System.out.println("Nomes de todos os alunos:");
		for (Aluno aluno : turmas) {
			System.out.println(aluno.nome);
		}
		turmas.sort((a1, a2) -> Double.compare(a2.mediaGlobal, a1.mediaGlobal));
		System.out.println("\nNomes e médias dos alunos com média maior que 9:");
		for (Aluno aluno : turmas) {
			if (aluno.mediaGlobal > 9.0) {
				System.out.println(aluno.nome + " - Média: " + aluno.mediaGlobal);
			}
		}
		double mediaGeral = turmas.stream().mapToDouble(aluno -> aluno.mediaGlobal).average().orElse(0);
		System.out.println("\nMédia geral: " + mediaGeral);
		
		double maiorNota = turmas.get(0).mediaGlobal;
		double menorNota = turmas.get(turmas.size() -1).mediaGlobal;
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Menor nota: " + menorNota);
		
		List<String> acimaMediaTurma = new ArrayList<>();
		for (Aluno aluno : turmas) {
			if (aluno.mediaGlobal > mediaGeral) {
				acimaMediaTurma.add(aluno.nome);
			}
		}
		System.out.println("\nNomes dos alunos com média acima da média da turma: " + acimaMediaTurma);
	}

}
