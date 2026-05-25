// Last updated: 5/25/2026, 4:27:07 PM
class Solution {
    List<List<Integer>> graph;
    boolean visited[];
    public long countPairs(int n, int[][] edges) {
        
        graph = new ArrayList<>();
        for(int i = 0 ; i<n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] k : edges){
            graph.get(k[0]).add(k[1]);
            graph.get(k[1]).add(k[0]);
        }

        visited = new boolean[n];

        long ans = 0;
        int rem = n;

        for(int i = 0 ;i<n; i++){
            if(!visited[i]){
                int size = check(i,graph);
                ans += (long) size * (rem-size);
                rem -= size;
            }
        }

        return ans;

        

    }

    int check(int curr, List<List<Integer>> graph){

        visited[curr] = true;
        int count = 1;

        for(int nei : graph.get(curr)){
            if(!visited[nei]){
                count+= check(nei,graph);
            }
        }

        return count;
    }
}