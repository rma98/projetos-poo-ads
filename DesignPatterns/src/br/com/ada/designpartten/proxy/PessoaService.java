package br.com.ada.designpartten.proxy;

import br.com.ada.designpartten.builder.Pessoa;
import br.com.ada.designpartten.proxy.solucao.PessoaRepositoryProxy;
import br.com.ada.designpartten.proxy.solucao.ProxyPessoa;

public class PessoaService {
	private ProxyPessoa proxyPessoa;
	
	public PessoaService(ProxyPessoa proxyPessoa) {
		this.proxyPessoa = proxyPessoa;
	}
	
	public void save(Pessoa pessoa) {
		proxyPessoa.save(pessoa);
	}
	
	public Pessoa findById(Long id) {
		return proxyPessoa.findById(id);
	}
}