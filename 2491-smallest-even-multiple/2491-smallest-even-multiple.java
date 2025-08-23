class Solution {
    public int smallestEvenMultiple(int n) {
        int product=1;
        if(n%2==0){
            product*=n;
        }else{
            product=2*n;
        }
        return product;
    }
}