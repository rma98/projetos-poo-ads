package br.edu.ifpe.grade;

public class Grade<T extends Comparable<T>> {
	private String nome;
	private T nota01;
	private T nota02;
	
	public Grade(String nome,T nota01, T nota02) {
		this.nome = nome;
		this.nota01 = nota01;
		this.nota02 = nota02;
	}

	public T getNota01() {
		return nota01;
	}

	public void setNota01(T nota01) {
		this.nota01 = nota01;
	}

	public T getNota02() {
		return nota02;
	}

	public void setNota02(T nota02) {
		this.nota02 = nota02;
	}
	
}
