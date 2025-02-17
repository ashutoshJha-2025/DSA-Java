import java.util.*;

public class DFS extends implementation {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean vis[] = new boolean[v];
        createGraph(graph);   
        /*
               1 --- 3
              /      | \
             0       |  5 -- 6
              \      | /
               2 --- 4
        */
        dfs(graph, 0, vis);
        System.out.println();
    }

    private static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.dest]==false) {
                dfs(graph, e.dest, vis);
            }
        }
    }
}

