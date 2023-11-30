package br.edu.ifpe.apoo.dao;

public class AlunoDAOAbstractFactory {

	public static PersistenciaFachada getFachada() {
		
		return PersistenciaFachadaImpl.getInstance();
	}

}
