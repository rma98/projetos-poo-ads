package br.edu.ifpe.apoo.dao;

import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;

public interface PersistenciaFachada  {
	void inserir(Aluno aluno) throws ExcecaoAlunoInvalido;
    void atualizar(Aluno aluno) throws ExcecaoAlunoInvalido;
    boolean remover(long id) throws ExcecaoAlunoInvalido;
    Aluno get(long id) throws ExcecaoAlunoInvalido; 
}	
