import java.util.ArrayList;

public class detectCycle_undirectedGraph extends creatingGraph_nonWeighted {
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
        
        if (isCycle(graph, v)) {
            System.out.println("Cycle exists in the graph.");
        } else {
            System.out.println("No cycle in the graph.");
        }
    }

    private static boolean isCycle(ArrayList<Edge> graph[], int v) {
        boolean[] vis = new boolean[v];
        for (int i = 0; i < v; i++) {
            if(!vis[i]) {
                if(dfs(i, graph, vis, -1)) return true;
            }
        }
        return false;
    }

    private static boolean dfs(int curr, ArrayList<Edge> graph[], boolean[] vis, int parent) {
        vis[curr] = true;

        for (Edge e : graph[curr]) {
            int neighbor = e.destination;

            if (!vis[neighbor]) {
                if (dfs(neighbor, graph, vis, curr)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true; // cycle found
            }
        }

        return false;
    }

}