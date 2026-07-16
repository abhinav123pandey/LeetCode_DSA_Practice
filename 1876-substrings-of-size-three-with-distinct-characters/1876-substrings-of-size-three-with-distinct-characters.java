class Solution {
    public int countGoodSubstrings(String s) {
        int j = 0, count = 0;

        for(int i = 2; i<s.length(); i++){
            char c1 = s.charAt(i-2);
            char c2 = s.charAt(i-1);
            char c3 = s.charAt(i);
            if(c1!=c2 && c2!=c3 && c3!=c1){
                count++;
            }
            if((i-j)+1 == 3){
                j++;
            }
        }
        return count;
    }
}