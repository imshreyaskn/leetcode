// Last updated: 5/25/2026, 4:27:55 PM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        int count = 0;
        for(int i = 1; i<nums.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        Map<Integer,Integer> M = new HashMap<>();
        M.put(0,1);

        for(int i =0; i<prefix.length;i++){
            int rem = Math.abs(((prefix[i]%k)+k)%k);
            if(M.containsKey(rem)){
                count+=M.get(rem);
            }

            M.put(rem,M.getOrDefault(rem,0)+1);
        }

        return count;

    }
}