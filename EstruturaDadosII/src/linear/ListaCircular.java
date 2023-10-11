package linear;

public class ListaCircular {
	private No inicio;

	public ListaCircular() {
		this.inicio = null;
	}

	public void inserir(int valor) {
		No novoNo = new No(valor);

		if (inicio == null) {
			novoNo.setProximo(novoNo);
			novoNo.setAnterior(novoNo);
			inicio = novoNo;
		} else {
			No ultimo = inicio.getAnterior();

			novoNo.setProximo(inicio);
			novoNo.setAnterior(ultimo);

			inicio.setAnterior(novoNo);
			ultimo.setProximo(novoNo);
		}
	}

	public void inserirNoMeio(int valor, int posicao) {
		No novoNo = new No(valor);

		if (inicio != null) {
			No atual = inicio;
			int count = 0;

			while (count < posicao - 1) {
				atual = atual.getProximo();
				count++;
			}

			No proximo = atual.getProximo();

			novoNo.setProximo(proximo);
			novoNo.setAnterior(atual);
			atual.setProximo(novoNo);
			proximo.setAnterior(novoNo);
		}
	}

	public void remover() throws ExceptionListaCircularVazia {
		if (inicio != null) {
			No ultimo = inicio.getAnterior();

			if (inicio == ultimo) {
				inicio = null;
			} else {
				No novoInicio = inicio.getProximo();

				novoInicio.setAnterior(ultimo);
				ultimo.setProximo(novoInicio);

				inicio = novoInicio;
			}
		} else {
			throw new ExceptionListaCircularVazia();
		}
	}

	public int getInicioValor() throws ExceptionListaCircularVazia {
		if (inicio != null) {
			return inicio.getValor();
		} else {
			throw new ExceptionListaCircularVazia();
		}
	}
}
