class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] sorted = new int[n];


        int l=0, r=n-1, p=n-1;
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                sorted[p] = nums[l]*nums[l];
                l++;
            }else{
                sorted[p] = nums[r]*nums[r];
                r--;
            }
            p--;
        }
        return sorted;
    }
}