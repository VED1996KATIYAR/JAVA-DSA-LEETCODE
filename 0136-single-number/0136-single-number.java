class Solution {
    public int singleNumber(int[] nums) {
        int ctr=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    ctr+=1;
                }
            }
            if(ctr==1){
                a= nums[i];
                break;
            }else{
                ctr=0;
            }
        }
        return a;
    }
}