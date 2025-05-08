package Algorithms;
import java.util.*;

public class BellmanFord extends creatingGraph_Weighted {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        directedGraph2(graph);   
        /*
              ->1 ----> 3
             /  |       ^ \
            0   |       |  --> 5 --> 6
             \  v       | /
              ->2 ----> 4
        */
        int shortestweight = bfAlgo(graph, v);
        System.out.println("Shortest weight from 0 to 6: " + shortestweight);
    }

    private static int bfAlgo(ArrayList<Edge> graph[], int v) {
        int distance[] = new int[v];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                int src = e.source;
                int dest = e.destination;
                int weight = e.weight;

                if (distance[src] != Integer.MAX_VALUE && distance[src] + weight <distance[dest]) {
                    distance[dest] = distance[src] + weight;
                }
            }
        }
        int i=0;
        for (int j = 0; j < graph[i].size(); j++) {
            Edge e = graph[i].get(j);
            int src = e.source;
            int dest = e.destination;
            int weight = e.weight;
            i++;

            if (distance[src] != Integer.MAX_VALUE && distance[src] + weight <distance[dest]) {
                return -1;
            }
        }
        return distance[6];
    }
}
