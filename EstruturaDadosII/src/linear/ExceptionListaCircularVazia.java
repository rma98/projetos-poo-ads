package linear;

public class ExceptionListaCircularVazia extends Exception {
	
	public ExceptionListaCircularVazia() {
		super("Lista circular está vazia");
	}
	
	public ExceptionListaCircularVazia(String mensagem) {
		super(mensagem);
	}
}
