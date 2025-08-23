class Solution {
    public int romanToInt(String s) {
        int num=0;
        int result=0;
        for(int i=s.length()-1;i>=0;i--){    //loop to find length of roman no
            switch(s.charAt(i)){             //switch case to find value of num
                case'I':num=1;break;
                case'V':num=5;break;
                case'X':num=10;break;
                case'L':num=50;break;
                case'C':num=100;break;
                case'D':num=500;break;
                case'M':num=1000;break;
            }
            if(num*3<result){    //check if value of num*3 <result
                result-=num;
            }else{           
                result+=num;
            }
        }return result;
        
    }
}