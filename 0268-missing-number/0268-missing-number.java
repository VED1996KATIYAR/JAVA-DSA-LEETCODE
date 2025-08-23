class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int a=0;
        for(int i=0;i<l;i++){
            if(nums[i]==a){
                a+=1;
            }else{
                break;
            }
        }
        return a;
    }
}