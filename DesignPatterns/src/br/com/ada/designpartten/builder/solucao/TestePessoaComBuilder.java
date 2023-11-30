package br.com.ada.designpartten.builder.solucao;

import java.time.LocalDate;

import br.com.ada.designpartten.builder.Pessoa;

public class TestePessoaComBuilder {

	public static void main(String[] args) {
		Pessoa pessoa = 
				new Pessoa.PessoaBuilder()
				.nome("Anderson")
				.sobreNome("Piotto")
				.documento("0147258369")
				.email("example@gmail.com")
				.apelido("careca")
				.dataNascimento(LocalDate.of(1985, 03, 12))
				.build();
		
		System.out.println(pessoa);
		
		StringBuilder sb = new StringBuilder() 
				.append("palavra1 ")
				.append("palavra2");
		
		System.out.println(sb);
				
	}

}
