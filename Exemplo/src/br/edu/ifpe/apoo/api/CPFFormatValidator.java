package br.edu.ifpe.apoo.api;

import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;

public interface CPFFormatValidator {
	boolean isValid(String cpf) throws ExcecaoAlunoInvalido;
}
