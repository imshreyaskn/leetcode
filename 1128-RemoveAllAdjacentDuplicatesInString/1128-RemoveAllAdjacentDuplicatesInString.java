// Last updated: 5/25/2026, 4:27:46 PM
import java.util.Stack;

class Solution {
    public String removeDuplicates(String s) {
        int size = s.length();
        char[] charArr = s.toCharArray(); 
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i<size; i++){
            if(!stk.isEmpty() && stk.peek()==charArr[i]){
                stk.pop();
            }else{
                stk.push(charArr[i]);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char c : stk){
            sb.append(c);
        }

        return sb.toString();

    }
}