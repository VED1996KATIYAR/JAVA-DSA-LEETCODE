class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int ctr=0;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            for(int j=0;j<nums.length;j++){
                int tempo=nums[j];
                if(temp== tempo){
                    ctr+=1;
                }
            }
            if(ctr==1){
                sum=sum+temp;
                ctr=0;
            }else{
                ctr=0;
            }
        }
       return sum; 
    }
}