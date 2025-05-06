import java.util.*;

<<<<<<< HEAD
public class DFS extends creatingGraph {
=======
public class DFS extends creatingGraph_nonWeighted {
>>>>>>> 5df93d4 (update)
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean vis[] = new boolean[v];
<<<<<<< HEAD
        createGraph1(graph);   
=======
        undirectedGraph1(graph);   
>>>>>>> 5df93d4 (update)
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
            if (vis[e.dest] == false) {
                dfs(graph, e.dest, vis);
            }
        }
    }
}
