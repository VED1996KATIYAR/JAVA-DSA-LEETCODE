class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0)
        {
            return false;
        }
        int temp=n;
        while(temp!=1){
            if(temp % 2==0){
                temp/=2;
            }else{
                break;
            }
        }
        if(temp==1){
            return true;
        }else{
            return false;
        }
        
    }
}