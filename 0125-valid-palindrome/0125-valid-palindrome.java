class Solution {
    public boolean isPalindrome(String s) {
        String a="";
        s=s.toLowerCase();
        for(int i=0;i<=s.length()-1;i++){
            char b=s.charAt(i);
            int c=b-'0';
            if((b>='a'&& b<='z')||(c>=0 && c<=9)){
                a+=b;
            }
        }
        String c="";
        for(int j=a.length()-1;j>=0;j--){
            c+=a.charAt(j);
        }
        if(a.equals(c)){
            return true;
        }else{
            return false;
        }
    }
}