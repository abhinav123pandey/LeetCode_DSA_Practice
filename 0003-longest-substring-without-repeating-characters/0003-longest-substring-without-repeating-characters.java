class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        int[] freq = new int[128];
        int res=0;
        while(j<s.length()){
            freq[s.charAt(j)]++;
            while(freq[s.charAt(j)]>1){
                freq[s.charAt(i)]--;
                i++;
            }
            res=Math.max(res,(j-i+1));
            j++;

        }
        return res;
    }
}