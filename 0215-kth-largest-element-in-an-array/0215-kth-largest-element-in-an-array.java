class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        
        for(int i=0; i<nums.length; i++){
            if(k==0 && pq.peek()<nums[i]){
                pq.poll();
                pq.offer(nums[i]);
            }else if(k>0){
                pq.offer(nums[i]);
                k--;
            }else{
                continue;
            }
        }
        return pq.poll();
    }
}