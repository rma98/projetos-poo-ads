package br.edu.ifpe.apoo.adapter;

import br.edu.ifpe.apoo.api.CPFFormatValidator;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;
import br.edu.ifpe.apoo.external.ExternalCPFFormatValidator;

public class ExternalCPFFormatValidatorAdapter implements CPFFormatValidator {
	private ExternalCPFFormatValidator externalValidator;
	
	public ExternalCPFFormatValidatorAdapter(ExternalCPFFormatValidator externalValidator) {
		this.externalValidator = externalValidator;
	}

	@Override
	public boolean isValid(String cpf) throws ExcecaoAlunoInvalido {
		if (externalValidator == null) {
			throw new ExcecaoAlunoInvalido("External validator não foi inicializado corretamente.");
		}
		return externalValidator.validateCPFFomrart(cpf);
	}
	
}
