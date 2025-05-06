package Algorithm;

import java.util.ArrayList;

public class createWeightedGraph {
    static class Edge {
        int src;
        int dest;
        int distance;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.distance = w;
        }
    }

    public static void createGraph3(ArrayList<Edge> graph[]) {
        // I have created an directed-Weighted graph.
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 3));

        graph[1].add(new Edge(1, 2, 4));
        graph[1].add(new Edge(1, 3, 2)); 
                                                                        
        graph[2].add(new Edge(2, 4, 6));

        graph[3].add(new Edge(3, 5, 7));

        graph[4].add(new Edge(4, 3, 5));
        graph[4].add(new Edge(4, 5, 8));

        graph[5].add(new Edge(5, 6, 9));

        /*
              ->1 ----> 3
             /  |       ^ \
            0   |       |  --> 5 --> 6
             \  !       | /
              ->2 ----> 4
        */
    }
}
