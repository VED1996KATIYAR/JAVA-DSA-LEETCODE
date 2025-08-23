class Solution {
    public int addDigits(int num) {
        int singledigit=0;
        if(num==0){
             singledigit=0;
        }else{
            singledigit=1+(num-1)%9;
        }
        return singledigit;
    }
}