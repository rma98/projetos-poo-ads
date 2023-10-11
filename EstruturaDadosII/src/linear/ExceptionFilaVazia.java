package linear;

public class ExceptionFilaVazia extends Exception {
	
	public ExceptionFilaVazia() {
		super("Fila está vazia");
	}
	
	public ExceptionFilaVazia(String mensagem) {
		super(mensagem);
	}
}
