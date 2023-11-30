package br.edu.ifpe.apoo.external;

public class ExternalCPFFormatValidator {
	public boolean validateCPFFomrart(String cpf) {
		cpf = cpf.replaceAll("[^\\d]", "");
		
		if (cpf.length() != 11) {
			return false;
		}
		
		int d1 = calcularDigitoVerificador(cpf.substring(0, 9));
		
		int d2 = calcularDigitoVerificador(cpf.substring(0, 9) + d1);
		
		return cpf.endsWith(Integer.toString(d1) + Integer.toString(d2));
	}
	
	private int calcularDigitoVerificador(String parteCpf) {
		int soma = 0;
		int peso = parteCpf.length() + 1;
		
		for (int i =0; i < parteCpf.length(); i++) {
			soma += Integer.parseInt(parteCpf.substring(i, i + 1)) * peso;
			peso --;
		}
		
		int resto = soma % 11;
		return (resto < 2) ? 0 : (11 - resto);
	}
}
