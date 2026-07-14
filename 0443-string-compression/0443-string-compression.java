class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        int count = 1;
        int p = 0; // ye wala ham jo naye answers banayenge unki indexes ko track karne ke liye hai

        for(int i=1; i<=chars.length; i++){
            if(i==chars.length || chars[i]!=chars[i-1]){
                chars[p++]=chars[i-1];
                
                // agar count 10 se uper ho gaya to use 2 alag alag indexes pe rakhne ke liye
                if(count > 1){
                    for(char c : String.valueOf(count).toCharArray()){
                        chars[p++] = c;
                    }
                }
                count = 1;
            }else{
                count+=1;
            } 
        }
        return p;
    }
}