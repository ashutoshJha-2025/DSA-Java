package Algorithms;

import java.util.ArrayList;

public class creatingGraph_Weighted {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int src, int dest, int wt) {
            this.source = src;
            this.destination = dest;
            this.weight = wt;
        }
    }

    public static void directedGraph1(ArrayList<Edge> graph[]) {
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
             \  v       | /
              ->2 ----> 4
        */
    }

    public static void undirectedGraph1(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1, 4));
        graph[1].add(new Edge(1, 0, 4));
    
        graph[0].add(new Edge(0, 2, 3));
        graph[2].add(new Edge(2, 0, 3));
    
        graph[1].add(new Edge(1, 2, 4));
        graph[2].add(new Edge(2, 1, 4));
    
        graph[1].add(new Edge(1, 3, 2));
        graph[3].add(new Edge(3, 1, 2));
    
        graph[2].add(new Edge(2, 4, 6));
        graph[4].add(new Edge(4, 2, 6));
    
        graph[3].add(new Edge(3, 5, 7));
        graph[5].add(new Edge(5, 3, 7));
    
        graph[4].add(new Edge(4, 3, 5));
        graph[3].add(new Edge(3, 4, 5));
    
        graph[4].add(new Edge(4, 5, 8));
        graph[5].add(new Edge(5, 4, 8));
    
        graph[5].add(new Edge(5, 6, 9));
        graph[6].add(new Edge(6, 5, 9));
    }
    
    public static void directedGraph2(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 4));
        graph[0].add(new Edge(0, 2, 3));

        graph[1].add(new Edge(1, 2, -4));
        graph[1].add(new Edge(1, 3, 2)); 
                                                                        
        graph[2].add(new Edge(2, 4, -6));

        graph[3].add(new Edge(3, 5, 7));

        graph[4].add(new Edge(4, 3, -5));
        graph[4].add(new Edge(4, 5, 8));

        graph[5].add(new Edge(5, 6, 9));

        /*
              ->1 ----> 3
             /  |       ^ \
            0   |       |  --> 5 --> 6
             \  v       | /
              ->2 ----> 4
        */
    }

}

