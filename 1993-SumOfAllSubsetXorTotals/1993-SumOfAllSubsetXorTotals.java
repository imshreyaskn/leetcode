// Last updated: 5/25/2026, 4:27:23 PM
class Solution {
    public int subsetXORSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i : nums){
            sum|=i;
        }
        return sum<<n-1;   
    }
}