// Last updated: 5/25/2026, 4:29:09 PM
class Solution {
    public int search(int[] nums, int target) {

        int left = 0; 
        int middle = 0;
        int right = nums.length-1;

        while(left<=right){
            middle = (left+right)/2;

            if(nums[middle]==target){
                return middle;
            }else if(nums[middle]<target){
                left = middle+1;
            }else{
                right = middle-1;
            }
        }

        return -1;
        
    }
}