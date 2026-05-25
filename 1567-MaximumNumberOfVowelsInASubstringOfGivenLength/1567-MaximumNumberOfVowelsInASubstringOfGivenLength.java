// Last updated: 5/25/2026, 4:27:36 PM
class Solution {
    public int maxVowels(String s, int k) {
        
        Set<Character> Vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        int max = 0;
        int count = 0;
        
        for(int i = 0; i<s.length();i++){

            

            if(Vowels.contains(s.charAt(i))){
                count++;
            }

            if(i>=k && Vowels.contains(s.charAt(i-k))){
                count--;
            }

            if(i>=k-1){
                max = Math.max(count,max);
            }
        }

        return max;









    }
}