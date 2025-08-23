class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        int pro[]={2,3,5};
        for(int i=0;i<pro.length;i++){
            while(n%pro[i]==0){
                n/=pro[i];
            }
        }
        return n==1;
    }
}