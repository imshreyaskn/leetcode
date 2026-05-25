// Last updated: 5/25/2026, 4:27:16 PM
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        // For 'T'
        int maxT = getMax(answerKey, k, 'T');
        // For 'F'
        int maxF = getMax(answerKey, k, 'F');
        
        return Math.max(maxT, maxF);
    }
    
    private int getMax(String answerKey, int k, char target) {
        int max = 0;
        int count = 0;
        int l = 0;
        int r = 0;
        int len = answerKey.length();
        int changes = 0;
        
        while(r < len){
            if(answerKey.charAt(r) == target){
                count++;
                r++;
            } else if(changes < k){
                count++;
                changes++;
                r++;
            } else {
                max = Math.max(max, count);
                
                // Move left pointer to free up a change
                while(l < len && answerKey.charAt(l) == target){
                    l++;
                    count--;
                }
                
                // Now we're at a non-target character that we changed
                if(l < len){
                    l++;
                    count--;
                    changes--;
                }
            }
        }
        
        return Math.max(max, count);
    }
}