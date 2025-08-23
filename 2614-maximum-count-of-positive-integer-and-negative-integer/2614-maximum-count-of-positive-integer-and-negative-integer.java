class Solution {
    public int maximumCount(int[] nums) {
        int positive=0;
        int negative=0;
        int index=-1;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]>0){
                positive++;
            }if(nums[i]<0){
                negative++;
            }
        }
        if(positive>negative){
            index=positive;
        }else{
            index=negative;
        }
        return index;
    }
}