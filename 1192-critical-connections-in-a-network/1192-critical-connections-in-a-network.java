class Solution {
    public int[] low;
    public int[] dtime;
    public int timer;
    public boolean[] visited;
    public List<List<Integer>> adj;
    public List<List<Integer>> bridges;

    public void dfs(int node, int parent){
        visited[node] = true;
        low[node] = dtime[node] = timer++; 

        for(int n : adj.get(node)){
            if(n == parent) continue;

            if(!visited[n]){
                dfs(n, node);

                low[node] = Math.min(low[node], low[n]);
                if(low[n] > dtime[node]){
                    bridges.add(Arrays.asList(node, n));
                }
            }

            else{
                low[node] = Math.min(low[node], dtime[n]);
            }
        }
    }

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        adj = new ArrayList<>();
        timer = 1;
        dtime = new int[n];
        low = new int[n];
        visited = new boolean[n];
        bridges = new ArrayList<>();


        for(int i=0; i<n ; i++){
            adj.add(new ArrayList<>());
        }

        for(List<Integer> e : connections){
            int u = e.get(0);
            int v = e.get(1);

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for(int i=0; i<n ; i++){
            if(!visited[i]){
                dfs(i, -1);
            }
        }
        return bridges;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna