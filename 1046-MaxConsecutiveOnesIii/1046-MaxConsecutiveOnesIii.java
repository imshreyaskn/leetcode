// Last updated: 5/25/2026, 4:27:50 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int count = 0;
        int max = 0;
        for(int i = 0; i<nums.length;i++){
            count+=nums[i];

            while((i-l+1)-count>k){
                count-=nums[l];
                l++;
            }

            max = Math.max(max,i-l+1);

        }

        return max;
    }
}