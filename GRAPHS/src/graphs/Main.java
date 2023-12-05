package graphs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number of vertices");
		
		int v = s.nextInt();
		
		AdjMatrixGraph amg = new AdjMatrixGraph(v);
		
		System.out.println("Enter the number of edges");
		int e = s.nextInt();
		
		for (int i = 0; i < e; i++) {
			System.out.println("Enter the source vertex");
			int a = s.nextInt();
			
			System.out.println("Enter the destination vertex");
			int b = s.nextInt();
			
			amg.addEdge(a, b);
		}
		System.out.println();
		amg.printGraph();
	}
}
