import java.util.*;

public class BFS extends creatingGraph_nonWeighted{
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        undirectedGraph1(graph);   
        /*
               1 --- 3
              /      | \
             0       |  5 -- 6
              \      | /
               2 --- 4
        */
        bfs(graph, v);
    }

    private static void bfs(ArrayList<Edge> graph[], int v) {
        Queue<Integer> q = new LinkedList<>(); 
        boolean vis[] = new boolean[v];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (vis[curr] == false) {
                System.out.print(curr+" ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
}
