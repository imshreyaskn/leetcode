// Last updated: 5/25/2026, 4:28:07 PM
class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        int l = 0;

        Map<Integer,Integer> m = new HashMap<>(); 

        for(int r = 0; r<fruits.length; r++){
            m.put(fruits[r],m.getOrDefault(fruits[r],0)+1);

            while(m.size()>2){
                m.put(fruits[l],m.get(fruits[l])-1);
                if(m.get(fruits[l])==0){
                    m.remove(fruits[l]);
                }
                l++;
            }

            max = Math.max(max,r-l+1);
        }

        return max;
    }
}