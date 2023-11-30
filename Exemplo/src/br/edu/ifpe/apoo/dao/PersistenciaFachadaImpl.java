package br.edu.ifpe.apoo.dao;

import java.util.List;
import java.util.ArrayList;

import br.edu.ifpe.apoo.entidades.Aluno;

public class PersistenciaFachadaImpl implements PersistenciaFachada {
	private static PersistenciaFachadaImpl INSTANCE;

	protected static PersistenciaFachadaImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new PersistenciaFachadaImpl();
			return INSTANCE;
		}
		return INSTANCE;
	}

	private List<Aluno> alunos;

	private PersistenciaFachadaImpl() {
		alunos = new ArrayList<>();
	}

	@Override
	public void inserir(Aluno aluno) {
		if (get(aluno.getId()) != null) {
			System.out.println("ID do aluno já existe na lista. Não é possivel adicionar.");
			return;
		}
		alunos.add(aluno.clone());

	}

	@Override
	public void atualizar(Aluno aluno) {
		for (int i = 0; i < alunos.size(); i++) {
			if (alunos.get(i).getId() == aluno.getId()) {
				alunos.set(i, aluno.clone());
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
				return aluno.clone();
			}
		}
		return null;
	}

}
