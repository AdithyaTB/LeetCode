class Solution {
    int res;
    ArrayList<ArrayList<Integer>>adj;
    long DFS(int node, int parent, int[] values, int k){
        long total = values[node];
        for (int nei : adj.get(node)){
            if (nei == parent)
                continue;
            total += DFS(nei, node, values, k);
        }
        if (total % k == 0){
            res++;
            return 0;
        }
        return total;
    }
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        adj = new ArrayList<>();
        for (int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        res = 0;
        DFS(0, -1, values, k);
        return res;
    }
}
