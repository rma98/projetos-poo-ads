package br.com.ada.designpartten.proxy.solucao;

import java.time.LocalDate;

import br.com.ada.designpartten.builder.Pessoa;
import br.com.ada.designpartten.proxy.PessoaRepository;
import br.com.ada.designpartten.proxy.PessoaService;

public class TestePessoaComProxy {

	public static void main(String[] args) {
		PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
		NovoPessoaRepositoryProxy novoPessoaRepositoryProxy = new NovoPessoaRepositoryProxy();
		PessoaService pessoaService = new PessoaService(pessoaRepositoryProxy);
		
		Pessoa pessoa = new Pessoa.PessoaBuilder()
				.sobreNome("Piotto")
				.dataNascimento(LocalDate.of(1985, 03, 12))
				.nome("Anderson")
				.apelido("Careca")
				.documento("3546184889")
				.build();
		
		pessoaService.save(pessoa);
		
		Pessoa pessoaRetornada = pessoaService.findById(1L);
		System.out.println(pessoaRetornada);
		
		Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
		System.out.println(pessoaRetornadaCache);
	}
	
}