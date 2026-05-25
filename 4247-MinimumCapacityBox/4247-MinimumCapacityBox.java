// Last updated: 5/25/2026, 4:27:05 PM
class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int min = Integer.MAX_VALUE;
        int indx = -1;
        for(int i =0;i<capacity.length;i++){
            if(capacity[i]>=itemSize && capacity[i]<min ){
                min=capacity[i];
                indx = i;
            }
        }

        return indx;
    }
}