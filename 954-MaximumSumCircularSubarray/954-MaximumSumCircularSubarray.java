// Last updated: 5/25/2026, 4:28:04 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        for(int i : nums){
            total+=i;
        }

        int currMax = nums[0];
        int currMin = nums[0];
        int Max = nums[0];
        int Min = nums[0];

        for(int i = 1; i<nums.length; i++){
            
            currMax = Math.max(currMax+nums[i],nums[i]);
            currMin = Math.min(currMin+nums[i],nums[i]);

            Max = Math.max(Max,currMax);
            Min = Math.min(Min,currMin);
        }

        int best = Math.max(total-Min,Max);

        if(best<=0) return Max;

        return best;

    }
}