class Solution {
    public char[] reverseString(char[] s) {
        int l=s.length-1;
        for(int i=0;i<s.length/2;i++){
            char v=s[i];
            s[i]=s[l];
            s[l]=v;
            l--;
        }
        return s;
    }
}