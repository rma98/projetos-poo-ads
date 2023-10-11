package listaduplamenteencadeada;

import java.util.LinkedList;

public class ReprodutorDeMusicas {
	private LinkedList<Musica> listaDeReproducao = new LinkedList<>();
	private LinkedList<Musica> historicoDeReproducao = new LinkedList<>();
	private int indiceDaFaixaAtual = 0;
	
	public void adicionarMusicaAListaDeReproducao(String titulo, String artista, int duracao) {
        Musica novaMusica = new Musica(titulo, artista, duracao);
        listaDeReproducao.add(novaMusica);
    }
	
	public void tocarMusicaAtual() {
        if (indiceDaFaixaAtual >= 0 && indiceDaFaixaAtual < listaDeReproducao.size()) {
            Musica musicaAtual = listaDeReproducao.get(indiceDaFaixaAtual);
            historicoDeReproducao.add(musicaAtual);
            System.out.println("\nTocando agora: " + musicaAtual);
        }
    }
	
	public void tocarProximaMusica() {
        if (indiceDaFaixaAtual < listaDeReproducao.size() - 1) {
            indiceDaFaixaAtual++;
            tocarMusicaAtual();
        }
    }
	
	public void tocarMusicaAnterior() {
        if (indiceDaFaixaAtual > 0) {
            indiceDaFaixaAtual--;
            tocarMusicaAtual();
        }
    }
	
	public void mostrarHistóricoDeReproducao() {
        System.out.println("\nHistórico de Reprodução:");
        for (Musica musica : historicoDeReproducao) {
            System.out.println("\n" + musica);
        }
    }
}
