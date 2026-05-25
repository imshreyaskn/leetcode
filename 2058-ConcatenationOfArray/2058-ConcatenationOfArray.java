// Last updated: 5/25/2026, 4:27:20 PM
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] n = new int[2*nums.length];
        for(int i = 0; i<nums.length;i++){
            n[i] = nums[i];
            n[(nums.length)+i] = nums[i];
        } 

        return n;
    }
}