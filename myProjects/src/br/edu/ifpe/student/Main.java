package br.edu.ifpe.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	
	static List<Student> turmas = new ArrayList<>();

	public static void main(String[] args) {
		turmas.add(new Student("Aluno 01", 1, 8.5));
		turmas.add(new Student("Aluno 02", 2, 6.7));
		turmas.add(new Student("Aluno 03", 3, 9.2));
		turmas.add(new Student("Aluno 04", 4, 7.8));
		turmas.add(new Student("Aluno 05", 5, 9.8));
		turmas.add(new Student("Aluno 06", 6, 5.5));
		turmas.add(new Student("Aluno 07", 7, 8.0));
		turmas.add(new Student("Aluno 08", 8, 9.5));
		turmas.add(new Student("Aluno 09", 9, 6.0));
		turmas.add(new Student("Aluno 10", 10, 7.2));
		
		System.err.println("\nNomes de todos os alunos:");
		for (Student student : turmas) {
			System.out.println(student.nome);
		}
		
		Collections.sort(turmas, (a1, a2) -> Double.compare(a2.mediaGlobal, a1.mediaGlobal));
		System.out.println("\nNomes e médias dos alunos com média maior que 9:");
		for (Student student : turmas) {
			if (student.mediaGlobal > 9.0) {
				System.out.println(student.nome + " - Média: " + student.mediaGlobal);
			}
		}
		double mediaGeral = turmas.stream().mapToDouble(student -> student.mediaGlobal).average().orElse(0);
		System.out.println("\nMédia geral da turma: " + mediaGeral);
		double maiorNota = turmas.get(0).mediaGlobal;
		double menorNota = turmas.get(turmas.size() - 1).mediaGlobal;
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Menor nota: " + menorNota);
		
		List<String> acimaMediaTurma = new ArrayList<>();
		for (Student student : turmas) {
			if (student.mediaGlobal > mediaGeral) {
				acimaMediaTurma.add(student.nome);
			}
		}
		System.out.println("\nNomes dos alunos com média acima da turma: " + acimaMediaTurma);
	}
}