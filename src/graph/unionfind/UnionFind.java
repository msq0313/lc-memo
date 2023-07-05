package graph.unionfind;

public class UnionFind {
    private int count;
    private final int[] parent;

    public UnionFind(int n) {
        count = n;
        parent = new int[n];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    public int getCount() {
        return count;
    }

    public void union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA == rootB) {
            return;
        }
        parent[rootA] = rootB;
        count--;
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public boolean connected(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        return rootA == rootB;
    }
}
