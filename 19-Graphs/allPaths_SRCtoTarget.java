import java.util.*;

public class allPaths_SRCtoTarget extends creatingGraph_nonWeighted {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean vis[] = new boolean[v];
         undirectedGraph1(graph);   
        /*
               1 --- 3
              /      | \
             0       |  5 -- 6
              \      | /
               2 --- 4
        */
        int src = 0, tar = 6;
        printAllPath(graph, vis, src, "0", tar);
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
}
