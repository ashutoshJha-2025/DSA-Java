import java.util.*;

public class DFS extends creatingGraph_nonWeighted {
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
        dfs(graph, 0, vis);
    }

    private static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr+" ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (vis[e.destination] == false) {
                dfs(graph, e.destination, vis);
            }
        }
    }
}
