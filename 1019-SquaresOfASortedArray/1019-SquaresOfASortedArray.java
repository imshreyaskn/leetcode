// Last updated: 5/25/2026, 4:27:54 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] res = new int[nums.length];

        int last = nums.length-1;
        int right = nums.length-1;
        int left = 0;

        while(left<=right){
            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];

            if(rightVal>leftVal){
                res[last] = rightVal;
                right--;
                last--;
            }else{
                res[last] = leftVal;
                left++;
                last--;
            }

        }
        return res;
        
    }
}