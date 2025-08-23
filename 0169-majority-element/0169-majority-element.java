class Solution {
    public int majorityElement(int[] nums) {
        int n=0;
        if(nums.length % 2==0){
            n=nums.length/2;           
        }else{
            n=(nums.length/2)+1;
        }
        int ctr=0;
        int v=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    ctr+=1;
                }
            }
            if(ctr>=n){
                v=nums[i];
                break;
            }else{
                ctr=0;
            }
        }
        return v;
    }
}