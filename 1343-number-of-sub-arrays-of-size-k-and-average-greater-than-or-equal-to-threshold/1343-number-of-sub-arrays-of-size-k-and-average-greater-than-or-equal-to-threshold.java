class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int l = 0, sum = 0, count = 0;
        for(int r=0; r<arr.length; r++){
            sum+=arr[r];

            if((r-l)+1==k){
                if((sum/k)>=t){
                    count++;
                }
                sum -= arr[l];
                l++; 
            }
        }
        return count;
    }
}