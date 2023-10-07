package br.edu.ifpe.contato;

import java.util.Scanner;

import br.edu.ifpe.contato.Contato;

public class MainAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner scanner = new Scanner(System.in);

		String continar = "1"; // Inicialmente, pernite entrar no menu

		while ("1".equals(continar)) {
			System.out.println("Digite: \n1- Adicionar\n2- Consultar\n3- Alterar\n4- Excluir\n5- Sair:");
			String opc = scanner.nextLine();

			switch (opc) {

			case "1":
				System.out.println("Digite o nome: ");
				String nome = scanner.nextLine();

				System.out.println("Digite o telefone: ");
				String telefone = scanner.nextLine();
				
				if (agenda.consultarContato(nome) != null || agenda.consultarContato(telefone) != null) {
					System.out.println("Contato com o mesmo nome ou telefone já existe. Não pode ser adicionado.");
				} else {
					Contato contato = new Contato(nome, telefone);
					agenda.adicionarContato(contato);
					System.out.println("Contato adicionado com sucesso.");
				}
				break;
			case "2":
				System.out.println("Digite o nome do contato: ");
				nome = scanner.nextLine();
				Contato consulta = agenda.consultarContato(nome);
				if (consulta != null) {
					System.out.println("Telefone de " + nome + ": " + consulta.getTelefone());
				} else {
					System.out.println("Contato não encontrado.");
				}
				break;
			case "3":
				System.out.println("Digite o nome do contato: ");
				nome = scanner.nextLine();
				Contato contatoExistente = agenda.consultarContato(nome);
				if (contatoExistente != null) {
					System.out.println("Digite o novo nome (ou pressione Enter para mnater o nome atual): ");
					String novoNome = scanner.nextLine();
					System.out.println("Digite o novo telefone (ou pressione Enter para manter o telefone atual): ");
					String novoTelefone = scanner.nextLine();

					if (!novoNome.isEmpty() || !novoTelefone.isEmpty()) {
						agenda.alterarContato(nome, novoNome.isEmpty() ? nome : novoNome, novoTelefone.isEmpty() ? contatoExistente.getTelefone() : novoTelefone);
						System.out.println("Contato alterado com sucesso.");
					} else {
						System.out.println("Nenhum campo foi alterado.");
					}
				} else {
					System.out.println("Contato não encontrado.");
				}
				break;
			case "4":
				System.out.println("Digite o nome do contato: ");
				nome = scanner.nextLine();
				if (agenda.excluirContato(nome)) {
					System.out.println("Contato excluído com sucesso.");
				} else {
					System.out.println("Contato não encontrado.");
				}
				break;
			case "5":
				System.out.println("Você saiu do menu.");
				continar = "0";
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			// Após cada operação, pergunte se deseja continuar
			System.out.println("Deseja continuar no menu? (1-Sim, 0-Sair)");
			continar = scanner.nextLine();
		} 
		scanner.close();
	}
}
