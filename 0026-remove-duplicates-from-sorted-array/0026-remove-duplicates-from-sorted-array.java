class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 0, fast = 1;

        while(fast<nums.length){
            if(nums[slow] != nums[fast]){
                slow+=1;
                nums[slow] = nums[fast];
            }
            fast+=1;
        }        
        return slow+1;
    }
}