package listaduplamenteencadeada;

public class Musica {
	String titulo;
	String artista;
	int duracao;

	public Musica(String titulo, String artista, int duracao) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracao = duracao;
	}

	public String toString() {
		return titulo + " - " + artista + " (" + duracao + "s)";
	}

}
