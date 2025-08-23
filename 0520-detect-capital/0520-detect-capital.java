class Solution {
    public boolean detectCapitalUse(String word) {
        int length=word.length();
        int ctr=0;
        int ctr1=0;
        int ctr2=0;
        for(int i=0;i<length;i++){
            char a=word.charAt(i);
            if(i==0 && a>='A' && a<='Z'){
                ctr+=1;
                ctr1+=1;
            }else if(a>='A' && a<='Z'){
                ctr1+=1;
            }else{
                ctr2+=1;
            }
        }
        if(ctr1==length || ctr2==length){
            return true;
        }else if(ctr==1 && ctr2==length-1){
            return true;
        }else{
            return false;
        }
        
    }
}