// Last updated: 5/25/2026, 4:27:19 PM
class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for(int i = 1; i<n; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }

        int left = 0;
        int right = 0;
        for(int i = 0; i<n; i++){
            if(i==0){
                left = 0;
            }else{
                left = prefix[i-1];
            }

            if(i==n-1){
                right=0;
            }else{
                right = prefix[n-1]-prefix[i];
            }

            if(left==right){
                return i;
            }
        }

        return -1;


    }
}