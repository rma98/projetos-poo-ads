package linear;

public class ExceptionFilaCheia extends Exception {
	
	public ExceptionFilaCheia() {
		super("Fila está cheia");
	}
	
	public ExceptionFilaCheia(String mensagem) {
		super(mensagem);
	}
}
