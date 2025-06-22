import java.util.*;
public class q6 {
    private int numVertices;
    private int[][] adjMatrix;
    private LinkedList<Integer>[] adjList;
    public q6(int numVertices) {
        this.numVertices = numVertices;
        // Initialize adjacency matrix
        adjMatrix = new int[numVertices][numVertices];
        // Initialize adjacency list
        adjList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    // Add edge (undirected graph)
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1;
        adjList[src].add(dest);
        adjList[dest].add(src);
    }
    // Display adjacency matrix
    public void displayMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Display adjacency list
    public void displayList() {
        System.out.println("\nAdjacency List:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");
            for (Integer node : adjList[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }
    // Main method
    public static void main(String[] args) {
        int vertices = 5;
        q6 g = new q6(vertices);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        // Display the graph
        g.displayMatrix();
        g.displayList();
    }
}
/* output:-
   Adjacency Matrix:
   0 1 0 0 1 
   1 0 1 1 1
   0 1 0 1 0
   0 1 1 0 1
   1 1 0 1 0

   Adjacency List:
   0 -> 1 4
   1 -> 0 2 3 4
   2 -> 1 3
   3 -> 1 2 4
   4 -> 0 1 3 
*/
