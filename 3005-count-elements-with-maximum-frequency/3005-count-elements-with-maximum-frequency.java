class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer>freq = new HashMap<>();

        for(int i : nums){
            freq.put(i, freq.getOrDefault(i,0)+1);
        }

        int max = 0;
        for(int i : freq.values()){
            max = Math.max(i, max);
        }
        int ans = 0;
        for(int i : freq.values()){
            if(max == i){
                ans+=max;
            }
        }
        return ans;
    }
}