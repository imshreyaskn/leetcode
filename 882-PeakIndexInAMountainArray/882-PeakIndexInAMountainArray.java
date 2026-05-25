// Last updated: 5/25/2026, 4:29:05 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        

        int m;
        int l = 0;
        int r = arr.length -1;

        while(l<r){
            m = (l+r)/2;

            if(arr[m+1]>arr[m]){
                l = m+1;
            }else{
                r = m;
            }
        }

        return r;
    }
}
