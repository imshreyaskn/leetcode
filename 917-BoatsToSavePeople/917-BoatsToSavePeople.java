// Last updated: 5/25/2026, 4:28:09 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i =0;
        int j = people.length-1;
        int count = 0;

        while(i<=j){
            if(people[i] + people[j] <= limit ){
                count++;
                i++;
                j--;
            }else{
                count++;
                j--;
            }
        }
        return count;
    }
}