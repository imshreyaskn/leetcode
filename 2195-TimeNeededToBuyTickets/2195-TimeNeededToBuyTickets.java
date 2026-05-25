// Last updated: 5/25/2026, 4:27:15 PM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int n = tickets.length;

        while(tickets[k]!=0){
            for(int i = 0; i<tickets.length;i++){
                if(tickets[i]!=0){
                    time++;
                    tickets[i]--;
                }

                if(tickets[k]==0){
                    return time;
                }
            }
        }        

        return time;
    }
}
