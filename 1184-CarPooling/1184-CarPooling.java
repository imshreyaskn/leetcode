// Last updated: 5/25/2026, 4:27:44 PM
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff = new int[1001];

        for(int i = 0 ; i<trips.length;i++){
            int start = trips[i][1];
            int end = trips[i][2];
            int val = trips[i][0];
            diff[start] +=val;
            diff[end]-= val;
        }

        int currSum = 0;
        for(int i : diff){
            currSum+=i;
            if(currSum>capacity){
                return false;
            }
        }

        return true;
    }
}