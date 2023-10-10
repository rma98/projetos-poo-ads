package br.edu.ifpe.person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppPrincipal {
	
	static List<Empresa> empresas = new ArrayList<>();
	static List<Pessoa> funcionarios = new ArrayList<>();

	public static void main(String[] args) {
		Departamento departamento = new Departamento("ADS");
		
		Empresa empresa = new Empresa("LeoSoft S/A", "123456789", departamento);
		
		empresas.add(empresa);
		
		Pessoa pessoa = new Funcionario("Léo", 50, "M", "Professor", 15000.0);
		Pessoa pessoa2 = new Funcionario("Robson", 24, "M", "Aluno", 10000.0);
		Pessoa pessoa3 = new Funcionario("Maria", 33, "F", "Diretora", 30000.0);
		
		Funcionario funcionario = (Funcionario) pessoa;
		Funcionario funcionario2 = (Funcionario) pessoa2;
		Funcionario funcionario3 = (Funcionario) pessoa3;
		
		empresa.getDepartamento().getFuncionarios().add(funcionario);
		empresa.getDepartamento().getFuncionarios().add(funcionario2);
		empresa.getDepartamento().getFuncionarios().add(funcionario3);
		
		for (Empresa e : empresas) {
			for (Pessoa p : e.getDepartamento().getFuncionarios()) {
				if (p instanceof Funcionario) {
					Funcionario fun = (Funcionario) p;
					System.out.println("--------------------------");
					System.out.println("Cargo: " + fun.getCargo());
					System.out.println("Salário: " + fun.getSalario());
				}
				System.out.println("Nome: " + p.getNome());
				System.out.println("Idade: " + p.getIdade());
				System.out.println("Gênero: " + p.getGenero());
			}
			System.out.println("--------------------------");
			System.out.println("Nome do Departamento: " + e.getDepartamento().getNome());
			System.out.println("Nome da Empresa: " + e.getNome());
			System.out.println("CNPJ: " + e.getCnpj());
		}
		System.out.println("--------------------------");
	}

}
