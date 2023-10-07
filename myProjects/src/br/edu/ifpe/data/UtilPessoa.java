package br.edu.ifpe.data;

import java.time.LocalDate;
import java.time.Period;

public class UtilPessoa {
	public static void imprimirDados(Pessoa pessoa) {
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Ano de Nascimento: " + pessoa.getAnoNascimento());
		System.out.println("Altura: " + pessoa.getAltura());
	}
	
	public static int calcularIdade(Pessoa pessoa) {
		// Obtém o ano de nascimento da pessoa como String
		String anoNascimentoStr = pessoa.getAnoNascimento();
		
		// Converte a String para um objeto LocalDate
		LocalDate dataNascimento = LocalDate.parse(anoNascimentoStr);
		
		// Obtém a data atual
		LocalDate dataAtual = LocalDate.now();
		
		// Calcula a diferença entre as datas
		Period periodo = Period.between(dataNascimento, dataAtual);
		
		// Obtém a idade a partir do período
		int idade = periodo.getYears();
		
		return idade;
	}
}
