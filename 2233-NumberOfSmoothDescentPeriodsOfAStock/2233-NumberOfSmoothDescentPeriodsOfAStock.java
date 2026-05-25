// Last updated: 5/25/2026, 4:27:12 PM
class Solution {
    public long getDescentPeriods(int[] prices) {
        long count = 0;
        int sum = 0;
        int l = 0;
        for(int i = 0; i<prices.length;i++){
            

            if(i>0 && prices[i-1]-prices[i]==1){
                count += i-l+1;
            }else{
                count+=1;
                l=i; 
            }

        }

        return count;
    }
}