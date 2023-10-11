package linear;

public class ExceptionPilhaCheia extends Exception {
	
	public ExceptionPilhaCheia() {
		super("Pilha está cheia");
	}
	
	public ExceptionPilhaCheia(String mensagem) {
		super(mensagem);
	}
}
