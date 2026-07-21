class MedianFinder {
    PriorityQueue<Integer>scnd = new PriorityQueue<>();
    PriorityQueue<Integer>fst = new PriorityQueue<>(Collections.reverseOrder());
    int sz;
    public MedianFinder() {
        sz=0;
    }
    
    public void addNum(int num) {
        if(scnd.size()>0 && num <= scnd.peek()){
            fst.offer(num);
        }else{
            scnd.offer(num);
        }
        while(!fst.isEmpty() && fst.size()>scnd.size()){
            scnd.offer(fst.poll());
        }
        while(!scnd.isEmpty() && scnd.size()-fst.size()>1){
            fst.offer(scnd.poll());
        }
        sz++;
    }
    
    public double findMedian() {
        if(sz%2==0){
            double a = (double)fst.peek();
            double b = (double)scnd.peek();

            return (a+b)/2;
        }else{
            return (double)scnd.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */