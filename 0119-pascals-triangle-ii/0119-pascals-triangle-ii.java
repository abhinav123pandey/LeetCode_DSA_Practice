class Solution {
    public List<Integer> getRow(int r) {
        List<Integer>l = new ArrayList<>();
        l.add(1);
        for(int i=1; i<=r; i++){
            List<Integer>list=new ArrayList<>();
            list.add(1);
            for(int j=1; j<l.size(); j++){
                list.add(l.get(j-1)+l.get(j));
            }
            list.add(1);
            l=list;
        }
        return l;
    }
}