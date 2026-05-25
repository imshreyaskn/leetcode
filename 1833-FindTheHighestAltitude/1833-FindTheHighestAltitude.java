// Last updated: 5/25/2026, 4:27:28 PM
class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int curr = 0;
        for(int i : gain){
            curr+=i;
            max = Math.max(max,curr);
        }

        return max;
    }
}