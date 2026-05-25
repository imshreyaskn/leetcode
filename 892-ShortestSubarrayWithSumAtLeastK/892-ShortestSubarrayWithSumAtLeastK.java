// Last updated: 5/25/2026, 4:29:07 PM
class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        Deque<Integer> dq = new LinkedList<>();
        int res = Integer.MAX_VALUE;

        for (int j = 0; j <= n; j++) {


            while (!dq.isEmpty() && prefix[j] - prefix[dq.peek()] >= k) {
                res = Math.min(res, j - dq.poll());
            }

         
            while (!dq.isEmpty() && prefix[j] <= prefix[dq.peekLast()]) {
                dq.pollLast();
            }

            dq.offer(j);
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}