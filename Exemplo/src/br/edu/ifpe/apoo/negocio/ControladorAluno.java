package br.edu.ifpe.apoo.negocio;

import br.edu.ifpe.apoo.api.CPFFormatValidator;
import br.edu.ifpe.apoo.dao.FachadaPersistencia;
import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;
import br.edu.ifpe.apoo.factory.AppFactory;

public class ControladorAluno {
	private CPFFormatValidator cpfValidator;
	
	public ControladorAluno() {
		this.cpfValidator = AppFactory.getInstanciaExternalCPFFormatValidatorAdapter();
	}
	
	public void inserir(Aluno aluno) throws ExcecaoAlunoInvalido {
		 FachadaPersistencia.inserir(aluno);
	}
	
	public Aluno get(long id) throws ExcecaoAlunoInvalido  {
		return FachadaPersistencia.get(id);
	}
	
	public boolean remover(long id) throws ExcecaoAlunoInvalido { 
		return FachadaPersistencia.remover(id);
	}
	
	public void atualizar(Aluno aluno) throws ExcecaoAlunoInvalido {
		FachadaPersistencia.atualizar(aluno);
	}

	protected boolean isValido(Aluno aluno) throws ExcecaoAlunoInvalido {
		if (aluno == null) {
			throw new ExcecaoAlunoInvalido("Aluno nulo");
		}
		if (aluno.getId() <= 0) {
			throw new ExcecaoAlunoInvalido("ID do Aluno Inválido");
		}

		if (aluno.getNome() == null || aluno.getNome().isEmpty() || aluno.getNome().length() < 5 || aluno.getNome().length() > 100) {
			throw new ExcecaoAlunoInvalido("Nome do aluno deve ter entre 5 e 100 caracteres");
		}
		if (aluno.getCpf() == null || aluno.getCpf().isEmpty() || !cpfValidator.isValid(aluno.getCpf())) {
			throw new ExcecaoAlunoInvalido("CPF do aluno inválido");
		}
		if (aluno.getEmail() == null || aluno.getEmail().isEmpty()) {
			throw new ExcecaoAlunoInvalido("E-mail do aluno inválido");
		}
		return true;
	}
	
}
