class Solution {
    public int arraySign(int[] nums) {
        int k=0;
        int p=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                p*=nums[i];
            }else if(nums[i]<0){
                p*=-1;
            }else{
                p*=1;
            }
        }
        if(p==0){
            return k;
        }else if(p==1){
            k=1;
        }else{
            k=-1;
        }
        return k;
    }
}