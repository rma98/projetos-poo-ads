package br.edu.ifpe.apoo.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.apoo.entidades.Aluno;

public class AlunoDAOList implements AlunoDAO {
	private static AlunoDAOList instancia;
	
	protected static AlunoDAOList getInstancia() {
		if (instancia == null) {
			instancia = new AlunoDAOList();
		}
		return instancia;
	}
	
    private List<Aluno> alunos;

    public AlunoDAOList() {
        alunos = new ArrayList<>();
    }

    @Override
    public void inserir(Aluno aluno) {
    	if (alunoJaExiste(aluno.getId())) {
    		System.out.println("ID do aluno já existe na lista. Não é possivel adicionar.");
    		return;
    	}
        alunos.add(aluno);
    }

    @Override
    public void atualizar(Aluno aluno) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getId() == aluno.getId()) {
                alunos.set(i, aluno);
                return;
            }
        }
    }

    @Override
    public boolean remover(long id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                alunos.remove(aluno);
                return true;
            }
        }
        return false;
    }

    @Override
    public Aluno get(long id) {
        for (Aluno aluno : alunos) {
            if (aluno.getId() == id) {
                return aluno;
            }
        }
        return null;
    }
    
    private boolean alunoJaExiste(long id) {
    	for (Aluno aluno : alunos) {
    		if (aluno.getId() == id) {
    			return true;
    		}
    	}
    	return false;
    }

}
