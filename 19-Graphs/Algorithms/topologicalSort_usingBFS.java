package Algorithms;
import java.util.*;

public class topologicalSort_usingBFS extends creatingGraph_Weighted{
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
        System.out.println(topoSort(graph, v));
    }

    private static ArrayList<Integer> topoSort(ArrayList<Edge> graph[], int v) {
        int[] inDegree = new int[v];
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                inDegree[e.destination]++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        bfs(graph, ans, inDegree);
        return ans;
    }

    private static void bfs(ArrayList<Edge>[] graph, ArrayList<Integer> ans, int[] inDegree) {
        Queue<Integer> q = new LinkedList<>();
        for (int j = 0; j < inDegree.length; j++) {
            if (inDegree[j]==0) {
                q.add(j);
            }
        }
        while (!q.isEmpty()) {
            int curr = q.poll();
            ans.add(curr);

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (--inDegree[e.destination]==0) {
                    q.add(e.destination);
                }
            }
        }
    }
}
