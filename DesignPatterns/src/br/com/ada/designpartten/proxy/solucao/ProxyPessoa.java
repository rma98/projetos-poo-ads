package br.com.ada.designpartten.proxy.solucao;

import br.com.ada.designpartten.builder.Pessoa;

public interface ProxyPessoa {
	void save(Pessoa pessoa);
	Pessoa findById(Long id);
}
