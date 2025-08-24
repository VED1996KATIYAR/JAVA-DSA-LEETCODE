class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor == -1){return Integer.MAX_VALUE;}else{
        // int qt=0;
        // if(dividend == Integer.MIN_VALUE && divisor == -1){
        //     qt= Integer.MAX_VALUE;
        // }else{
        //      qt=dividend/divisor;
        // }
        // return qt;
        return dividend / divisor;
        }
    }
}