package Algorithms;
import java.util.*;

class Node implements Comparable<Node> {
    int vertex;
    int weight;

    Node(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }

    // For PriorityQueue to compare Node based on weight
    public int compareTo(Node other) {
        return this.weight - other.weight;
    }
}

public class Prims extends creatingGraph_Weighted{
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        undirectedGraph1(graph);   
        /*
               1 ---- 3
             / |      | \
            0  |      |  -- 5 -- 6
             \ |      | /
               2 ---- 4
        */
        System.out.println(primAlgo(graph, v));
    }

    private static int primAlgo(ArrayList<Edge> graph[], int v) {
        boolean visited[] = new boolean[v];
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[] key = new int[v];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;        
        pq.add(new Node(0, 0));
        int ans = 0;

        while (!pq.isEmpty()) {
            Node curr = pq.remove();
            if (visited[curr.vertex]) {
                continue;
            }
            ans += curr.weight;
            visited[curr.vertex] = true;

            for (int i = 0; i < graph[curr.vertex].size(); i++) {
                Edge e = graph[curr.vertex].get(i);
                int vertex = e.destination;
                int wt = e.weight;
                if (!visited[vertex] &&  wt < key[vertex]) {
                    key[vertex] = wt;
                    pq.add(new Node(vertex, wt));
                }
            }
        }
        return ans;
    }
}
