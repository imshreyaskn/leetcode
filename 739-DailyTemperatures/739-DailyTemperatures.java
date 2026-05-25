// Last updated: 5/25/2026, 4:29:13 PM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[]  answer =  new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i<n; i++){
            

            while( !stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int indx = stack.pop();
                answer[indx] = i-indx;
            }

            stack.push(i);
        }

        return answer;
    }
}