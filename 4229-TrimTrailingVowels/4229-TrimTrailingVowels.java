// Last updated: 5/25/2026, 4:27:02 PM
class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder(s);

        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        for(int i = s.length()-1; i>=0; i--){
            if(vowels.contains(s.charAt(i))){
                sb.setLength(sb.length()-1);
            }else{
                break;
            }
        }

        return sb.toString();
        
        
        
    }
}