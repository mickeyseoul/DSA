package datastructures.graph;

public class Main {

	public static void main(String[] args) {
		
		Graph myGraph = new Graph();
		
//		myGraph.addVertex("A");
//		myGraph.addVertex("B");
//		myGraph.addVertex("C");
//		
//		myGraph.addEdge("A", "B");
//		myGraph.addEdge("A", "C");
//		myGraph.addEdge("B", "C");
//		
//		myGraph.removeEdge("A", "B");
//		
//		myGraph.printGraph();
		
		// removeVertex()
		myGraph.addVertex("A");
		myGraph.addVertex("B");
		myGraph.addVertex("C");
		myGraph.addVertex("D");
		
		myGraph.addEdge("A", "B");
		myGraph.addEdge("A", "C");
		myGraph.addEdge("A", "D");
		myGraph.addEdge("B", "D");
		myGraph.addEdge("C", "D");
		
		myGraph.removeVertex("D");
		
		myGraph.printGraph();
		
		/*
		 * {A=[B, C, D], B=[A, D], C=[A, D], D=[A, B, C]}
		 * 
		 * {A=[B, C], B=[A], C=[A]}
		 */
	}

}
