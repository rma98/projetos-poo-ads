package br.edu.ifpe.apoo.apresentacao;

import java.util.Scanner;

import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;
import br.edu.ifpe.apoo.negocio.ControladorAluno;

public class AlunoApresentacao {
	
	ControladorAluno controlador = new ControladorAluno();
	Scanner scanner = new Scanner(System.in);
	
	public void exibirMenu() throws ExcecaoAlunoInvalido {
		
		while (true) {
			System.out.println("---------------------------");
			System.out.println("Digite a opção desejada:");
			System.out.println("---------------------------");
			System.out.println("0 - sair do programa");
			System.out.println("1 - inserir um aluno");
			System.out.println("2 - consultar um aluno");
			System.out.println("3 - remover um aluno");
			System.out.println("4 - atualizar um aluno");
			System.out.println("---------------------------");
			
			int opcao = Integer.parseInt(scanner.nextLine());
			
			switch (opcao) {
			case 0:
				System.err.println("Saindo do programa...");
				return;
			case 1:
				inserir(scanner, controlador);
				break;
			case 2:
				consultar(scanner, controlador);
				break;
			case 3:
				remover(scanner, controlador);
				break;
			case 4:
				atualizar(scanner, controlador);
				break;
			default:
				System.err.println("Opção inválida. Tente novamente.");
				break;
			}
		}
		
	}
	
	private void inserir(Scanner scanner, ControladorAluno controlador) throws ExcecaoAlunoInvalido {
		System.out.println("---------------------------");
		System.out.println("Digite o id do aluno");
		long id = Long.parseLong(scanner.nextLine());
		System.out.println("Digite o nome do aluno");
		String nome = scanner.nextLine();
		System.out.println("Digite o cpf do aluno");
		String cpf = scanner.nextLine();
		System.out.println("Digite o e-mail do aluno");
		String email = scanner.nextLine();
		
		Aluno aluno = 
				new Aluno.AlunoBuilder()
				.id(id)
				.nome(nome)
				.cpf(cpf)
				.email(email)
				.build();
		
		try {
			controlador.inserir(aluno);
			System.out.println("Aluno inserido com sucesso!");
		} catch (ExcecaoAlunoInvalido ex) {
			System.err.println("Erro ao inserir o aluno: " + ex.getMessage());
		}
		
	}
	
	private void consultar(Scanner scanner, ControladorAluno controlador) throws ExcecaoAlunoInvalido {
		System.out.println("Digite o ID do aluno a ser consultado");
		long id = Long.parseLong(scanner.nextLine());
		
		Aluno aluno = controlador.get(id);
		
		if (aluno != null) {
			System.out.println("Informações do aluno");
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("CPF: " + aluno.getCpf());
			System.out.println("E-mail: " + aluno.getEmail());
		} else {
			System.out.println("Aluno não encontrado.");
		}

	}
	
	public void remover(Scanner scanner, ControladorAluno controlador) throws ExcecaoAlunoInvalido {
		System.out.println("Digite o ID do aluno a ser removido");
		long id = Long.parseLong(scanner.nextLine());
		
		if (controlador.remover(id)) {
			System.out.println("Aluno removido com sucesso!");
		} else {
			System.out.println("Aluno não encontrado ou não foi possível remover.");
		}
	}
	
	public void atualizar(Scanner scanner, ControladorAluno controlador) throws ExcecaoAlunoInvalido {
		System.out.println("Digite o ID do aluno a ser atualizado");
		long id = Long.parseLong(scanner.nextLine());
		
		Aluno aluno = controlador.get(id);
		
		if (aluno != null) {
			System.out.println("Digite o novo nome do aluno");
			String novoNome = scanner.nextLine();
			aluno.setNome(novoNome);
			
			System.out.println("Digite o novo CPF do aluno");
			String novoCPF = scanner.nextLine();
			aluno.setCpf(novoCPF);
			
			System.out.println("Digite o novo e-mail do aluno");
			String novoEmail = scanner.nextLine();
			aluno.setEmail(novoEmail);
			
			try {
				controlador.atualizar(aluno);
				System.out.println("Aluno atualizado com sucesso!");
			} catch (ExcecaoAlunoInvalido ex) {
				System.err.println("Erro ao atualizar o aluno." + ex.getMessage());
			}
		} else {
			System.out.println("Aluno não encontrado.");
		}
	}
}
