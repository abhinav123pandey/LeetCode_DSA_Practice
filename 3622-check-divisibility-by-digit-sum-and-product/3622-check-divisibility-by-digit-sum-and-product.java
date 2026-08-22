class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0, prod = 1;
        int temp = n;
        while(temp!=0){
            int dig = temp%10;
            sum+=dig;
            prod*=dig;
            temp/=10;
        }
        int d_sum = sum+prod;
        if(n%d_sum == 0) return true;
        else return false;
    }
}