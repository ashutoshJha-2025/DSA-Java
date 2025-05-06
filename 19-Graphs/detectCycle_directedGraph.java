import java.util.ArrayList;

public class detectCycle_directedGraph extends creatingGraph_nonWeighted {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        directedGraph1(graph);
        /*      0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 ->7
                          ^         |
                          |         | 
                          -----------                              
        */
        if (isCycleDirected(graph, v)) {
            System.out.println("Cycle exists in the graph.");
        } else {
            System.out.println("No cycle in the graph.");
        }
    }

    private static boolean isCycleDirected(ArrayList<Edge>[] graph, int v) {
        boolean vis[] = new boolean[v];
        boolean recStack[] = new boolean[v]; 

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                if (dfsDirected(i, graph, vis, recStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfsDirected(int curr, ArrayList<Edge>[] graph, boolean[] vis, boolean[] recStack) {
        vis[curr] = true;
        recStack[curr] = true;

        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                if (dfsDirected(e.dest, graph, vis, recStack)) {
                    return true;
                }
            } else if (recStack[e.dest]) {
                return true; // cycle found
            }
        }

        recStack[curr] = false;
        return false;
    }
}
