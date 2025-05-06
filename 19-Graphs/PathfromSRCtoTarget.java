import java.util.*;

// For given src & target, print all paths that exist from src to target
public class PathfromSRCtoTarget extends creatingGraph {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean vis[] = new boolean[v];
        createGraph2(graph);   
        /*
               1 --- 3
              /  \   | \             
             0    \  |  5 -- 6
              \    \ | /|
               2 --- 4  |    
               |        |
               >--------^             
        */
        int src = 0, tar = 6;
        printAllPath(graph, vis, src, "0", tar);

        /* All paths from 0 to 6:
            [0, 1, 3, 4, 2, 5, 6]
            [0, 1, 3, 4, 5, 6]
            [0, 1, 3, 5, 6]
            [0, 1, 4, 2, 5, 6]
            [0, 1, 4, 3, 5, 6]
            [0, 1, 4, 5, 6]
            [0, 2, 4, 3, 5, 6]
            [0, 2, 4, 5, 6]
            [0, 2, 5, 6]
        */
    }

    private static void printAllPath(ArrayList<Edge> graph[], boolean[] vis, int curr, String path, int tar) {
        if (curr == tar) {
            System.out.println("["+path+"]");
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true;
                printAllPath(graph, vis, e.dest, path+", "+e.dest, tar);
                vis[curr] = false;
            }
        }
    }


    public static void createGraph2(ArrayList<Edge> graph[]) {
        // I have created an Undirected graph.
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 0));           
        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 5));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5)); 

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }
}