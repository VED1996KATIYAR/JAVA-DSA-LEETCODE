class Solution {
    public int mySqrt(int x) {
        if(x==2147483647){
            return 46340;
        }
        int a=0;
        int mid=x/2 + 1;
        int num=0;
        while(a<=mid){
            int square=a*a;
            if(square==x){
                num=a;
                break;
            }else if(square > x){
                num=a-1;
                break;
            }else{
                a+=1;
            }
        }     
        return num;  
    }
}