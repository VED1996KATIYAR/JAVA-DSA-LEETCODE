class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        int ctr=0;
        if(num==0){
            return true;
        }
        for(int i=0;i<num;i++){
            int temp=i;
            int tempo=0;
            while(temp!=0){
                int mod=temp % 10;
                tempo=(tempo * 10) +mod;
                temp/=10;
                
            }
            if((i+tempo)==num){
                ctr+=1;
            }
        }
        if(ctr>=1){
            return true;
        }else{
            return false;
        }
        
    }
}