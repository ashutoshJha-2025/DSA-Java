package Algorithm;
import java.util.*;

<<<<<<< HEAD
public class Dijkstras extends createWeightedGraph{
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph3(graph);   
=======
public class Dijkstras extends creatingGraph_Weighted{
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        directedGraph1(graph);   
>>>>>>> 5df93d4 (update)
        /*
              ->1 ----> 3
             /  |       ^ \
            0   |       |  --> 5 --> 6
             \  !       | /
              ->2 ----> 4
        */
        int shortestDistance = djAlgo(graph, 0, 6, v);
        System.out.println("Shortest distance from 0 to 6: " + shortestDistance);
    }

<<<<<<< HEAD
    public static int djAlgo(ArrayList<Edge>[] graph, int src, int dest, int v) {
=======
    private static int djAlgo(ArrayList<Edge>[] graph, int src, int dest, int v) {
>>>>>>> 5df93d4 (update)
        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.distance));
        pq.add(new Edge(src, src, 0)); 

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int currNode = current.dest;
            int currDist = current.distance;

            if (currNode == dest) {
                return currDist; 
            }

            for (Edge edge : graph[currNode]) {
                int neighbor = edge.dest;
                int newDist = currDist + edge.distance;

                if (newDist < dist[neighbor]) {
                    dist[neighbor] = newDist;
                    pq.add(new Edge(currNode, neighbor, newDist));
                }
            }
        }

        return -1; // If destination is unreachable
    }
}