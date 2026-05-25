// Last updated: 5/25/2026, 4:28:06 PM
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int curr = 0;
        int right = nums.length - 1;

        while (curr <= right) {
            if (nums[curr] % 2 == 0) { 
                int temp = nums[curr];
                nums[curr] = nums[left];
                nums[left] = temp;
                left++;
                curr++;
            } else {             
                int temp = nums[curr];
                nums[curr] = nums[right];
                nums[right] = temp;
                right--;

            }
        }
        return nums;
    }
}
