class Solution {
    public String toLowerCase(String s) {
        int n=s.length()-1;
        char b;
        String sum="";
        for(int i=0;i<=n;i++){
            b=s.charAt(i);
            if(b>='A'&& b<='Z'){
               char c=Character.toLowerCase(b);
               sum=sum+c;

            }else{
                sum=sum+b;
            }
        }return sum;
        
    }
}