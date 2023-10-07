package br.edu.ifpe.person;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {
	
	static List<Funcionario> funcionarios = new ArrayList<>();

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Léo", 50, "M", "Professor", 15000.0);
		Funcionario funcionario2 = new Funcionario("Robson", 24, "M", "Aluno", 10000.0);
		Funcionario funcionario3 = new Funcionario("Maria", 33, "F", "Diretora", 30000.0);
		funcionarios.add(funcionario);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		Departamento departamento = new Departamento("ADS");
		departamento.adicionarFuncionario(funcionario);
		departamento.setFuncionarios(funcionarios);
		Empresa empresa = new Empresa("LeoSoft S/A", "123456789", departamento);
		
		for (Funcionario func : empresa.getDepartamento().getFuncionarios()) {
			System.out.println("-------------------------------");
			System.out.println("Cargo: " + func.getCargo());
			System.out.println("nome: " + func.getNome());
			System.out.println("Idade: " + func.getIdade());
			System.out.println("Gênero: " + func.getGenero());
			System.out.println("-------------------------------");
			System.out.println("Nome do Departamento: " + empresa.getDepartamento().getNome());
			System.out.println("Nome da Empresa: " + empresa.getNome());
			System.out.println("CNPJ: " + empresa.getCnpj());
		}
		
	}

}
