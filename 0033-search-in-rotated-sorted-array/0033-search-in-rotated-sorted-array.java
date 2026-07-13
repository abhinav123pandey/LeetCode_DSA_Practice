class Solution {
    public int search(int[] arr, int t) {
        int lo = 0, hi = arr.length-1;

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == t) return mid;
            if(arr[lo]<=arr[mid]){
                //left part sorted hai
                if(arr[lo] <=t && arr[mid]>t){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }else{
                //right part
                if(arr[mid]<t && t<=arr[hi]){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
        }
        return -1;
    }
}