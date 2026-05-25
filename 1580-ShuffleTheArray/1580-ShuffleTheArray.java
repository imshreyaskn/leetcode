// Last updated: 5/25/2026, 4:27:35 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] nw = new int[n+n];
        int temp = 0;
        for(int i = 0; i<nums.length;i=i+2){
            nw[i] = nums[temp];
            temp++;
        }
        temp = n;
        for(int i = 1; i<nums.length;i=i+2){
            nw[i] = nums[temp];
            temp++;
        }

        return nw;
    }
}