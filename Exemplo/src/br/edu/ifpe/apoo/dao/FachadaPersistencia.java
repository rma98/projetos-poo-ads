package br.edu.ifpe.apoo.dao;

import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;

public class FachadaPersistencia {
	private static PersistenciaFachada persistenciaFachada;
	
	static {
        persistenciaFachada = PersistenciaFachadaImpl.getInstance();
    }

    public static void inserir(Aluno aluno) throws ExcecaoAlunoInvalido {
        persistenciaFachada.inserir(aluno);
    }

    public static void atualizar(Aluno aluno) throws ExcecaoAlunoInvalido {
        persistenciaFachada.atualizar(aluno);
    }

    public static boolean remover(long id) throws ExcecaoAlunoInvalido {
        return persistenciaFachada.remover(id);
    }

    public static Aluno get(long id) throws ExcecaoAlunoInvalido {
        return persistenciaFachada.get(id);
    }
}
