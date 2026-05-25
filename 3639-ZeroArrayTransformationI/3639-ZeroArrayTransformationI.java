// Last updated: 5/25/2026, 4:27:03 PM
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] diff = new int[nums.length];

        for(int i = 0; i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];

            diff[start] -=1;
            if(end<diff.length-1) diff[end+1] +=1;
        }

        int currSum = 0;

        for(int i =0; i<diff.length;i++){
            currSum += diff[i];

            if(nums[i]+currSum >0){
                return false;
            }
        }

        return true;
    }
}