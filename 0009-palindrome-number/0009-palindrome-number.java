class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){     //check wheter no is negative or not
            return false;
        }
        if(x==0){   //check whether no is 0 or not
            return true;
        }
        
        int temp=x; //steps to find no is whether palindrome or not
        int sum=0;
        while(temp!=0){
            int mod=temp%10;
            sum=(sum*10)+mod;
            temp/=10;
        }
        if(sum==x){
            return true;
        }else{
            return false;
        }
    }
}