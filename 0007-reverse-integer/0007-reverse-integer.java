class Solution {
    public int reverse(int x) {
        int reverse=0;
        int temp=x;
        while(temp!=0){
            int mod=temp%10;
            temp/=10;
            if(reverse>0 && reverse>(Integer.MAX_VALUE-mod)/10||reverse<0 && reverse<(Integer.MIN_VALUE-mod)/10)return 0;
            reverse=reverse*10+mod;
        }
        return reverse;
            }
}