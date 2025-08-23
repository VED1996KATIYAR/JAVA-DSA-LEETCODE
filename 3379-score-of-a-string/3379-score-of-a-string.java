class Solution {
    public int scoreOfString(String s) {
        int n=s.length()-1;
        char a,b;
        int ascii,asciii=0;
        int differnce=0;
        int sum=0;
        int num=0;
        for(int i=0;i<=n;i++){
            
            if(i==n && i+1==n+1){
                break;
            }else{
                a=s.charAt(i);
                b=s.charAt(i+1);
                ascii=(int)a;
                asciii=(int)b;
                differnce=ascii-asciii;
                num=Math.abs(differnce);
                sum=sum+num;
                

            }
        }
     return sum;   
    }
}