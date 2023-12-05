package br.com.ifpe.Grafo;

import java.util.Arrays;

class Grafo {
    private int[][] matrizAdjacencia;
    private int numVertices;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        this.matrizAdjacencia = new int[numVertices][numVertices];
    }

    
    public void inserirAresta(int origem, int destino) {
        matrizAdjacencia[origem - 1][destino - 1] = 1;
        matrizAdjacencia[destino - 1][origem - 1] = 1;
    }

    public void removerAresta(int origem, int destino) {
        matrizAdjacencia[origem - 1][destino - 1] = 0;
        matrizAdjacencia[destino - 1][origem - 1] = 0;
    }

    public boolean existeAresta(int origem, int destino) {
        return matrizAdjacencia[origem - 1][destino - 1] == 1;
    }

    public void verticesAdjacentes(int vertice) {
        System.out.print("Vértices adjacentes a " + vertice + ": ");
        for (int i = 0; i < numVertices; i++) {
            if (matrizAdjacencia[vertice - 1][i] == 1) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }

    public void imprimirVerticesEArestas() {
        System.out.println("Vertices e Arestas:");
        System.out.print("V = { ");
        for (int i = 0; i < numVertices; i++) {
            System.out.print((i + 1) + (i == numVertices - 1 ? "" : ", "));
        }
        System.out.println("}");

        System.out.print("E = { ");
        for (int i = 0; i < numVertices; i++) {
            for (int j = i + 1; j < numVertices; j++) {
                if (matrizAdjacencia[i][j] == 1) {
                    System.out.print("(" + (i + 1) + "," + (j + 1) + ")");
                    if (j < numVertices - 1) {
                        System.out.print(", ");
                    }
                }
            }
        }
        System.out.println(" }");
        System.out.println();
    }

    
    public void imprimirMatriz() {
        System.out.println("Matriz de Adjacência do Grafo:");
        for (int i = 0; i < numVertices; i++) {
            System.out.println(Arrays.toString(matrizAdjacencia[i]));
        }
    }

    
    public int numeroVertices() {
        return numVertices;
    }
}
