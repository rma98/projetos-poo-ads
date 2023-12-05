package br.com.ifpe.Grafo;

public class Main {
    public static void main(String[] args) {
        
        Grafo grafo = new Grafo(5);

        grafo.inserirAresta(1, 2);
        grafo.inserirAresta(1, 3);
        grafo.inserirAresta(2, 4);
        grafo.inserirAresta(3, 4);
        grafo.inserirAresta(4, 5);

        grafo.imprimirVerticesEArestas();
        grafo.imprimirMatriz();

        
        int VerticeOrigem = 2, verticeDestino =4;
        System.out.println("\nExiste aresta entre " + VerticeOrigem + " e " + verticeDestino + ": " + grafo.existeAresta(VerticeOrigem, verticeDestino));
        System.out.println();

        
        int vertice = 2;
        grafo.verticesAdjacentes(vertice);
        System.out.println();

        
        int valor1 = 1;
        int valor2 = 3;
        grafo.removerAresta(valor1, valor2);
        System.out.println("Aresta removida: ("+ valor1 + "," + valor2 + ")" );
        System.out.println();
        
        grafo.imprimirVerticesEArestas();
        grafo.imprimirMatriz();

        
        System.out.println("\nNúmero de vértices do grafo: " + grafo.numeroVertices());
    }
}
