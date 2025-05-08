package Algorithms;
import java.util.*;

public class topologicalSort_usingDFS extends creatingGraph_Weighted {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        directedGraph1(graph);   
        /*
              ->1 ----> 3
             /  |       ^ \
            0   |       |  --> 5 --> 6
             \  v       | /
              ->2 ----> 4
        */
        System.out.println(Arrays.toString(topoSort(graph, v)));
    }

    private static int[] topoSort(ArrayList<Edge> graph[], int v) {
        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfs(graph, st, visited, i);
            }
        }
        int ans[] = new int[v];
        int i = 0;
        while (!st.isEmpty()) {
            ans[i++] = st.pop();
        }
        return ans;
    }

    private static void dfs(ArrayList<Edge> graph[],Stack<Integer> st, boolean[] visited, int i) {
        visited[i] = true;

        for (int j = 0; j < graph[i].size(); j++) {
            Edge e = graph[i].get(j);
            if (!visited[e.destination]) {
                dfs(graph, st, visited, e.destination);
            }
        }
        st.push(i);
    }
}
