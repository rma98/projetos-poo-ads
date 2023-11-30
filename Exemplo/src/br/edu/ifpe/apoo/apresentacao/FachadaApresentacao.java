package br.edu.ifpe.apoo.apresentacao;

import java.util.Scanner;
import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;
import br.edu.ifpe.apoo.negocio.ControladorAluno;
import br.edu.ifpe.apoo.negocio.FachadaNegocio;

public class FachadaApresentacao {
	
    private final FachadaNegocio fachadaNegocio;
    
    public FachadaApresentacao() {
    	this.fachadaNegocio = new FachadaNegocio();
	}

    public void exibirMenu() throws ExcecaoAlunoInvalido {
    	Scanner scanner = new Scanner(System.in);
    	
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
				inserir(scanner);
				break;
			case 2:
				consultar(scanner);
				break;
			case 3:
				remover(scanner);
				break;
			case 4:
				atualizar(scanner);
				break;
			default:
				System.err.println("Opção inválida. Tente novamente.");
				break;
			}
		}
    	
    	
    }

    private void inserir(Scanner scanner) {
        System.out.println("---------------------------");
        System.out.println("Digite o id do aluno");
        long id = Long.parseLong(scanner.nextLine());
        System.out.println("Digite o nome do aluno");
        String nome = scanner.nextLine();
        System.out.println("Digite o cpf do aluno");
        String cpf = scanner.nextLine();
        System.out.println("Digite o e-mail do aluno");
        String email = scanner.nextLine();

        try {
            fachadaNegocio.inserir(id, nome, cpf, email);
            System.out.println("Aluno inserido com sucesso!");
        } catch (ExcecaoAlunoInvalido ex) {
            System.err.println("Erro ao inserir o aluno: " + ex.getMessage());
        }
    }
    
    private void consultar(Scanner scanner) throws ExcecaoAlunoInvalido {
    	System.out.println("Digite o ID do aluno a ser consultado");
        long id = Long.parseLong(scanner.nextLine());

        Aluno aluno = fachadaNegocio.get(id);

        if (aluno != null) {
            System.out.println("Informações do aluno");
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("CPF: " + aluno.getCpf());
            System.out.println("E-mail: " + aluno.getEmail());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
    
    private void remover(Scanner scanner) throws ExcecaoAlunoInvalido {
    	System.out.println("Digite o ID do aluno a ser removido");
        long id = Long.parseLong(scanner.nextLine());

        if (fachadaNegocio.remover(id)) {
            System.out.println("Aluno removido com sucesso!");
        } else {
            System.out.println("Aluno não encontrado ou não foi possível remover.");
        }
    }
    
    public void atualizar(Scanner scanner) {
    	 System.out.println("Digite o ID do aluno a ser atualizado");
         long id = Long.parseLong(scanner.nextLine());

         System.out.println("Digite o novo nome do aluno");
         String novoNome = scanner.nextLine();

         System.out.println("Digite o novo CPF do aluno");
         String novoCPF = scanner.nextLine();

         System.out.println("Digite o novo e-mail do aluno");
         String novoEmail = scanner.nextLine();
         
         try {
             fachadaNegocio.atualizar(id, novoNome, novoCPF, novoEmail);
             System.out.println("Aluno atualizado com sucesso!");
         } catch (ExcecaoAlunoInvalido ex) {
             System.err.println("Erro ao atualizar o aluno: " + ex.getMessage());
         } catch (NumberFormatException ex) {
             System.err.println("Formato inválido para o ID do aluno. Certifique-se de inserir um número.");
         }
    }

}
