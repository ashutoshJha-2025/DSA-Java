package Algorithms;
import java.util.*;

public class Dijkstras extends creatingGraph_Weighted{
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        directedGraph1(graph);   
        /*
              ->1 ----> 3
             /  |       ^ \
            0   |       |  --> 5 --> 6
             \  v       | /
              ->2 ----> 4
        */
        int shortestweight = djAlgo(graph, 0, 6, v);
        System.out.println("Shortest weight from 0 to 6: " + shortestweight);
    }

    private static int djAlgo(ArrayList<Edge>[] graph, int src, int dest, int v) {
        int[] dist = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.weight));
        pq.add(new Edge(src, src, 0)); 

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int currNode = current.destination;
            int currDist = current.weight;

            if (currNode == dest) {
                return currDist; 
            }

            for (Edge edge : graph[currNode]) {
                int neighbor = edge.destination;
                int newDist = currDist + edge.weight;

                if (newDist < dist[neighbor]) {
                    dist[neighbor] = newDist;
                    pq.add(new Edge(currNode, neighbor, newDist));
                }
            }
        }

        return -1; 
    }
}