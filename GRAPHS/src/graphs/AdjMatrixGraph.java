package graphs;

public class AdjMatrixGraph {
	int vertices;
	int matrix[][];
	
	public AdjMatrixGraph(int vertices) {
		this.vertices = vertices;
		matrix=new int[vertices][vertices];
	}
	
	void addEdge(int source, int destination) {
		matrix[source][destination] = 1;
		matrix[destination][source]= 1;	
	}
	
	void printGraph() {
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
