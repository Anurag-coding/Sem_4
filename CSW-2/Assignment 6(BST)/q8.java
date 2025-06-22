import java.util.*;
public class q8 {
    private int numVertices;
    private LinkedList<Integer>[] adjList;
    public q8(int numVertices) {
        this.numVertices = numVertices;
        adjList = new LinkedList[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    // Method to add an edge (undirected)
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src); // Remove this line for directed graph
    }
    // Method to display the adjacency list
    public void displayAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
    // Breadth-First Search (BFS)
    public void bfs(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        visited[startVertex] = true;
        queue.offer(startVertex);
        System.out.print("BFS traversal starting from vertex " + startVertex + ": ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");
            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();
        q8 graph = new q8(vertices);
        System.out.println("Enter edges (src dest):");
        for (int i = 0; i < edges; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            graph.addEdge(src, dest);
        }
        graph.displayAdjList();
        System.out.print("Enter starting vertex for BFS: ");
        int start = sc.nextInt();
        graph.bfs(start);
        sc.close();
    }
}
/* output:-
   Enter number of vertices: 5 
   Enter number of edges: 6
   Enter edges (src dest):
   0 1
   0 2
   0 3
   0 4
   2 3
   4 2
   Adjacency List:
   0 -> 1 2 3 4 
   1 -> 0
   2 -> 0 3 4
   3 -> 0 2
   4 -> 0 2
   Enter starting vertex for BFS: 2
   BFS traversal starting from vertex 2: 2 0 3 4 1 
*/
