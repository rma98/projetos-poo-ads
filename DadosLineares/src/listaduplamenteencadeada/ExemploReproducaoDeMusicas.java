package listaduplamenteencadeada;

public class ExemploReproducaoDeMusicas {

	public static void main(String[] args) {
		ReprodutorDeMusicas reprodutor = new ReprodutorDeMusicas();
		reprodutor.adicionarMusicaAListaDeReproducao("Música 1", "Artista A", 180);
		reprodutor.adicionarMusicaAListaDeReproducao("Música 2", "Artista B", 220);
		reprodutor.adicionarMusicaAListaDeReproducao("Música 3", "Artista C", 195);
		
		reprodutor.tocarMusicaAtual();
		reprodutor.tocarProximaMusica();
		reprodutor.tocarProximaMusica();
		reprodutor.tocarMusicaAnterior();
		
		reprodutor.mostrarHistóricoDeReproducao();
	}

}
