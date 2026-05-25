// Last updated: 5/25/2026, 4:27:18 PM
class Solution {
    boolean[] visited;
    List<List<Integer>> graph;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        visited = new boolean[n];
        graph = new ArrayList<>();
        
        for(int i = 0; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return check(source,destination);


    }

    boolean check(int curr ,int destination){

        if(curr==destination) return true;


        visited[curr] = true;
        
        for(int nei : graph.get(curr)){
            if(!visited[nei]){
                if(check(nei,destination)) return true;
            }
        }

        return false;

    }
}