package br.edu.ifpe.apoo.negocio;

import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;
import br.edu.ifpe.apoo.factory.AppFactory;

public class FachadaNegocio {
	private final ControladorAluno controlador;

    public FachadaNegocio() {
        this.controlador = AppFactory.getInstanciaControlador();
    }
    
    public void inserir(long id, String nome, String cpf, String email) throws ExcecaoAlunoInvalido {
    	Aluno aluno = new Aluno.AlunoBuilder()
                .id(id)
                .nome(nome)
                .cpf(cpf)
                .email(email)
                .build();
    	
        if (controlador.isValido(aluno)) {
            controlador.inserir(aluno.clone());
        } else {
            throw new ExcecaoAlunoInvalido("Aluno inválido");
        }
    }

    public Aluno get(long id) throws ExcecaoAlunoInvalido {
    	Aluno aluno = controlador.get(id);
        return (aluno != null) ? aluno.clone() : null;
    }

    public boolean remover(long id) throws ExcecaoAlunoInvalido {
        return controlador.remover(id);
    }

    public void atualizar(long id, String novoNome, String novoCPF, String novoEmail) throws ExcecaoAlunoInvalido {
    	Aluno alunoOriginal = controlador.get(id);
    	
    	if (alunoOriginal != null) {
    		Aluno alunoAtualizado = alunoOriginal.clone();
    		alunoAtualizado.setNome(novoNome);
    		alunoAtualizado.setCpf(novoCPF);
    		alunoAtualizado.setEmail(novoEmail);

            controlador.atualizar(alunoAtualizado);
        } else {
            throw new ExcecaoAlunoInvalido("Aluno não encontrado.");
        }
    }
}
