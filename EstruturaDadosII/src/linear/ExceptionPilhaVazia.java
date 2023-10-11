package linear;

public class ExceptionPilhaVazia extends Exception {
	
	public ExceptionPilhaVazia() {
		super("Pilha está vazia");
	}
	
	public ExceptionPilhaVazia(String mensagem) {
		super(mensagem);
	}
}
