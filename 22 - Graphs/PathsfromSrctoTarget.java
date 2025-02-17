import java.util.ArrayList;

public class PathsfromSrctoTarget extends implementation {
    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);   
        /*
               1 --- 3
              /      | \
             0       |  5 -- 6
              \      | /
               2 --- 4
        */
        int src = 0, tar = 5;
        printAllPath(graph, new boolean[v], src, "0", tar);
        
    }

    public static void printAllPath(ArrayList<Edge> graph[], boolean[] vis, int curr, String path, int tar) {
        if (curr == tar) {
            System.out.println(path);
            return;
        }

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                vis[curr] = true;
                printAllPath(graph, vis, e.dest, path+e.dest, tar);
                vis[curr] = false;
            }
        }
    }
}
