class Solution {
    public boolean isThree(int n) {
        int ctr=0;
        for(int i=1;i<=n;i++){
            if(n % i ==0){
                ctr+=1;
            }
        }
        if(ctr == 3){
            return true;
        }else{
            return false;
        }
        
    }
}