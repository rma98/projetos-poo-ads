package br.edu.ifpe.apoo.factory;

import br.edu.ifpe.apoo.adapter.ExternalCPFFormatValidatorAdapter;
import br.edu.ifpe.apoo.apresentacao.FachadaApresentacao;
import br.edu.ifpe.apoo.external.ExternalCPFFormatValidator;
import br.edu.ifpe.apoo.negocio.ControladorAluno;

public class AppFactory {
	
	public static FachadaApresentacao criarFachadaApresentacao() {
	    return new FachadaApresentacao();
	}

	public static ControladorAluno getInstanciaControlador() {
	    return new ControladorAluno();
	}
	
	public static ExternalCPFFormatValidatorAdapter getInstanciaExternalCPFFormatValidatorAdapter() {
		ExternalCPFFormatValidator externalValidator = new ExternalCPFFormatValidator();
		return new ExternalCPFFormatValidatorAdapter(externalValidator);
	}

}
