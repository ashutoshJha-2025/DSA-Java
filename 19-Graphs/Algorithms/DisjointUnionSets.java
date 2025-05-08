package Algorithms;

public class DisjointUnionSets {
    int[] parent;
    int[] rank;

    public DisjointUnionSets(int n) {
        rank = new int[n];
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public static void main(String[] args) {
        DisjointUnionSets ds = new DisjointUnionSets(5);
        ds.union(0, 1);
        ds.union(1, 2);

        System.out.println(ds.find(0)); // Might print 0
        System.out.println(ds.find(2)); // Should return same root as 0
    }

    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    private void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY)
            return;

        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }
}
