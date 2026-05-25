// Last updated: 5/25/2026, 4:27:40 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int l = 0;
        int count = 0;
        double sum = 0;


        for(int r = 0; r<arr.length;r++){
            sum+=arr[r];

            if(r-l+1>k){
                sum-=arr[l];
                l++;
            }

            if(r-l+1==k){
                if(sum/k>=threshold) count++;
            }
        }

        return count;

    }
}