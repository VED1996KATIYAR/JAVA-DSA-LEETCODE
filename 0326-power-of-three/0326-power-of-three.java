class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n!=1){
            if(n%3==0){
                n/=3;
            }else{
                break;
            }
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    }
}