// Last updated: 5/25/2026, 4:27:04 PM
class Solution {
    public int dominantIndices(int[] nums) {
        int count = 0;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1; i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        int n = nums.length;

        for(int i = 0; i<n-1;i++){
            double currSum = prefix[n-1] - prefix[i];
            double currAvg = currSum / (n-i-1);

            if(nums[i]>currAvg) count++;
        }

        return count;
        
    }
}