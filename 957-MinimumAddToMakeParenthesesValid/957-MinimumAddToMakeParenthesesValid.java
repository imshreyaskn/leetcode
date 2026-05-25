// Last updated: 5/25/2026, 4:28:03 PM
class Solution {
    public int minAddToMakeValid(String s) {
        int res = 0;
        int open = 0;

        for(char c : s.toCharArray()){
            if(c=='(') open++;
            else{
                if(open>0) open--;
                else res++;
            }
        }

        return open+res;
    }
}