// Last updated: 5/25/2026, 4:27:42 PM
class Solution {
    public int numberOfSteps(int num) {

        int steps = 0;

        while(num>0){
            if(num%2!=0){
                num--;
            }else if(num!=0){
                num/=2;
            }
            steps++;
        }


        return steps;
    }
}