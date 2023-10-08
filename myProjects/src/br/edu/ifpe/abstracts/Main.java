package br.edu.ifpe.abstracts;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continuar = "1";
		
		while ("1".equals(continuar)) {
			System.out.println("Escolha uma opção: ");
			System.out.println("1- Imprimir dados\n2- Aumentar salário\n0- Sair");
			String opc = scanner.nextLine();
			
			switch (opc) { 
			case "1":
				imprimirDadosMenu(scanner);
				break;
			case "2":
				aumentarSalarioMenu(scanner);
				break;
			case "0":
				System.out.println("Você saiu do programa.");
				continuar = "0";
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
		scanner.close();
	}
	
	static void imprimirDadosMenu(Scanner scanner) {
		System.out.println("Escolha uma opção:");
		System.out.println("1- Imprimir dados do Gerente\n2- Imprimir dados do Programador\n0- Voltar");
		String opc = scanner.nextLine();
		switch (opc) {
		case "1":
			Gerente gerente = new Gerente("Maria", 20000.0);
			imprimirDados(gerente);
			break;
		case "2":
			Programador programador = new Programador("Marcos", 10000.0);
			imprimirDados(programador);
			break;
		case "0":
			System.out.println("Voltando para o menu principal.");
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
	
	static void aumentarSalarioMenu(Scanner	scanner) {
		System.out.println("Escolha uma opção:");
		System.out.println("1- Aumenta salário do Gerente\n2- Aumentar salário do Programador\n0- Voltar");
		String opc = scanner.nextLine();
		switch (opc) {
		case "1":
			Gerente gerente = new Gerente("Maria", 20000.0);
			aumentarSalario(gerente);
			break;
		case "2":
			Programador programador = new Programador("Marcos", 10000.0);
			aumentarSalario(programador);
			break;
		case "0":
			System.out.println("Voltando para o menu principal.");
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
	static void imprimirDados(Funcionario funcionario) {
		String nome = funcionario.getNome();
		Double salarioAtual = funcionario.getSalario();
		System.out.println(funcionario.getClass().getSimpleName() + ": " + nome);
		System.out.println("Salário: " + salarioAtual);
	}
	
	static void aumentarSalario(Funcionario funcionario) {
		if (funcionario instanceof Gerente) {
			Gerente gerente = (Gerente) funcionario;
			gerente.aumentarSalario();
		} else if (funcionario instanceof Programador) {
			Programador programador = (Programador) funcionario;
			programador.aumentarSalario();
		}
		System.out.println("Salário após aumento: " + funcionario.getSalario());
	}

}
