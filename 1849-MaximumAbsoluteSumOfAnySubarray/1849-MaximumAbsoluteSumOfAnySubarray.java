// Last updated: 5/25/2026, 4:27:27 PM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currSum = nums[0];
        int max = nums[0];
        int currDiff = nums[0];
        int min = nums[0];

        int best = Math.abs(nums[0]);

        for(int i = 1; i<nums.length; i++){
            currSum = Math.max(nums[i],currSum+nums[i]);
            max = Math.max(max,currSum);
            currDiff = Math.min(nums[i],currDiff+nums[i]);
            min = Math.min(min,currDiff);
            best = Math.max(Math.abs(max),Math.abs(min));
        }

        return best;
    }
}