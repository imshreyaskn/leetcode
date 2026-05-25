// Last updated: 5/25/2026, 4:27:43 PM
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] result = new int[n];

        for(int i = 0; i<bookings.length;i++){
            result[bookings[i][0]-1] += bookings[i][2];
            if(bookings[i][1]<n){
              result[bookings[i][1]] -= bookings[i][2];
            }
        }

        for(int i = 1; i<result.length;i++){
            result[i] = result[i-1]+result[i];
        }

        return result;
        
    }
}