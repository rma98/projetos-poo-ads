package br.edu.ifpe.test;

import java.util.ArrayList;
import java.util.List;

public class Main {

	static List<Pessoa> pessoas = new ArrayList<>();
	static List<Contrato> contratos = new ArrayList<>();
	static List<Empresa> empresas = new ArrayList<>();

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Léo");
		Pessoa pessoa2 = new Pessoa("Robson");
		Pessoa pessoa3 = new Pessoa("Paulo");

		pessoas.add(pessoa);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);

		Contrato contrato = new Contrato("Contrato 1");
		Contrato contrato2 = new Contrato("Contrato 2");
		Contrato contrato3 = new Contrato("Contrato 3");

		contratos.add(contrato);
		contratos.add(contrato2);
		contratos.add(contrato3);

		pessoa.getContratos().add(contrato);
		pessoa.getContratos().add(contrato2);
		pessoa.getContratos().add(contrato3);

		pessoa2.getContratos().add(contrato);
		pessoa2.getContratos().add(contrato2);

		Empresa empresa = new Empresa("Empresa 1");
		Empresa empresa2 = new Empresa("Empresa 2");

		empresas.add(empresa);
		empresas.add(empresa2);

		contrato.getEmpresas().add(empresa);
		contrato.getEmpresas().add(empresa2);

		for (Pessoa p1 : pessoas) {
			System.out.println("Nome: " + p1.getNome());
			for (Contrato c : p1.getContratos()) {
				System.out.println("contrato: " + c.getNome());
				for (Empresa e : c.getEmpresas()) {
					System.out.println("Empresa: " + e.getNome());
				}
			}
			System.out.println("---------------------------");
		}
	}

}
