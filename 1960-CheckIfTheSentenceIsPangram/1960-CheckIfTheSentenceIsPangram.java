// Last updated: 5/25/2026, 4:27:25 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() <26)
            return false;

        for(char ch ='a'; ch<='z'; ch++){
            if(!sentence.contains(ch+"")){
                return false;
            }
        }
        return true;

    }
}