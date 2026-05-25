// Last updated: 5/25/2026, 4:27:48 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {


        int left = 0;
        for (int weight : weights) {
            left = Math.max(left, weight);
        }


        int right = 0;
        for (int weight : weights) {
            right += weight;
        }

        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, days, mid)) {
              
                right = mid;
            } else {
               
                left = mid + 1;
            }
        }
        return left;
    }

    
    private boolean canShip(int[] weights, int days, int capacity) {
        int daysNeeded = 1;
        int currentWeight = 0;

        for (int weight : weights) {
            currentWeight += weight;
            if (currentWeight > capacity) {
                daysNeeded++;
                currentWeight = weight;
            }
        }
        return daysNeeded <= days;
    }
}